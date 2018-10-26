package com.elempleo.certification.elempleotest.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.elempleo.certification.elempleotest.models.ElEmpleoModel;
import com.elempleo.certification.elempleotest.ui.ElEmpleoHomeComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

/**
 * @author sebas-garcia-123@hotmail.com
 * Clase que implementa Task, esta nos permite indicarle a nuestro actor las tareas a realizar.
 * 
 * Dado que definimos un Modelo el cual contiene valores dados en el feature , lo instanciamos
 * y definimos su constructor para hacer uso de sus variables.
 * 
 * En este caso utilizamos esta tarea para dar click en el pais seleccionado en el feature.
 * 
 * El metodo "a" nos devuelve la clase Select con el valor que tomó, luego de ejecutar el perfomAs,
 * esto se hace en tiempo de ejecución.
 */

public class Select implements Task {
	
	private ElEmpleoModel pais;
	
	public Select(ElEmpleoModel pais) {
		this.pais = pais;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ElEmpleoHomeComponents.COUNTRY.of(pais.getCountry())));
	}

	public static Select a(ElEmpleoModel pais) {
		return instrumented(Select.class, pais);
	}
}
