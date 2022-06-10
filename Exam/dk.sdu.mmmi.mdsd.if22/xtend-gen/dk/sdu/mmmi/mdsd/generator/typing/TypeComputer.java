package dk.sdu.mmmi.mdsd.generator.typing;

import com.google.common.base.Objects;
import dk.sdu.mmmi.mdsd.generator.Util;
import dk.sdu.mmmi.mdsd.iF22.AddSub;
import dk.sdu.mmmi.mdsd.iF22.BoolConstant;
import dk.sdu.mmmi.mdsd.iF22.BooleanOperation;
import dk.sdu.mmmi.mdsd.iF22.BooleanType;
import dk.sdu.mmmi.mdsd.iF22.Concatenation;
import dk.sdu.mmmi.mdsd.iF22.Equality;
import dk.sdu.mmmi.mdsd.iF22.Exp;
import dk.sdu.mmmi.mdsd.iF22.FunctionCall;
import dk.sdu.mmmi.mdsd.iF22.IntConstant;
import dk.sdu.mmmi.mdsd.iF22.IntType;
import dk.sdu.mmmi.mdsd.iF22.LessGreaterThan;
import dk.sdu.mmmi.mdsd.iF22.MulDiv;
import dk.sdu.mmmi.mdsd.iF22.Not;
import dk.sdu.mmmi.mdsd.iF22.Parenthesis;
import dk.sdu.mmmi.mdsd.iF22.Question;
import dk.sdu.mmmi.mdsd.iF22.StringConstant;
import dk.sdu.mmmi.mdsd.iF22.StringType;
import dk.sdu.mmmi.mdsd.iF22.This;
import dk.sdu.mmmi.mdsd.iF22.Type;
import dk.sdu.mmmi.mdsd.iF22.VarRef;
import org.eclipse.xtext.EcoreUtil2;

@SuppressWarnings("all")
public class TypeComputer {
  public static final IntExpType INT_TYPE = new IntExpType();
  
  public static final StringExpType STRING_TYPE = new StringExpType();
  
  public static final BooleanExpType BOOL_TYPE = new BooleanExpType();
  
  public boolean isIntType(final ExpType type) {
    return Objects.equal(type, TypeComputer.INT_TYPE);
  }
  
  public boolean isStringType(final ExpType type) {
    return Objects.equal(type, TypeComputer.STRING_TYPE);
  }
  
  public boolean isBoolType(final ExpType type) {
    return Objects.equal(type, TypeComputer.BOOL_TYPE);
  }
  
  public ExpType toExpType(final Type type) {
    ExpType _xifexpression = null;
    if ((type instanceof IntType)) {
      _xifexpression = TypeComputer.INT_TYPE;
    } else {
      ExpType _xifexpression_1 = null;
      if ((type instanceof StringType)) {
        _xifexpression_1 = TypeComputer.STRING_TYPE;
      } else {
        BooleanExpType _xifexpression_2 = null;
        if ((type instanceof BooleanType)) {
          _xifexpression_2 = TypeComputer.BOOL_TYPE;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public ExpType typeFor(final Exp exp) {
    if ((exp instanceof IntConstant)) {
      return TypeComputer.INT_TYPE;
    } else {
      if ((exp instanceof StringConstant)) {
        return TypeComputer.STRING_TYPE;
      } else {
        if ((exp instanceof BoolConstant)) {
          return TypeComputer.BOOL_TYPE;
        } else {
          if ((exp instanceof Not)) {
            return TypeComputer.BOOL_TYPE;
          } else {
            if ((exp instanceof This)) {
              return this.toExpType(Util.returnTypeOfQuestion(EcoreUtil2.<Question>getContainerOfType(exp, Question.class)));
            } else {
              if ((exp instanceof FunctionCall)) {
                return this.toExpType(((FunctionCall)exp).getFunction().getReturnType());
              } else {
                if ((exp instanceof Type)) {
                  return this.toExpType(((Type)exp));
                } else {
                  if ((exp instanceof VarRef)) {
                    return this.toExpType(((VarRef)exp).getVariable().getType());
                  } else {
                    if ((exp instanceof Parenthesis)) {
                      return this.typeFor(((Parenthesis)exp).getBody());
                    } else {
                      if ((exp instanceof MulDiv)) {
                        return TypeComputer.INT_TYPE;
                      } else {
                        if ((exp instanceof AddSub)) {
                          return TypeComputer.INT_TYPE;
                        } else {
                          if ((exp instanceof Concatenation)) {
                            return TypeComputer.STRING_TYPE;
                          } else {
                            if ((exp instanceof LessGreaterThan)) {
                              return TypeComputer.BOOL_TYPE;
                            } else {
                              if ((exp instanceof Equality)) {
                                return TypeComputer.BOOL_TYPE;
                              } else {
                                if ((exp instanceof BooleanOperation)) {
                                  return TypeComputer.BOOL_TYPE;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return null;
  }
}
