package com.elempleo.certification.elempleotest.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import com.elempleo.certification.elempleotest.exceptions.OffersShowed;
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
 * Mediante el metodo attempsTo() utilizamos esta tarea para dar click en el comboBox de elementos a mostrar por la pagina para
 * que muestre el numero maximo de elementos, es decir 100, esto se realiza haciendo uso de SelectFromOptions().
 * 
 * Luego, mediante Should(), que recibe una Question, comprobamos que el numero de elemento recibido existe, si este no existe
 * se genera un excepcion. En caso de que si exista mediante Click.on(), se selecciona el elemento deseado.
 * 
 * El metodo "of" nos devuelve la clase SelectOne con el valor que tomó, luego de ejecutar el perfomAs,
 * esto se hace en tiempo de ejecución.
 */

public class SelectOne implements Task{
	
	private ElEmpleoModel option;
	
	public SelectOne(ElEmpleoModel option) {
		this.option = option;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.should(seeThat(the(ElEmpleoHomeComponents.JOBS_LIST.of(option.getOption())), isVisible()).orComplainWith(OffersShowed.class, 
				offerSelectedDoesNotExists()));
		actor.attemptsTo(Click.on(ElEmpleoHomeComponents.JOBS_LIST.of(option.getOption())));
	}
	
	public String offerSelectedDoesNotExists() {
		return String.format(OffersShowed.MAX_NUMBER_OF_OFFERS);
	}
	
	public static SelectOne of(ElEmpleoModel option) {
		return instrumented(SelectOne.class, option);
	}

}
