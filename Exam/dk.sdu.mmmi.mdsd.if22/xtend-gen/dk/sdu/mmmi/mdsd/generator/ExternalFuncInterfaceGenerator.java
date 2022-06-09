package dk.sdu.mmmi.mdsd.generator;

import com.google.common.collect.Iterators;
import dk.sdu.mmmi.mdsd.iF22.Function;
import dk.sdu.mmmi.mdsd.iF22.IF22;
import dk.sdu.mmmi.mdsd.iF22.Type;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class ExternalFuncInterfaceGenerator {
  private IF22 program;
  
  private String packageName;
  
  private int paramCounter = 0;
  
  public ExternalFuncInterfaceGenerator(final IF22 program, final String packageName) {
    this.program = program;
    this.packageName = packageName;
  }
  
  public CharSequence genFile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package interactive_story.");
    _builder.append(this.packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface External {");
    _builder.newLine();
    {
      Iterable<Function> _iterable = IteratorExtensions.<Function>toIterable(Iterators.<Function>filter(this.program.eAllContents(), Function.class));
      for(final Function func : _iterable) {
        _builder.append("\t");
        _builder.append("public ");
        String _javaType = Util.toJavaType(func.getReturnType());
        _builder.append(_javaType, "\t");
        _builder.append(" ");
        String _name = func.getName();
        _builder.append(_name, "\t");
        _builder.append("(");
        {
          EList<Type> _parameterTypes = func.getParameterTypes();
          boolean _hasElements = false;
          for(final Type paramType : _parameterTypes) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "\t");
            }
            String _javaType_1 = Util.toJavaType(paramType);
            _builder.append(_javaType_1, "\t");
            _builder.append(" param");
            int _plusPlus = this.paramCounter++;
            _builder.append(_plusPlus, "\t");
          }
        }
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
