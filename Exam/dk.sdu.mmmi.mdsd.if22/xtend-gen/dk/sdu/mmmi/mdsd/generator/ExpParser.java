package dk.sdu.mmmi.mdsd.generator;

import dk.sdu.mmmi.mdsd.iF22.Add;
import dk.sdu.mmmi.mdsd.iF22.And;
import dk.sdu.mmmi.mdsd.iF22.BoolConstant;
import dk.sdu.mmmi.mdsd.iF22.BooleanType;
import dk.sdu.mmmi.mdsd.iF22.Concatenation;
import dk.sdu.mmmi.mdsd.iF22.Constant;
import dk.sdu.mmmi.mdsd.iF22.Div;
import dk.sdu.mmmi.mdsd.iF22.Equals;
import dk.sdu.mmmi.mdsd.iF22.Exp;
import dk.sdu.mmmi.mdsd.iF22.FunctionCall;
import dk.sdu.mmmi.mdsd.iF22.GreaterThan;
import dk.sdu.mmmi.mdsd.iF22.GreaterThanOrEquals;
import dk.sdu.mmmi.mdsd.iF22.IntConstant;
import dk.sdu.mmmi.mdsd.iF22.IntType;
import dk.sdu.mmmi.mdsd.iF22.Keyword;
import dk.sdu.mmmi.mdsd.iF22.LessGreaterThan;
import dk.sdu.mmmi.mdsd.iF22.LessThan;
import dk.sdu.mmmi.mdsd.iF22.LessThanOrEquals;
import dk.sdu.mmmi.mdsd.iF22.Mul;
import dk.sdu.mmmi.mdsd.iF22.Not;
import dk.sdu.mmmi.mdsd.iF22.NotEquals;
import dk.sdu.mmmi.mdsd.iF22.Or;
import dk.sdu.mmmi.mdsd.iF22.Parenthesis;
import dk.sdu.mmmi.mdsd.iF22.StringConstant;
import dk.sdu.mmmi.mdsd.iF22.StringType;
import dk.sdu.mmmi.mdsd.iF22.Sub;
import dk.sdu.mmmi.mdsd.iF22.This;
import dk.sdu.mmmi.mdsd.iF22.True;
import dk.sdu.mmmi.mdsd.iF22.VarRef;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ExpParser {
  protected static Object _parse(final Exp exp) {
    return ExpParser.parse(exp);
  }
  
  protected static Object _parse(final And exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _parse = ExpParser.parse(exp.getLeft());
    _builder.append(_parse);
    _builder.append(" && ");
    Object _parse_1 = ExpParser.parse(exp.getRight());
    _builder.append(_parse_1);
    return _builder;
  }
  
  protected static Object _parse(final Or exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _parse = ExpParser.parse(exp.getLeft());
    _builder.append(_parse);
    _builder.append(" || ");
    Object _parse_1 = ExpParser.parse(exp.getRight());
    _builder.append(_parse_1);
    return _builder;
  }
  
  protected static Object _parse(final Equals exp) {
    CharSequence _xifexpression = null;
    LessGreaterThan _right = exp.getRight();
    if ((_right instanceof StringConstant)) {
      StringConcatenation _builder = new StringConcatenation();
      Object _parse = ExpParser.parse(exp.getLeft());
      _builder.append(_parse);
      _builder.append(".equals(");
      Object _parse_1 = ExpParser.parse(exp.getRight());
      _builder.append(_parse_1);
      _builder.append(")");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      Object _parse_2 = ExpParser.parse(exp.getLeft());
      _builder_1.append(_parse_2);
      _builder_1.append(" == ");
      Object _parse_3 = ExpParser.parse(exp.getRight());
      _builder_1.append(_parse_3);
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected static Object _parse(final NotEquals exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _parse = ExpParser.parse(exp.getLeft());
    _builder.append(_parse);
    _builder.append(" != ");
    Object _parse_1 = ExpParser.parse(exp.getRight());
    _builder.append(_parse_1);
    return _builder;
  }
  
  protected static Object _parse(final LessThan exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _parse = ExpParser.parse(exp.getLeft());
    _builder.append(_parse);
    _builder.append(" < ");
    Object _parse_1 = ExpParser.parse(exp.getRight());
    _builder.append(_parse_1);
    return _builder;
  }
  
  protected static Object _parse(final GreaterThan exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _parse = ExpParser.parse(exp.getLeft());
    _builder.append(_parse);
    _builder.append(" > ");
    Object _parse_1 = ExpParser.parse(exp.getRight());
    _builder.append(_parse_1);
    return _builder;
  }
  
  protected static Object _parse(final LessThanOrEquals exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _parse = ExpParser.parse(exp.getLeft());
    _builder.append(_parse);
    _builder.append(" <= ");
    Object _parse_1 = ExpParser.parse(exp.getRight());
    _builder.append(_parse_1);
    return _builder;
  }
  
  protected static Object _parse(final GreaterThanOrEquals exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _parse = ExpParser.parse(exp.getLeft());
    _builder.append(_parse);
    _builder.append(" >= ");
    Object _parse_1 = ExpParser.parse(exp.getRight());
    _builder.append(_parse_1);
    return _builder;
  }
  
  protected static Object _parse(final Concatenation exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _parse = ExpParser.parse(exp.getLeft());
    _builder.append(_parse);
    _builder.append(" + ");
    Object _parse_1 = ExpParser.parse(exp.getRight());
    _builder.append(_parse_1);
    return _builder;
  }
  
  protected static Object _parse(final Add exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _parse = ExpParser.parse(exp.getLeft());
    _builder.append(_parse);
    _builder.append(" + ");
    Object _parse_1 = ExpParser.parse(exp.getRight());
    _builder.append(_parse_1);
    return _builder;
  }
  
  protected static Object _parse(final Sub exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _parse = ExpParser.parse(exp.getLeft());
    _builder.append(_parse);
    _builder.append(" - ");
    Object _parse_1 = ExpParser.parse(exp.getRight());
    _builder.append(_parse_1);
    return _builder;
  }
  
  protected static Object _parse(final Mul exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _parse = ExpParser.parse(exp.getLeft());
    _builder.append(_parse);
    _builder.append(" * ");
    Object _parse_1 = ExpParser.parse(exp.getRight());
    _builder.append(_parse_1);
    return _builder;
  }
  
  protected static Object _parse(final Div exp) {
    StringConcatenation _builder = new StringConcatenation();
    Object _parse = ExpParser.parse(exp.getLeft());
    _builder.append(_parse);
    _builder.append(" / ");
    Object _parse_1 = ExpParser.parse(exp.getRight());
    _builder.append(_parse_1);
    return _builder;
  }
  
  protected static Object _parse(final Parenthesis exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _parse = ExpParser.parse(exp.getBody());
    _builder.append(_parse);
    _builder.append(")");
    return _builder;
  }
  
  protected static Object _parse(final Not exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("!");
    Object _parse = ExpParser.parse(exp.getBody());
    _builder.append(_parse);
    return _builder;
  }
  
  protected static Object _parse(final Constant exp) {
    CharSequence _xifexpression = null;
    if ((exp instanceof BoolConstant)) {
      CharSequence _xifexpression_1 = null;
      if ((exp instanceof True)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("true");
        _xifexpression_1 = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("false");
        _xifexpression_1 = _builder_1;
      }
      _xifexpression = _xifexpression_1;
    } else {
      CharSequence _xifexpression_2 = null;
      if ((exp instanceof IntConstant)) {
        StringConcatenation _builder_2 = new StringConcatenation();
        int _value = ((IntConstant)exp).getValue();
        _builder_2.append(_value);
        _xifexpression_2 = _builder_2;
      } else {
        CharSequence _xifexpression_3 = null;
        if ((exp instanceof StringConstant)) {
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("\"");
          String _value_1 = ((StringConstant)exp).getValue();
          _builder_3.append(_value_1);
          _builder_3.append("\"");
          _xifexpression_3 = _builder_3;
        }
        _xifexpression_2 = _xifexpression_3;
      }
      _xifexpression = _xifexpression_2;
    }
    return _xifexpression;
  }
  
  protected static Object _parse(final Keyword exp) {
    CharSequence _xifexpression = null;
    if ((exp instanceof This)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("this");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      if ((exp instanceof IntType)) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("int");
        _xifexpression_1 = _builder_1;
      } else {
        CharSequence _xifexpression_2 = null;
        if ((exp instanceof StringType)) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("String");
          _xifexpression_2 = _builder_2;
        } else {
          CharSequence _xifexpression_3 = null;
          if ((exp instanceof BooleanType)) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("boolean");
            _xifexpression_3 = _builder_3;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected static Object _parse(final VarRef exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = exp.getVariable().getName();
    _builder.append(_name);
    return _builder;
  }
  
  protected static Object _parse(final FunctionCall exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("external.");
    String _name = exp.getFunction().getName();
    _builder.append(_name);
    _builder.append("(");
    {
      EList<Exp> _arguments = exp.getArguments();
      boolean _hasElements = false;
      for(final Exp ep : _arguments) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        Object _parse = ExpParser.parse(ep);
        _builder.append(_parse);
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  public static Object parse(final Exp exp) {
    if (exp instanceof Constant) {
      return _parse((Constant)exp);
    } else if (exp instanceof FunctionCall) {
      return _parse((FunctionCall)exp);
    } else if (exp instanceof Keyword) {
      return _parse((Keyword)exp);
    } else if (exp instanceof Not) {
      return _parse((Not)exp);
    } else if (exp instanceof Parenthesis) {
      return _parse((Parenthesis)exp);
    } else if (exp instanceof VarRef) {
      return _parse((VarRef)exp);
    } else if (exp instanceof Div) {
      return _parse((Div)exp);
    } else if (exp instanceof Mul) {
      return _parse((Mul)exp);
    } else if (exp instanceof Add) {
      return _parse((Add)exp);
    } else if (exp instanceof Sub) {
      return _parse((Sub)exp);
    } else if (exp instanceof Concatenation) {
      return _parse((Concatenation)exp);
    } else if (exp instanceof GreaterThan) {
      return _parse((GreaterThan)exp);
    } else if (exp instanceof GreaterThanOrEquals) {
      return _parse((GreaterThanOrEquals)exp);
    } else if (exp instanceof LessThan) {
      return _parse((LessThan)exp);
    } else if (exp instanceof LessThanOrEquals) {
      return _parse((LessThanOrEquals)exp);
    } else if (exp instanceof Equals) {
      return _parse((Equals)exp);
    } else if (exp instanceof NotEquals) {
      return _parse((NotEquals)exp);
    } else if (exp instanceof And) {
      return _parse((And)exp);
    } else if (exp instanceof Or) {
      return _parse((Or)exp);
    } else if (exp != null) {
      return _parse(exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
}
