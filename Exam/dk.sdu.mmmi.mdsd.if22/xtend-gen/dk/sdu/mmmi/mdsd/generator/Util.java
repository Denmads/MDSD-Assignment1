package dk.sdu.mmmi.mdsd.generator;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import dk.sdu.mmmi.mdsd.iF22.BooleanType;
import dk.sdu.mmmi.mdsd.iF22.IF22;
import dk.sdu.mmmi.mdsd.iF22.IntType;
import dk.sdu.mmmi.mdsd.iF22.Question;
import dk.sdu.mmmi.mdsd.iF22.Scenario;
import dk.sdu.mmmi.mdsd.iF22.Statement;
import dk.sdu.mmmi.mdsd.iF22.StringType;
import dk.sdu.mmmi.mdsd.iF22.Type;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class Util {
  public static boolean requireExternalInterface(final IF22 program) {
    int _size = program.getFunctions().size();
    return (_size > 0);
  }
  
  public static String toJavaType(final Type type) {
    String _xifexpression = null;
    if ((type instanceof IntType)) {
      _xifexpression = "int";
    } else {
      String _xifexpression_1 = null;
      if ((type instanceof StringType)) {
        _xifexpression_1 = "String";
      } else {
        String _xifexpression_2 = null;
        if ((type instanceof BooleanType)) {
          _xifexpression_2 = "boolean";
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public static Type returnTypeOfQuestion(final Question question) {
    return IteratorExtensions.<Type>toList(Iterators.<Type>filter(question.getTypeAndValidation().eContainer().eAllContents(), Type.class)).get(0);
  }
  
  public static CharSequence variableName(final Question question) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("__");
    String _name = question.getName();
    _builder.append(_name);
    return _builder;
  }
  
  public static Statement firstStatement(final Scenario scenario) {
    return IterableExtensions.<Statement>toList(Iterables.<Statement>filter(scenario.getBody(), Statement.class)).get(0);
  }
}
