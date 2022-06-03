package dk.sdu.mmmi.mdsd.generator;

import dk.sdu.mmmi.mdsd.x21.DataAccess;
import dk.sdu.mmmi.mdsd.x21.Div;
import dk.sdu.mmmi.mdsd.x21.Exp;
import dk.sdu.mmmi.mdsd.x21.IfStatement;
import dk.sdu.mmmi.mdsd.x21.Int;
import dk.sdu.mmmi.mdsd.x21.LetStatement;
import dk.sdu.mmmi.mdsd.x21.Minus;
import dk.sdu.mmmi.mdsd.x21.Mul;
import dk.sdu.mmmi.mdsd.x21.NewStatement;
import dk.sdu.mmmi.mdsd.x21.None;
import dk.sdu.mmmi.mdsd.x21.Parenthesis;
import dk.sdu.mmmi.mdsd.x21.Plus;
import java.util.Arrays;

@SuppressWarnings("all")
public class TypeSystem {
  protected static Object _resolveType(final Plus exp) {
    return null;
  }
  
  protected static Object _resolveType(final Minus exp) {
    return null;
  }
  
  protected static Object _resolveType(final Mul exp) {
    return null;
  }
  
  protected static Object _resolveType(final Div exp) {
    return null;
  }
  
  protected static Object _resolveType(final Int exp) {
    return "Integer";
  }
  
  protected static Object _resolveType(final Parenthesis exp) {
    return TypeSystem.resolveType(exp.getBody());
  }
  
  protected static Object _resolveType(final LetStatement exp) {
    return TypeSystem.resolveType(exp.getBody());
  }
  
  protected static Object _resolveType(final DataAccess exp) {
    return null;
  }
  
  protected static Object _resolveType(final None exp) {
    return "None";
  }
  
  protected static Object _resolveType(final IfStatement exp) {
    return null;
  }
  
  protected static Object _resolveType(final NewStatement exp) {
    return null;
  }
  
  public static Object resolveType(final Exp exp) {
    if (exp instanceof DataAccess) {
      return _resolveType((DataAccess)exp);
    } else if (exp instanceof IfStatement) {
      return _resolveType((IfStatement)exp);
    } else if (exp instanceof Int) {
      return _resolveType((Int)exp);
    } else if (exp instanceof LetStatement) {
      return _resolveType((LetStatement)exp);
    } else if (exp instanceof NewStatement) {
      return _resolveType((NewStatement)exp);
    } else if (exp instanceof None) {
      return _resolveType((None)exp);
    } else if (exp instanceof Parenthesis) {
      return _resolveType((Parenthesis)exp);
    } else if (exp instanceof Div) {
      return _resolveType((Div)exp);
    } else if (exp instanceof Mul) {
      return _resolveType((Mul)exp);
    } else if (exp instanceof Minus) {
      return _resolveType((Minus)exp);
    } else if (exp instanceof Plus) {
      return _resolveType((Plus)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
}
