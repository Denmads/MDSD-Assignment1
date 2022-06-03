package dk.sdu.mmmi.mdsd.generator;

import dk.sdu.mmmi.mdsd.x21.DataDecl;
import dk.sdu.mmmi.mdsd.x21.DataVariable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class DataTypeGenerator {
  private int counter = 0;
  
  private String currentClass = "";
  
  private DataDecl declaration = null;
  
  public String setDeclaration(final DataDecl decl) {
    String _xblockexpression = null;
    {
      this.declaration = decl;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Data");
      String _firstUpper = StringExtensions.toFirstUpper(decl.getName());
      _builder.append(_firstUpper);
      _xblockexpression = this.currentClass = _builder.toString();
    }
    return _xblockexpression;
  }
  
  public String genJavaCode(final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(this.currentClass);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _genConstructors = this.genConstructors();
    _builder.append(_genConstructors, "\t");
    _builder.newLineIfNotEmpty();
    {
      EList<DataVariable> _variables = this.declaration.getVariables();
      for(final DataVariable variable : _variables) {
        _builder.append("\t");
        CharSequence _genGetterAndSetter = this.genGetterAndSetter(variable);
        _builder.append(_genGetterAndSetter, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    CharSequence _genToStringFunc = this.genToStringFunc();
    _builder.append(_genToStringFunc, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _genHashCodeFunc = this.genHashCodeFunc();
    _builder.append(_genHashCodeFunc, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _genEqualsFunc = this.genEqualsFunc();
    _builder.append(_genEqualsFunc, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    String code = _builder.toString();
    int _counter = this.counter;
    this.counter = (_counter + 1);
    return code;
  }
  
  public CharSequence genConstructors() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    _builder.append(this.currentClass);
    _builder.append("() {}");
    _builder.newLineIfNotEmpty();
    _builder.append("public ");
    _builder.append(this.currentClass);
    _builder.append("(");
    CharSequence _genConstructorArgs = this.genConstructorArgs();
    _builder.append(_genConstructorArgs);
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      EList<DataVariable> _variables = this.declaration.getVariables();
      for(final DataVariable variable : _variables) {
        _builder.append("\t");
        _builder.append("this.");
        String _memberName = Utility.memberName(variable.getName());
        _builder.append(_memberName, "\t");
        _builder.append(" = ");
        String _memberName_1 = Utility.memberName(variable.getName());
        _builder.append(_memberName_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genConstructorArgs() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DataVariable> _variables = this.declaration.getVariables();
      boolean _hasElements = false;
      for(final DataVariable variable : _variables) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        CharSequence _javaType = Utility.getJavaType(variable.getType());
        _builder.append(_javaType);
        _builder.append(" ");
        String _memberName = Utility.memberName(variable.getName());
        _builder.append(_memberName);
      }
      if (_hasElements) {
        _builder.append("");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genGetterAndSetter(final DataVariable dvar) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ");
    CharSequence _javaType = Utility.getJavaType(dvar.getType());
    _builder.append(_javaType);
    _builder.append(" ");
    String _memberName = Utility.memberName(dvar.getName());
    _builder.append(_memberName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("public ");
    CharSequence _javaType_1 = Utility.getJavaType(dvar.getType());
    _builder.append(_javaType_1);
    _builder.append(" get");
    String _firstUpper = StringExtensions.toFirstUpper(dvar.getName());
    _builder.append(_firstUpper);
    _builder.append("() { return ");
    String _memberName_1 = Utility.memberName(dvar.getName());
    _builder.append(_memberName_1);
    _builder.append("; }");
    _builder.newLineIfNotEmpty();
    _builder.append("public ");
    _builder.append(this.currentClass);
    _builder.append(" set");
    String _firstUpper_1 = StringExtensions.toFirstUpper(dvar.getName());
    _builder.append(_firstUpper_1);
    _builder.append("(");
    CharSequence _javaType_2 = Utility.getJavaType(dvar.getType());
    _builder.append(_javaType_2);
    _builder.append(" value) { ");
    String _memberName_2 = Utility.memberName(dvar.getName());
    _builder.append(_memberName_2);
    _builder.append(" = value; return this; }");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genToStringFunc() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return \"DATA:");
    String _name = this.declaration.getName();
    _builder.append(_name, "\t");
    _builder.append("[\"");
    {
      EList<DataVariable> _variables = this.declaration.getVariables();
      boolean _hasElements = false;
      for(final DataVariable variable : _variables) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\",\"", "\t");
        }
        _builder.append("+");
        String _memberName = Utility.memberName(variable.getName());
        _builder.append(_memberName, "\t");
        _builder.append("+");
      }
    }
    _builder.append("\"]\";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genHashCodeFunc() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public int hashCode() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("int result = ");
    _builder.append(this.counter, "\t");
    _builder.append("*2+1;");
    _builder.newLineIfNotEmpty();
    {
      EList<DataVariable> _variables = this.declaration.getVariables();
      for(final DataVariable variable : _variables) {
        _builder.append("\t");
        _builder.append("result += ");
        String _memberName = Utility.memberName(variable.getName());
        _builder.append(_memberName, "\t");
        _builder.append(".hashCode();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("return result;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genEqualsFunc() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public boolean euqals(Object other) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (other== null || !(other instanceof ");
    _builder.append(this.currentClass, "\t");
    _builder.append(")) return false;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(this.currentClass, "\t");
    _builder.append(" object = (");
    _builder.append(this.currentClass, "\t");
    _builder.append(")other;");
    _builder.newLineIfNotEmpty();
    {
      EList<DataVariable> _variables = this.declaration.getVariables();
      for(final DataVariable variable : _variables) {
        _builder.append("\t");
        _builder.append("if (");
        String _memberName = Utility.memberName(variable.getName());
        _builder.append(_memberName, "\t");
        _builder.append("==null && object.");
        String _memberName_1 = Utility.memberName(variable.getName());
        _builder.append(_memberName_1, "\t");
        _builder.append("!=null) return false;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("if (");
        String _memberName_2 = Utility.memberName(variable.getName());
        _builder.append(_memberName_2, "\t");
        _builder.append("!=null && !");
        String _memberName_3 = Utility.memberName(variable.getName());
        _builder.append(_memberName_3, "\t");
        _builder.append(".equals(object.");
        String _memberName_4 = Utility.memberName(variable.getName());
        _builder.append(_memberName_4, "\t");
        _builder.append(")) return false;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
