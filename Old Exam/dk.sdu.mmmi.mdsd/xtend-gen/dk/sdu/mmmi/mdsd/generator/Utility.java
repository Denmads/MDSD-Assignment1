package dk.sdu.mmmi.mdsd.generator;

import dk.sdu.mmmi.mdsd.x21.CustomType;
import dk.sdu.mmmi.mdsd.x21.IntType;
import dk.sdu.mmmi.mdsd.x21.StringType;
import dk.sdu.mmmi.mdsd.x21.Type;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Utility {
  public static CharSequence getJavaType(final Type type) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (type instanceof IntType) {
      _matched=true;
      _switchResult = "Integer";
    }
    if (!_matched) {
      _matched=true;
      if (!_matched) {
        if (type instanceof StringType) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = "String";
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
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Data");
        String _firstUpper = StringExtensions.toFirstUpper(((CustomType)type).getDeclaration().getName());
        _builder.append(_firstUpper);
        _switchResult = _builder;
      }
    }
    return _switchResult;
  }
  
  public static String memberName(final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("_");
    _builder.append(name);
    return _builder.toString();
  }
}
