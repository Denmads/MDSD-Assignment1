package dk.sdu.mmmi.mdsd.generator;

import com.google.common.collect.Iterables;
import dk.sdu.mmmi.mdsd.iF22.IF22;
import dk.sdu.mmmi.mdsd.iF22.Question;
import dk.sdu.mmmi.mdsd.iF22.Scenario;
import dk.sdu.mmmi.mdsd.iF22.Type;
import dk.sdu.mmmi.mdsd.iF22.VariableDef;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ScenarioFileGenerator {
  private IF22 program;
  
  private Scenario scenario;
  
  private String packageName;
  
  public ScenarioFileGenerator(final IF22 program, final String packageName) {
    this.program = program;
    this.packageName = packageName;
  }
  
  public Scenario setScenario(final Scenario scenario) {
    return this.scenario = scenario;
  }
  
  public CharSequence getClassName() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Scenario");
    String _name = this.scenario.getName();
    _builder.append(_name);
    return _builder;
  }
  
  public CharSequence genFile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package interactive_fiction.");
    _builder.append(this.packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import interactive_fiction.common.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class ");
    CharSequence _className = this.getClassName();
    _builder.append(_className);
    _builder.append(" extends Scenario {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _genVars = this.genVars();
    _builder.append(_genVars, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      boolean _requireExternalInterface = Util.requireExternalInterface(this.program);
      if (_requireExternalInterface) {
        _builder.append("\t");
        _builder.append("External external;");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _genConstructor = this.genConstructor();
        _builder.append(_genConstructor, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _genInteractMethod = this.genInteractMethod();
    _builder.append(_genInteractMethod, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genVars() {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<VariableDef> _filter = Iterables.<VariableDef>filter(this.scenario.getBody(), VariableDef.class);
      for(final VariableDef varDecl : _filter) {
        String _javaType = Util.toJavaType(varDecl.getType());
        _builder.append(_javaType);
        _builder.append(" ");
        String _name = varDecl.getName();
        _builder.append(_name);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<Question> _filter_1 = Iterables.<Question>filter(this.scenario.getBody(), Question.class);
      for(final Question question : _filter_1) {
        Type _returnTypeOfQuestion = Util.returnTypeOfQuestion(question);
        _builder.append(_returnTypeOfQuestion);
        _builder.append(" ");
        CharSequence _variableName = Util.variableName(question);
        _builder.append(_variableName);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence genConstructor() {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _className = this.getClassName();
    _builder.append(_className);
    _builder.append("(External external) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("this.external = external;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genInteractMethod() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public String interact() throws IOException {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("nextInteraction = \"");
    String _name = Util.firstStatement(this.scenario).getName();
    _builder.append(_name, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
