package dk.sdu.mmmi.mdsd.generator;

import com.google.common.collect.Iterators;
import dk.sdu.mmmi.mdsd.x21.DataAccess;
import dk.sdu.mmmi.mdsd.x21.DataRef;
import dk.sdu.mmmi.mdsd.x21.DataVariable;
import dk.sdu.mmmi.mdsd.x21.Div;
import dk.sdu.mmmi.mdsd.x21.Equals;
import dk.sdu.mmmi.mdsd.x21.Exp;
import dk.sdu.mmmi.mdsd.x21.GreaterThan;
import dk.sdu.mmmi.mdsd.x21.GreaterThanOrEquals;
import dk.sdu.mmmi.mdsd.x21.IfStatement;
import dk.sdu.mmmi.mdsd.x21.Int;
import dk.sdu.mmmi.mdsd.x21.Lambda;
import dk.sdu.mmmi.mdsd.x21.LessThan;
import dk.sdu.mmmi.mdsd.x21.LessThanOrEquals;
import dk.sdu.mmmi.mdsd.x21.LetStatement;
import dk.sdu.mmmi.mdsd.x21.LogicExp;
import dk.sdu.mmmi.mdsd.x21.Minus;
import dk.sdu.mmmi.mdsd.x21.Mul;
import dk.sdu.mmmi.mdsd.x21.NewStatement;
import dk.sdu.mmmi.mdsd.x21.None;
import dk.sdu.mmmi.mdsd.x21.Parameter;
import dk.sdu.mmmi.mdsd.x21.Parenthesis;
import dk.sdu.mmmi.mdsd.x21.Plus;
import dk.sdu.mmmi.mdsd.x21.VarAssignment;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ExpressionGenerator {
  private Exp exp;
  
  private int letStatementCount = 0;
  
  private Map<LetStatement, String> letStatementNames = CollectionLiterals.<LetStatement, String>newHashMap();
  
  public ExpressionGenerator(final Exp exp) {
    this.exp = exp;
    Iterable<LetStatement> _iterable = IteratorExtensions.<LetStatement>toIterable(Iterators.<LetStatement>filter(exp.eContainer().eAllContents(), LetStatement.class));
    for (final LetStatement stmt : _iterable) {
      {
        this.letStatementNames.put(stmt, ("let" + Integer.valueOf(this.letStatementCount)));
        this.letStatementCount++;
      }
    }
  }
  
  public CharSequence genExpCode() {
    return this.genCode(this.exp);
  }
  
  public CharSequence genLetCode() {
    StringConcatenation _builder = new StringConcatenation();
    {
      Set<Map.Entry<LetStatement, String>> _entrySet = this.letStatementNames.entrySet();
      for(final Map.Entry<LetStatement, String> entry : _entrySet) {
        _builder.append("private int ");
        String _value = entry.getValue();
        _builder.append(_value);
        _builder.append("(int _");
        String _name = entry.getKey().getName();
        _builder.append(_name);
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return ");
        CharSequence _genCode = this.genCode(entry.getKey().getBody());
        _builder.append(_genCode, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  private CharSequence _genCode(final Plus exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _genCode = this.genCode(exp.getLeft());
    _builder.append(_genCode);
    _builder.append("+");
    Object _genCode_1 = this.genCode(exp.getRight());
    _builder.append(_genCode_1);
    return _builder;
  }
  
  private CharSequence _genCode(final Minus exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _genCode = this.genCode(exp.getLeft());
    _builder.append(_genCode);
    _builder.append("-");
    Object _genCode_1 = this.genCode(exp.getRight());
    _builder.append(_genCode_1);
    return _builder;
  }
  
  private CharSequence _genCode(final Mul exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _genCode = this.genCode(exp.getLeft());
    _builder.append(_genCode);
    _builder.append("*");
    Object _genCode_1 = this.genCode(exp.getRight());
    _builder.append(_genCode_1);
    return _builder;
  }
  
  private CharSequence _genCode(final Div exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _genCode = this.genCode(exp.getLeft());
    _builder.append(_genCode);
    _builder.append("/");
    Object _genCode_1 = this.genCode(exp.getRight());
    _builder.append(_genCode_1);
    return _builder;
  }
  
  private CharSequence _genCode(final Int exp) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = exp.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  private CharSequence _genCode(final Parenthesis exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _genCode = this.genCode(exp.getBody());
    _builder.append(_genCode);
    _builder.append(")");
    return _builder;
  }
  
  private CharSequence _genCode(final LetStatement exp) {
    return this.genLetStatementCode(exp);
  }
  
  private CharSequence _genCode(final DataAccess exp) {
    return this.genDataAccessCode(exp);
  }
  
  private CharSequence _genCode(final None exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("null");
    return _builder;
  }
  
  private CharSequence _genCode(final IfStatement exp) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _genConditionCode = this.genConditionCode(exp.getCondition());
    _builder.append(_genConditionCode);
    _builder.append("?");
    Object _genCode = this.genCode(exp.getTrueExp());
    _builder.append(_genCode);
    _builder.append(":");
    Object _genCode_1 = this.genCode(exp.getFalseExp());
    _builder.append(_genCode_1);
    return _builder;
  }
  
  private CharSequence _genCode(final NewStatement exp) {
    return this.genNewStatementCode(exp);
  }
  
  private CharSequence _genConditionCode(final Equals exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _genCode = this.genCode(exp.getLeft());
    _builder.append(_genCode);
    _builder.append(".equals(");
    Object _genCode_1 = this.genCode(exp.getRight());
    _builder.append(_genCode_1);
    _builder.append(")");
    return _builder;
  }
  
  private CharSequence _genConditionCode(final LessThan exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _genCode = this.genCode(exp.getLeft());
    _builder.append(_genCode);
    _builder.append("<");
    Object _genCode_1 = this.genCode(exp.getRight());
    _builder.append(_genCode_1);
    return _builder;
  }
  
  private CharSequence _genConditionCode(final LessThanOrEquals exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _genCode = this.genCode(exp.getLeft());
    _builder.append(_genCode);
    _builder.append("<=");
    Object _genCode_1 = this.genCode(exp.getRight());
    _builder.append(_genCode_1);
    return _builder;
  }
  
  private CharSequence _genConditionCode(final GreaterThan exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _genCode = this.genCode(exp.getLeft());
    _builder.append(_genCode);
    _builder.append(">");
    Object _genCode_1 = this.genCode(exp.getRight());
    _builder.append(_genCode_1);
    return _builder;
  }
  
  private CharSequence _genConditionCode(final GreaterThanOrEquals exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _genCode = this.genCode(exp.getLeft());
    _builder.append(_genCode);
    _builder.append(">=");
    Object _genCode_1 = this.genCode(exp.getRight());
    _builder.append(_genCode_1);
    return _builder;
  }
  
  private CharSequence genLetStatementCode(final LetStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    String _get = this.letStatementNames.get(stmt);
    _builder.append(_get);
    _builder.append("(");
    Object _genCode = this.genCode(stmt.getBody());
    _builder.append(_genCode);
    _builder.append(")");
    return _builder;
  }
  
  private String genDataAccessCode(final DataAccess access) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("_");
    String _dataAccessName = this.dataAccessName(access.getRef());
    _builder.append(_dataAccessName);
    {
      int _size = access.getVarRefs().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        {
          EList<DataVariable> _varRefs = access.getVarRefs();
          for(final DataVariable varRef : _varRefs) {
            _builder.append(".get");
            String _firstUpper = StringExtensions.toFirstUpper(varRef.getName());
            _builder.append(_firstUpper);
            _builder.append("()");
          }
        }
      }
    }
    return _builder.toString();
  }
  
  private String _dataAccessName(final Parameter access) {
    return access.getName();
  }
  
  private String _dataAccessName(final Lambda access) {
    return access.getName();
  }
  
  private String _dataAccessName(final LetStatement access) {
    return access.getName();
  }
  
  private CharSequence genNewStatementCode(final NewStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new Data");
    String _firstUpper = StringExtensions.toFirstUpper(stmt.getType().getName());
    _builder.append(_firstUpper);
    _builder.append("()");
    {
      EList<VarAssignment> _variables = stmt.getVariables();
      for(final VarAssignment variable : _variables) {
        _builder.append(".set");
        String _firstUpper_1 = StringExtensions.toFirstUpper(variable.getVariable().getName());
        _builder.append(_firstUpper_1);
        _builder.append("(");
        Object _genCode = this.genCode(variable.getValue());
        _builder.append(_genCode);
        _builder.append(")");
      }
    }
    return _builder;
  }
  
  private CharSequence genCode(final Exp exp) {
    if (exp instanceof DataAccess) {
      return _genCode((DataAccess)exp);
    } else if (exp instanceof IfStatement) {
      return _genCode((IfStatement)exp);
    } else if (exp instanceof Int) {
      return _genCode((Int)exp);
    } else if (exp instanceof LetStatement) {
      return _genCode((LetStatement)exp);
    } else if (exp instanceof NewStatement) {
      return _genCode((NewStatement)exp);
    } else if (exp instanceof None) {
      return _genCode((None)exp);
    } else if (exp instanceof Parenthesis) {
      return _genCode((Parenthesis)exp);
    } else if (exp instanceof Div) {
      return _genCode((Div)exp);
    } else if (exp instanceof Mul) {
      return _genCode((Mul)exp);
    } else if (exp instanceof Minus) {
      return _genCode((Minus)exp);
    } else if (exp instanceof Plus) {
      return _genCode((Plus)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
  
  private CharSequence genConditionCode(final LogicExp exp) {
    if (exp instanceof Equals) {
      return _genConditionCode((Equals)exp);
    } else if (exp instanceof GreaterThan) {
      return _genConditionCode((GreaterThan)exp);
    } else if (exp instanceof GreaterThanOrEquals) {
      return _genConditionCode((GreaterThanOrEquals)exp);
    } else if (exp instanceof LessThan) {
      return _genConditionCode((LessThan)exp);
    } else if (exp instanceof LessThanOrEquals) {
      return _genConditionCode((LessThanOrEquals)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
  
  private String dataAccessName(final DataRef access) {
    if (access instanceof LetStatement) {
      return _dataAccessName((LetStatement)access);
    } else if (access instanceof Lambda) {
      return _dataAccessName((Lambda)access);
    } else if (access instanceof Parameter) {
      return _dataAccessName((Parameter)access);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(access).toString());
    }
  }
}
