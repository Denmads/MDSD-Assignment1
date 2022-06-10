package dk.sdu.mmmi.mdsd.generator;

import com.google.common.collect.Iterables;
import dk.sdu.mmmi.mdsd.iF22.Announce;
import dk.sdu.mmmi.mdsd.iF22.BooleanType;
import dk.sdu.mmmi.mdsd.iF22.End;
import dk.sdu.mmmi.mdsd.iF22.EndingTarget;
import dk.sdu.mmmi.mdsd.iF22.Exp;
import dk.sdu.mmmi.mdsd.iF22.IF22;
import dk.sdu.mmmi.mdsd.iF22.IntType;
import dk.sdu.mmmi.mdsd.iF22.Parameter;
import dk.sdu.mmmi.mdsd.iF22.Question;
import dk.sdu.mmmi.mdsd.iF22.Scenario;
import dk.sdu.mmmi.mdsd.iF22.Statement;
import dk.sdu.mmmi.mdsd.iF22.StringType;
import dk.sdu.mmmi.mdsd.iF22.Target;
import dk.sdu.mmmi.mdsd.iF22.TargetDestination;
import dk.sdu.mmmi.mdsd.iF22.Type;
import dk.sdu.mmmi.mdsd.iF22.VariableDef;
import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

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
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      if ((Util.requireExternalInterface(this.program) || (this.scenario.getParameters().size() > 0))) {
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
      EList<Parameter> _parameters = this.scenario.getParameters();
      for(final Parameter param : _parameters) {
        String _javaType = Util.toJavaType(param.getType());
        _builder.append(_javaType);
        _builder.append(" ");
        String _name = param.getName();
        _builder.append(_name);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<VariableDef> _filter = Iterables.<VariableDef>filter(this.scenario.getBody(), VariableDef.class);
      for(final VariableDef varDecl : _filter) {
        String _javaType_1 = Util.toJavaType(varDecl.getType());
        _builder.append(_javaType_1);
        _builder.append(" ");
        String _name_1 = varDecl.getName();
        _builder.append(_name_1);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<Question> _filter_1 = Iterables.<Question>filter(this.scenario.getBody(), Question.class);
      for(final Question question : _filter_1) {
        String _javaType_2 = Util.toJavaType(Util.returnTypeOfQuestion(question));
        _builder.append(_javaType_2);
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
    _builder.append("(");
    {
      EList<Parameter> _parameters = this.scenario.getParameters();
      boolean _hasElements = false;
      for(final Parameter param : _parameters) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _javaType = Util.toJavaType(param.getType());
        _builder.append(_javaType);
        _builder.append(" ");
        String _name = param.getName();
        _builder.append(_name);
      }
      if (_hasElements) {
        _builder.append(", ");
      }
    }
    _builder.append("External external) {");
    _builder.newLineIfNotEmpty();
    {
      EList<Parameter> _parameters_1 = this.scenario.getParameters();
      for(final Parameter param_1 : _parameters_1) {
        _builder.append("\t");
        _builder.append("this.");
        String _name_1 = param_1.getName();
        _builder.append(_name_1, "\t");
        _builder.append(" = ");
        String _name_2 = param_1.getName();
        _builder.append(_name_2, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
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
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("while(true) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("switch(nextInteraction) {");
    _builder.newLine();
    {
      Iterable<Statement> _filter = Iterables.<Statement>filter(this.scenario.getBody(), Statement.class);
      for(final Statement stmt : _filter) {
        _builder.append("\t\t\t");
        _builder.append("case \"");
        String _name_1 = stmt.getName();
        _builder.append(_name_1, "\t\t\t");
        _builder.append("\":");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("\t");
        CharSequence _genLogic = this.genLogic(stmt);
        _builder.append(_genLogic, "\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _genLogic(final Announce stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(");
    Object _parse = ExpParser.parse(stmt.getBody());
    _builder.append(_parse);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    CharSequence _genNextInteraction = this.genNextInteraction(stmt);
    _builder.append(_genNextInteraction);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _genLogic(final Question stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(");
    Object _parse = ExpParser.parse(stmt.getBody());
    _builder.append(_parse);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    {
      Type _returnTypeOfQuestion = Util.returnTypeOfQuestion(stmt);
      if ((_returnTypeOfQuestion instanceof IntType)) {
        _builder.append("try {");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _variableName = Util.variableName(stmt);
        _builder.append(_variableName, "\t");
        _builder.append(" = Integer.parseInt(br.readLine());");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _genValidation = this.genValidation(stmt);
        _builder.append(_genValidation, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _genSetVar = this.genSetVar(stmt);
        _builder.append(_genSetVar, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _genNextInteraction = this.genNextInteraction(stmt);
        _builder.append(_genNextInteraction, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.append("catch (Exception ex) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("break;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      } else {
        Type _returnTypeOfQuestion_1 = Util.returnTypeOfQuestion(stmt);
        if ((_returnTypeOfQuestion_1 instanceof StringType)) {
          CharSequence _variableName_1 = Util.variableName(stmt);
          _builder.append(_variableName_1);
          _builder.append(" = br.readLine();");
          _builder.newLineIfNotEmpty();
          CharSequence _genValidation_1 = this.genValidation(stmt);
          _builder.append(_genValidation_1);
          _builder.newLineIfNotEmpty();
          CharSequence _genSetVar_1 = this.genSetVar(stmt);
          _builder.append(_genSetVar_1);
          _builder.newLineIfNotEmpty();
          CharSequence _genNextInteraction_1 = this.genNextInteraction(stmt);
          _builder.append(_genNextInteraction_1);
          _builder.newLineIfNotEmpty();
        } else {
          Type _returnTypeOfQuestion_2 = Util.returnTypeOfQuestion(stmt);
          if ((_returnTypeOfQuestion_2 instanceof BooleanType)) {
            _builder.append("try {");
            _builder.newLine();
            _builder.append("\t");
            CharSequence _variableName_2 = Util.variableName(stmt);
            _builder.append(_variableName_2, "\t");
            _builder.append(" = Boolean.parseBoolean(br.readLine());");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            CharSequence _genValidation_2 = this.genValidation(stmt);
            _builder.append(_genValidation_2, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            CharSequence _genSetVar_2 = this.genSetVar(stmt);
            _builder.append(_genSetVar_2, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            CharSequence _genNextInteraction_2 = this.genNextInteraction(stmt);
            _builder.append(_genNextInteraction_2, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
            _builder.append("catch (Exception ex) {");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("break;");
            _builder.newLine();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence _genLogic(final End stmt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Exp _body = stmt.getBody();
      boolean _tripleNotEquals = (_body != null);
      if (_tripleNotEquals) {
        _builder.append("System.out.println(");
        Object _parse = ExpParser.parse(stmt.getBody());
        _builder.append(_parse);
        _builder.append(");");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("return \"");
    String _name = stmt.getName();
    _builder.append(_name);
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genValidation(final Question stmt) {
    CharSequence _xblockexpression = null;
    {
      Exp _typeAndValidation = stmt.getTypeAndValidation();
      if ((_typeAndValidation instanceof Type)) {
        return "";
      }
      String exp = ExpParser.parse(stmt.getTypeAndValidation()).toString();
      exp = exp.replaceAll("this", Util.variableName(stmt).toString()).replaceAll("int", Util.variableName(stmt).toString()).replaceAll("String", Util.variableName(stmt).toString()).replaceAll("boolean", Util.variableName(stmt).toString());
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("if (!(");
      _builder.append(exp);
      _builder.append(")) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("break;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence genSetVar(final Question stmt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      VariableDef _variable = stmt.getVariable();
      boolean _tripleNotEquals = (_variable != null);
      if (_tripleNotEquals) {
        String _name = stmt.getVariable().getName();
        _builder.append(_name);
        _builder.append(" = ");
        CharSequence _variableName = Util.variableName(stmt);
        _builder.append(_variableName);
        _builder.append(";");
      }
    }
    return _builder;
  }
  
  public CharSequence genNextInteraction(final Statement stmt) {
    CharSequence _xblockexpression = null;
    {
      ArrayList<Target> targets = CollectionLiterals.<Target>newArrayList();
      if ((stmt instanceof Announce)) {
        targets.addAll(((Announce)stmt).getTargets());
      } else {
        if ((stmt instanceof Question)) {
          targets.addAll(((Question)stmt).getTargets());
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      {
        for(final Target target : targets) {
          CharSequence _genTarget = this.genTarget(target, stmt);
          _builder.append(_genTarget);
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence genTarget(final Target target, final Statement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Exp _condition = target.getCondition();
      boolean _tripleNotEquals = (_condition != null);
      if (_tripleNotEquals) {
        _builder.append("if (");
        {
          if ((stmt instanceof Question)) {
            String _parseExpWithReplace = this.parseExpWithReplace(target.getCondition(), ((Question)stmt));
            _builder.append(_parseExpWithReplace);
          } else {
            Object _parse = ExpParser.parse(target.getCondition());
            _builder.append(_parse);
          }
        }
        _builder.append(") {");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      TargetDestination _destination = target.getDestination();
      if ((_destination instanceof Statement)) {
        _builder.append("\t");
        _builder.append("nextInteraction = \"");
        String _name = target.getDestination().getName();
        _builder.append(_name, "\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("break;");
        _builder.newLine();
      } else {
        TargetDestination _destination_1 = target.getDestination();
        if ((_destination_1 instanceof Scenario)) {
          _builder.append("\t");
          _builder.append("calledScenarioEnd = new Scenario");
          String _name_1 = target.getDestination().getName();
          _builder.append(_name_1, "\t");
          _builder.append("(");
          {
            EList<Exp> _arguments = target.getArguments();
            boolean _hasElements = false;
            for(final Exp arg : _arguments) {
              if (!_hasElements) {
                _hasElements = true;
              } else {
                _builder.appendImmediate(", ", "\t");
              }
              {
                if ((stmt instanceof Question)) {
                  String _parseExpWithReplace_1 = this.parseExpWithReplace(arg, ((Question)stmt));
                  _builder.append(_parseExpWithReplace_1, "\t");
                } else {
                  Object _parse_1 = ExpParser.parse(arg);
                  _builder.append(_parse_1, "\t");
                }
              }
            }
            if (_hasElements) {
              _builder.append(", ", "\t");
            }
          }
          {
            boolean _requireExternalInterface = Util.requireExternalInterface(this.program);
            if (_requireExternalInterface) {
              _builder.append("external");
            }
          }
          _builder.append(").interact();");
          _builder.newLineIfNotEmpty();
          {
            EList<EndingTarget> _endTargets = target.getEndTargets();
            for(final EndingTarget endTarget : _endTargets) {
              _builder.append("\t");
              _builder.append("if (calledScenarioEnd.equals(\"");
              String _name_2 = endTarget.getEndStatement().getName();
              _builder.append(_name_2, "\t");
              _builder.append("\")) {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              Object _genTarget = this.genTarget(endTarget.getTarget(), stmt);
              _builder.append(_genTarget, "\t\t");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("}");
              _builder.newLine();
            }
          }
          _builder.append("\t");
          _builder.append("break;");
          _builder.newLine();
        }
      }
    }
    {
      Exp _condition_1 = target.getCondition();
      boolean _tripleNotEquals_1 = (_condition_1 != null);
      if (_tripleNotEquals_1) {
        _builder.append("}");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String parseExpWithReplace(final Exp exp, final Question question) {
    return ExpParser.parse(exp).toString().replaceAll("this", Util.variableName(question).toString()).replaceAll("int", Util.variableName(question).toString()).replaceAll("String", Util.variableName(question).toString()).replaceAll("boolean", Util.variableName(question).toString());
  }
  
  public CharSequence genLogic(final Statement stmt) {
    if (stmt instanceof Announce) {
      return _genLogic((Announce)stmt);
    } else if (stmt instanceof End) {
      return _genLogic((End)stmt);
    } else if (stmt instanceof Question) {
      return _genLogic((Question)stmt);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(stmt).toString());
    }
  }
}
