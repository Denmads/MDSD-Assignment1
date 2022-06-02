package dk.sdu.mmmi.mdsd.generator;

import com.google.common.collect.Iterables;
import dk.sdu.mmmi.mdsd.x21.Declaration;
import dk.sdu.mmmi.mdsd.x21.Function;
import dk.sdu.mmmi.mdsd.x21.Input;
import dk.sdu.mmmi.mdsd.x21.Node;
import dk.sdu.mmmi.mdsd.x21.Parameter;
import dk.sdu.mmmi.mdsd.x21.X21;
import java.util.Arrays;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class MainFileGenerator {
  private String packageName;
  
  private String className;
  
  private X21 program;
  
  public MainFileGenerator(final String packageName, final String className, final X21 program) {
    this.program = program;
    this.packageName = packageName;
    this.className = className;
  }
  
  public CharSequence genJavaCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import libx21.*;");
    _builder.newLine();
    _builder.append("import java.util.function.Function;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(this.className);
    _builder.append(" extends GenericMainX21 {");
    _builder.newLineIfNotEmpty();
    {
      Iterable<Parameter> _filter = Iterables.<Parameter>filter(this.program.getDeclarations(), Parameter.class);
      for(final Parameter parameter : _filter) {
        _builder.append("\t");
        CharSequence _genCode = this.genCode(parameter);
        _builder.append(_genCode, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<Function> _filter_1 = Iterables.<Function>filter(this.program.getDeclarations(), Function.class);
      for(final Function function : _filter_1) {
        _builder.append("\t");
        CharSequence _genCode_1 = this.genCode(function);
        _builder.append(_genCode_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<Input> _filter_2 = Iterables.<Input>filter(this.program.getDeclarations(), Input.class);
      for(final Input input : _filter_2) {
        _builder.append("\t");
        CharSequence _genCode_2 = this.genCode(input);
        _builder.append(_genCode_2, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<Node> _filter_3 = Iterables.<Node>filter(this.program.getDeclarations(), Node.class);
      for(final Node node : _filter_3) {
        _builder.append("\t");
        CharSequence _genCode_3 = this.genCode(node);
        _builder.append(_genCode_3, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genCode(final Parameter param) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("///");
    _builder.newLine();
    _builder.append("/// Code for paramter ");
    String _name = param.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("///");
    _builder.newLine();
    _builder.append("private ");
    CharSequence _javaType = Utility.getJavaType(param.getType());
    _builder.append(_javaType);
    _builder.append(" ");
    String _memberName = Utility.memberName(param.getName());
    _builder.append(_memberName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("public void setParameter");
    String _upperCase = param.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("(");
    CharSequence _javaType_1 = Utility.getJavaType(param.getType());
    _builder.append(_javaType_1);
    _builder.append(" value) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _memberName_1 = Utility.memberName(param.getName());
    _builder.append(_memberName_1, "\t");
    _builder.append(" = value;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genCode(final Function func) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("///");
    _builder.newLine();
    _builder.append("/// Code for function ");
    String _name = func.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("///");
    _builder.newLine();
    _builder.append("private Object fun_");
    String _name_1 = func.getName();
    _builder.append(_name_1);
    _builder.append("(Object arg) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return funimpl_");
    String _name_2 = func.getName();
    _builder.append(_name_2, "\t");
    _builder.append("((");
    CharSequence _javaType = Utility.getJavaType(func.getBody().getType());
    _builder.append(_javaType, "\t");
    _builder.append(")arg);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("private Object funimpl_");
    String _name_3 = func.getName();
    _builder.append(_name_3);
    _builder.append("(");
    CharSequence _javaType_1 = Utility.getJavaType(func.getBody().getType());
    _builder.append(_javaType_1);
    _builder.append(" _");
    String _memberName = Utility.memberName(func.getBody().getName());
    _builder.append(_memberName);
    _builder.append(") { return ???; }");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genCode(final Input input) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("///");
    _builder.newLine();
    _builder.append("/// Code for input ");
    String _name = input.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("///");
    _builder.newLine();
    _builder.append("private ComputeNode<Object, Object> node_");
    String _name_1 = input.getName();
    _builder.append(_name_1);
    _builder.append(" = new InputNode<Object>();");
    _builder.newLineIfNotEmpty();
    _builder.append("public void input");
    String _firstUpper = StringExtensions.toFirstUpper(input.getName());
    _builder.append(_firstUpper);
    _builder.append("(");
    CharSequence _javaType = Utility.getJavaType(input.getType());
    _builder.append(_javaType);
    _builder.append(" input) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("node_");
    String _name_2 = input.getName();
    _builder.append(_name_2, "\t");
    _builder.append(".put(input);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genCode(final Node node) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("///");
    _builder.newLine();
    _builder.append("/// Code for node ");
    String _name = node.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("///");
    _builder.newLine();
    _builder.append("private ComputeNode<Object, Object> node_");
    String _name_1 = node.getName();
    _builder.append(_name_1);
    _builder.append(" = new AbstractComputeNode<Object, Object>() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("protected Object function(Object input) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ???;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genCode(final Declaration func) {
    if (func instanceof Function) {
      return _genCode((Function)func);
    } else if (func instanceof Input) {
      return _genCode((Input)func);
    } else if (func instanceof Node) {
      return _genCode((Node)func);
    } else if (func instanceof Parameter) {
      return _genCode((Parameter)func);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(func).toString());
    }
  }
}
