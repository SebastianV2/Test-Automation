package com.elempleo.certification.elempleotest.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.elempleo.certification.elempleotest.models.ElEmpleoModel;
import com.elempleo.certification.elempleotest.ui.ElEmpleoHomeComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

/**
 * @author sebas-garcia-123@hotmail.com
 * Clase que implementa Task, esta nos permite indicarle a nuestro actor las tareas a realizar.
 * 
 * Dado que definimos un Modelo el cual contiene valores dados en el feature , lo instanciamos
 * y definimos su constructor para hacer uso de sus variables.
 * 
 * Mediante el metodo attempsTo() utilizamos esta tarea para dar click en el Banner de politicas de navegacion
 * de la pagina elempleo.com, despues mediante Enter.theValue() le indicamos al actor el texto que debe ingresar 
 * en la barra de busqueda, luego, mediante Click.on(), se da click en el boton buscar.
 * 
 * El metodo "searchBox" nos devuelve la clase TypeOn con el valor que tomó, luego de ejecutar el perfomAs,
 * esto se hace en tiempo de ejecución.
 */

public class TypeOn implements Task{
	
	private ElEmpleoModel job;
	
	public TypeOn(ElEmpleoModel job) {
		this.job = job;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ElEmpleoHomeComponents.COOKIES_BANNER)
				,Enter.theValue(job.getJob()).into(ElEmpleoHomeComponents.SEARCHBOX),
				Click.on(ElEmpleoHomeComponents.SEARCH_JOB));
	}

	public static TypeOn searchBox(ElEmpleoModel job) {
		return instrumented(TypeOn.class, job);
	}

}
