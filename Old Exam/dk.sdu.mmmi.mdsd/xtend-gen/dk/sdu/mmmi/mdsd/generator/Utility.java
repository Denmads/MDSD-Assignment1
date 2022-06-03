package dk.sdu.mmmi.mdsd.generator;

import dk.sdu.mmmi.mdsd.x21.CustomType;
import dk.sdu.mmmi.mdsd.x21.IntType;
import dk.sdu.mmmi.mdsd.x21.StringType;
import dk.sdu.mmmi.mdsd.x21.Type;
import java.util.Arrays;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Utility {
  public static CharSequence getJavaType(final Type type) {
    return Utility.getType(type);
  }
  
  private static CharSequence _getType(final IntType t) {
    return "Integer";
  }
  
  private static CharSequence _getType(final StringType t) {
    return "String";
  }
  
  private static CharSequence _getType(final CustomType t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Data");
    String _firstUpper = StringExtensions.toFirstUpper(t.getDeclaration().getName());
    _builder.append(_firstUpper);
    return _builder;
  }
  
  public static String memberName(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("_");
    _builder.append(name);
    return _builder.toString();
  }
  
  private static CharSequence getType(final Type t) {
    if (t instanceof CustomType) {
      return _getType((CustomType)t);
    } else if (t instanceof IntType) {
      return _getType((IntType)t);
    } else if (t instanceof StringType) {
      return _getType((StringType)t);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(t).toString());
    }
  }
}
