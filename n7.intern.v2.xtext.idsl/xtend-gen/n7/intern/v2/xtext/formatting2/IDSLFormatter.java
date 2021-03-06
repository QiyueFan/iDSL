/**
 * generated by Xtext 2.25.0.M1
 */
package n7.intern.v2.xtext.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import n7.intern.v2.iDSL.Component;
import n7.intern.v2.iDSL.Data;
import n7.intern.v2.iDSL.IoTFramework;
import n7.intern.v2.iDSL.Output;
import n7.intern.v2.xtext.services.IDSLGrammarAccess;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class IDSLFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private IDSLGrammarAccess _iDSLGrammarAccess;
  
  protected void _format(final IoTFramework ioTFramework, @Extension final IFormattableDocument document) {
    EList<Component> _components = ioTFramework.getComponents();
    for (final Component component : _components) {
      document.<Component>format(component);
    }
    EList<Output> _outputs = ioTFramework.getOutputs();
    for (final Output output : _outputs) {
      document.<Output>format(output);
    }
  }
  
  protected void _format(final Component component, @Extension final IFormattableDocument document) {
    EList<Data> _data = component.getData();
    for (final Data data : _data) {
      document.<Data>format(data);
    }
  }
  
  public void format(final Object component, final IFormattableDocument document) {
    if (component instanceof XtextResource) {
      _format((XtextResource)component, document);
      return;
    } else if (component instanceof Component) {
      _format((Component)component, document);
      return;
    } else if (component instanceof IoTFramework) {
      _format((IoTFramework)component, document);
      return;
    } else if (component instanceof EObject) {
      _format((EObject)component, document);
      return;
    } else if (component == null) {
      _format((Void)null, document);
      return;
    } else if (component != null) {
      _format(component, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(component, document).toString());
    }
  }
}
