package dk.sdu.mmmi.mdsd.generator;

import com.google.common.collect.Iterators;
import dk.sdu.mmmi.mdsd.math.Div;
import dk.sdu.mmmi.mdsd.math.Expression;
import dk.sdu.mmmi.mdsd.math.ExternalCall;
import dk.sdu.mmmi.mdsd.math.LetBinding;
import dk.sdu.mmmi.mdsd.math.MathNumber;
import dk.sdu.mmmi.mdsd.math.Minus;
import dk.sdu.mmmi.mdsd.math.Mult;
import dk.sdu.mmmi.mdsd.math.Parenthesis;
import dk.sdu.mmmi.mdsd.math.Plus;
import dk.sdu.mmmi.mdsd.math.VariableUse;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class ExpressionGenerator {
  private static Map<String, Stack<Expression>> localVars = new HashMap<String, Stack<Expression>>();
  
  private static Stack<LetBinding> letStatements = new Stack<LetBinding>();
  
  private static Map<LetBinding, String> letNames = new HashMap<LetBinding, String>();
  
  private static int letNum = 1;
  
  private static Set<String> localDeclared = new HashSet<String>();
  
  public static void reset() {
    ExpressionGenerator.localVars.clear();
    ExpressionGenerator.letStatements.clear();
    ExpressionGenerator.letNames.clear();
    ExpressionGenerator.letNum = 1;
    ExpressionGenerator.localDeclared.clear();
  }
  
  public static String generateStatements(final Expression exp) {
    ExpressionGenerator.reset();
    ExpressionGenerator.scanForLetBindings(exp);
    String lets = "";
    while ((ExpressionGenerator.letStatements.size() > 0)) {
      String _lets = lets;
      String _generateLetCode = ExpressionGenerator.generateLetCode(ExpressionGenerator.letStatements.pop());
      lets = (_lets + _generateLetCode);
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(lets);
    _builder.newLineIfNotEmpty();
    _builder.append("return ");
    String _generateJavaCode = ExpressionGenerator.generateJavaCode(exp, null);
    _builder.append(_generateJavaCode);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  private static void scanForLetBindings(final Expression exp) {
    boolean _matched = false;
    if (exp instanceof Plus) {
      _matched=true;
      ExpressionGenerator.scanForLetBindings(((Plus)exp).getLeft());
      ExpressionGenerator.scanForLetBindings(((Plus)exp).getRight());
    }
    if (!_matched) {
      if (exp instanceof Minus) {
        _matched=true;
        ExpressionGenerator.scanForLetBindings(((Minus)exp).getLeft());
        ExpressionGenerator.scanForLetBindings(((Minus)exp).getRight());
      }
    }
    if (!_matched) {
      if (exp instanceof Mult) {
        _matched=true;
        ExpressionGenerator.scanForLetBindings(((Mult)exp).getLeft());
        ExpressionGenerator.scanForLetBindings(((Mult)exp).getRight());
      }
    }
    if (!_matched) {
      if (exp instanceof Div) {
        _matched=true;
        ExpressionGenerator.scanForLetBindings(((Div)exp).getLeft());
        ExpressionGenerator.scanForLetBindings(((Div)exp).getRight());
      }
    }
    if (!_matched) {
      if (exp instanceof Parenthesis) {
        _matched=true;
        ExpressionGenerator.scanForLetBindings(((Parenthesis)exp).getExp());
      }
    }
    if (!_matched) {
      if (exp instanceof ExternalCall) {
        _matched=true;
        final Consumer<Expression> _function = (Expression it) -> {
          ExpressionGenerator.scanForLetBindings(it);
        };
        ((ExternalCall)exp).getArguments().forEach(_function);
      }
    }
    if (!_matched) {
      if (exp instanceof LetBinding) {
        _matched=true;
        String _name = ((LetBinding)exp).getName();
        String _plus = ("adding " + _name);
        System.out.println(_plus);
        ExpressionGenerator.addToLocalVars(((LetBinding)exp));
        ExpressionGenerator.letStatements.push(((LetBinding)exp));
        System.out.println(ExpressionGenerator.letStatements.size());
        ExpressionGenerator.letNames.put(((LetBinding)exp), ("let" + Integer.valueOf(ExpressionGenerator.letNum)));
        ExpressionGenerator.letNum++;
        ExpressionGenerator.scanForLetBindings(((LetBinding)exp).getBinding());
        ExpressionGenerator.scanForLetBindings(((LetBinding)exp).getBody());
      }
    }
  }
  
  private static void addToLocalVars(final LetBinding bind) {
    boolean _containsKey = ExpressionGenerator.localVars.containsKey(bind.getName());
    boolean _not = (!_containsKey);
    if (_not) {
      String _name = bind.getName();
      Stack<Expression> _stack = new Stack<Expression>();
      ExpressionGenerator.localVars.put(_name, _stack);
    }
    ExpressionGenerator.localVars.get(bind.getName()).push(bind.getBinding());
  }
  
  private static Set<String> listLocalVars(final EObject eobj) {
    final HashSet<String> available = CollectionLiterals.<String>newHashSet();
    EObject obj = eobj.eContainer();
    while ((obj != null)) {
      boolean _matched = false;
      if (obj instanceof LetBinding) {
        _matched=true;
        available.add(((LetBinding)obj).getName());
        obj = ((LetBinding)obj).eContainer();
      }
      if (!_matched) {
        obj = obj.eContainer();
      }
    }
    return available;
  }
  
  private static String generateLetCode(final LetBinding bind) {
    final Set<String> availableVars = ExpressionGenerator.listLocalVars(bind.getBody());
    final Function1<VariableUse, String> _function = (VariableUse it) -> {
      return it.getRef().getName();
    };
    final Set<String> required = IteratorExtensions.<String>toSet(IteratorExtensions.<VariableUse, String>map(Iterators.<VariableUse>filter(bind.eAllContents(), VariableUse.class), _function));
    String code = "";
    for (final String reqVar : required) {
      if ((availableVars.contains(reqVar) && ExpressionGenerator.localVars.containsKey(reqVar))) {
        final Expression exp = ExpressionGenerator.localVars.get(reqVar).pop();
        String _code = code;
        StringConcatenation _builder = new StringConcatenation();
        {
          boolean _contains = ExpressionGenerator.localDeclared.contains(reqVar);
          boolean _not = (!_contains);
          if (_not) {
            _builder.append("int ");
          }
        }
        _builder.append(reqVar);
        _builder.append(" = ");
        String _generateJavaCode = ExpressionGenerator.generateJavaCode(exp, ExpressionGenerator.listLocalVars(bind));
        _builder.append(_generateJavaCode);
        _builder.append(";");
        String _plus = (_builder.toString() + "\n");
        code = (_code + _plus);
        ExpressionGenerator.localDeclared.add(reqVar);
        int _size = ExpressionGenerator.localVars.get(reqVar).size();
        boolean _equals = (_size == 0);
        if (_equals) {
          ExpressionGenerator.localVars.remove(reqVar);
        }
      }
    }
    String _code_1 = code;
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("int ");
    String _get = ExpressionGenerator.letNames.get(bind);
    _builder_1.append(_get);
    _builder_1.append(" = ");
    String _generateJavaCode_1 = ExpressionGenerator.generateJavaCode(bind.getBody(), ExpressionGenerator.listLocalVars(bind.getBody()));
    _builder_1.append(_generateJavaCode_1);
    String _plus_1 = (_builder_1.toString() + ";\n");
    code = (_code_1 + _plus_1);
    return code;
  }
  
  private static String generateJavaCode(final Expression exp, final Set<String> localVars) {
    String _switchResult = null;
    boolean _matched = false;
    if (exp instanceof Plus) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      String _generateJavaCode = ExpressionGenerator.generateJavaCode(((Plus)exp).getLeft(), localVars);
      _builder.append(_generateJavaCode);
      _builder.append(" + ");
      String _generateJavaCode_1 = ExpressionGenerator.generateJavaCode(((Plus)exp).getRight(), localVars);
      _builder.append(_generateJavaCode_1);
      _switchResult = _builder.toString();
    }
    if (!_matched) {
      if (exp instanceof Minus) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _generateJavaCode = ExpressionGenerator.generateJavaCode(((Minus)exp).getLeft(), localVars);
        _builder.append(_generateJavaCode);
        _builder.append(" - ");
        String _generateJavaCode_1 = ExpressionGenerator.generateJavaCode(((Minus)exp).getRight(), localVars);
        _builder.append(_generateJavaCode_1);
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof Mult) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _generateJavaCode = ExpressionGenerator.generateJavaCode(((Mult)exp).getLeft(), localVars);
        _builder.append(_generateJavaCode);
        _builder.append(" * ");
        String _generateJavaCode_1 = ExpressionGenerator.generateJavaCode(((Mult)exp).getRight(), localVars);
        _builder.append(_generateJavaCode_1);
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof Div) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _generateJavaCode = ExpressionGenerator.generateJavaCode(((Div)exp).getLeft(), localVars);
        _builder.append(_generateJavaCode);
        _builder.append(" / ");
        String _generateJavaCode_1 = ExpressionGenerator.generateJavaCode(((Div)exp).getRight(), localVars);
        _builder.append(_generateJavaCode_1);
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof MathNumber) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        int _value = ((MathNumber)exp).getValue();
        _builder.append(_value);
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof Parenthesis) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        String _generateJavaCode = ExpressionGenerator.generateJavaCode(((Parenthesis)exp).getExp(), localVars);
        _builder.append(_generateJavaCode);
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof VariableUse) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        {
          if (((localVars == null) || (!localVars.contains(((VariableUse)exp).getRef().getName())))) {
            _builder.append("this.");
          }
        }
        String _name = ((VariableUse)exp).getRef().getName();
        _builder.append(_name);
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof ExternalCall) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("external.");
        String _name = ((ExternalCall)exp).getMethod().getName();
        _builder.append(_name);
        _builder.append("(");
        {
          EList<Expression> _arguments = ((ExternalCall)exp).getArguments();
          boolean _hasElements = false;
          for(final Expression arg : _arguments) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            String _generateJavaCode = ExpressionGenerator.generateJavaCode(arg, localVars);
            _builder.append(_generateJavaCode);
          }
        }
        _builder.append(")");
        _switchResult = _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof LetBinding) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _get = ExpressionGenerator.letNames.get(exp);
        _builder.append(_get);
        _switchResult = _builder.toString();
      }
    }
    return _switchResult;
  }
}
