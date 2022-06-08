package dk.sdu.mmmi.mdsd.generator.typing;

import dk.sdu.mmmi.mdsd.x21.CustomType;
import dk.sdu.mmmi.mdsd.x21.DataAccess;
import dk.sdu.mmmi.mdsd.x21.DataRef;
import dk.sdu.mmmi.mdsd.x21.Int;
import dk.sdu.mmmi.mdsd.x21.IntType;
import dk.sdu.mmmi.mdsd.x21.Lambda;
import dk.sdu.mmmi.mdsd.x21.LetStatement;
import dk.sdu.mmmi.mdsd.x21.LogicExp;
import dk.sdu.mmmi.mdsd.x21.Minus;
import dk.sdu.mmmi.mdsd.x21.MulDiv;
import dk.sdu.mmmi.mdsd.x21.NewStatement;
import dk.sdu.mmmi.mdsd.x21.Parameter;
import dk.sdu.mmmi.mdsd.x21.Plus;
import dk.sdu.mmmi.mdsd.x21.StringType;
import dk.sdu.mmmi.mdsd.x21.Type;
import java.util.Arrays;

@SuppressWarnings("all")
public class TypeSystem {
  public static final IntExpType INT_TYPE = new IntExpType();
  
  public static final StringExpType STRING_TYPE = new StringExpType();
  
  public static final CustomExpType CUSTOM_TYPE = new CustomExpType();
  
  public boolean isIntType(final ExpressionType type) {
    return (type == TypeSystem.INT_TYPE);
  }
  
  public boolean isStringType(final ExpressionType type) {
    return (type == TypeSystem.STRING_TYPE);
  }
  
  public boolean isCustomType(final ExpressionType type) {
    return (type == TypeSystem.CUSTOM_TYPE);
  }
  
  protected Object _typeFor(final LogicExp exp) {
    ExpressionType _switchResult = null;
    boolean _matched = false;
    if (exp instanceof Int) {
      _matched=true;
      _switchResult = TypeSystem.INT_TYPE;
    }
    if (!_matched) {
      _matched=true;
      if (!_matched) {
        if (exp instanceof NewStatement) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = TypeSystem.CUSTOM_TYPE;
      }
    }
    if (!_matched) {
      _matched=true;
      if (!_matched) {
        if (exp instanceof LetStatement) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = TypeSystem.INT_TYPE;
      }
    }
    if (!_matched) {
      _matched=true;
      if (!_matched) {
        if (exp instanceof MulDiv) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = TypeSystem.INT_TYPE;
      }
    }
    if (!_matched) {
      _matched=true;
      if (!_matched) {
        if (exp instanceof Minus) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = TypeSystem.INT_TYPE;
      }
    }
    if (!_matched) {
      _matched=true;
      if (!_matched) {
        if (exp instanceof Plus) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = TypeSystem.INT_TYPE;
      }
    }
    return _switchResult;
  }
  
  protected Object _typeFor(final DataAccess da) {
    Object _switchResult = null;
    DataRef _ref = da.getRef();
    boolean _matched = false;
    if (_ref instanceof Parameter) {
      _matched=true;
      DataRef _ref_1 = da.getRef();
      _switchResult = this.convert_type(((Parameter) _ref_1).getType());
    }
    if (!_matched) {
      _matched=true;
      if (!_matched) {
        if (_ref instanceof LetStatement) {
          _matched=true;
        }
      }
      if (_matched) {
        DataRef _ref_1 = da.getRef();
        _switchResult = this.typeFor(((LetStatement) _ref_1).getValue());
      }
    }
    if (!_matched) {
      _matched=true;
      if (!_matched) {
        if (_ref instanceof Lambda) {
          _matched=true;
        }
      }
      if (_matched) {
        DataRef _ref_2 = da.getRef();
        _switchResult = this.convert_type(((Lambda) _ref_2).getType());
      }
    }
    return _switchResult;
  }
  
  public ExpressionType convert_type(final Type type) {
    ExpressionType _switchResult = null;
    boolean _matched = false;
    if (type instanceof IntType) {
      _matched=true;
      _switchResult = TypeSystem.INT_TYPE;
    }
    if (!_matched) {
      _matched=true;
      if (!_matched) {
        if (type instanceof StringType) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = TypeSystem.STRING_TYPE;
      }
    }
    if (!_matched) {
      _matched=true;
      if (!_matched) {
        if (type instanceof CustomType) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = TypeSystem.CUSTOM_TYPE;
      }
    }
    return _switchResult;
  }
  
  public Object typeFor(final LogicExp da) {
    if (da instanceof DataAccess) {
      return _typeFor((DataAccess)da);
    } else if (da != null) {
      return _typeFor(da);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(da).toString());
    }
  }
}
