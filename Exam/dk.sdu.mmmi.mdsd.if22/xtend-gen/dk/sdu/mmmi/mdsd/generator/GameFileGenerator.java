package dk.sdu.mmmi.mdsd.generator;

import dk.sdu.mmmi.mdsd.iF22.IF22;
import dk.sdu.mmmi.mdsd.iF22.Scenario;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GameFileGenerator {
  private IF22 program;
  
  private String packageName;
  
  public GameFileGenerator(final IF22 program, final String packageName) {
    this.program = program;
    this.packageName = packageName;
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
    _builder.append("public class Game {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Scenario start;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Game(");
    {
      boolean _requireExternalInterface = Util.requireExternalInterface(this.program);
      if (_requireExternalInterface) {
        _builder.append("External external");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.start = new Scenario");
    Scenario _get = this.program.getScenarios().get(0);
    _builder.append(_get, "\t\t");
    _builder.append("(external);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void play() throws IOException {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("start.interact();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
