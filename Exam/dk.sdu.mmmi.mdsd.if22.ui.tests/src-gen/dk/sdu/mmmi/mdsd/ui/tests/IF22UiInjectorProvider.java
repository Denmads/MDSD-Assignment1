/*
 * generated by Xtext 2.26.0
 */
package dk.sdu.mmmi.mdsd.ui.tests;

import com.google.inject.Injector;
import dk.sdu.mmmi.mdsd.if22.ui.internal.If22Activator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class IF22UiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return If22Activator.getInstance().getInjector("dk.sdu.mmmi.mdsd.IF22");
	}

}
