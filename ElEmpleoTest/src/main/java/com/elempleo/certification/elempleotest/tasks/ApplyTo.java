package com.elempleo.certification.elempleotest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.elempleo.certification.elempleotest.ui.ElEmpleoHomeComponents;
/**
 * @author sebas-garcia-123@hotmail.com
 * Tarea que implementa Task, esta nos permite indicarlo a nuestro actor las tareas a realizar.
 * 
 * En este caso se utiliza para dar click en el boton Aplicar de la pagina el empleo, esto se logra
 * haciendo uso del metodo attempsTo() y Click.on().
 * 
 * El metodo aJobOffer nos devuelve la clase Apply con el valor que tomó, luego de ejecutar el perfomAs, 
 * esto se hace en tiempo de ejecución.
 */
public class ApplyTo implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ElEmpleoHomeComponents.APPLY_BUTTON));
	}

	public static ApplyTo aJobOffer() {
		return instrumented(ApplyTo.class);
	}

}
