package com.elempleo.certification.elempleotest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.CoreMatchers.hasItem;

import com.elempleo.certification.elempleotest.exceptions.NoInternetConection;
import com.elempleo.certification.elempleotest.questions.ElEmpleoHome;

import net.serenitybdd.core.pages.PageObject;

/**
 * @author sebas-garcia-123@hotmail.com
 * Clase que implementa Task, esta nos permite indicarle a nuestro actor las tareas a realizar.
 * 
 * Dado que definimos una clase PageObject la cual contiene la pagina predeterminada , la instanciamos
 * y definimos su constructor para hacer uso de sus variables.
 * 
 * En este caso utilizamos esta tarea para abrir el navegador en la pagina principal de elempleo.com
 * mediante el metodo Open.browserOn() ya que este recibe como parametro la instancia de PageObject la cual contiene
 * nuestra pagina por defecto.
 * 
 * Luego, se valida mediante el metodo should() que se muestre un texto en pantalla, dado que este no se muestre en pantalla
 * se maneja la excepcion mediante un AssertionError.
 * 
 * El metodo getNoInternetConectionMessage() nos devuelve el mensaje que se mostrará en el informe de serenity.
 * 
 * El metodo on nos devuelve la clase OpenBrowser con el valor que tomó, luego de ejecutar el perfomAs,
 * esto se hace en tiempo de ejecución.
 */

public class OpenBrowser implements Task {
	
	private PageObject page;
	
	public OpenBrowser(PageObject page) {
		this.page = page;
	}
	
	@Override
	@Step("{0} opens the browser on elempleo Homepage")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		actor.should(seeThat(ElEmpleoHome.isDisplayedAnd(), 
				hasItem("Registra tu hoja de vida en elempleo.com y aplica a las mejores ofertas de empleo de Latinoamérica."))
				.orComplainWith(NoInternetConection.class, 
				 getNoInternetConectionMessage()));
	}

	public String getNoInternetConectionMessage() {
		return String.format(NoInternetConection.NO_INTERNET_CONECTION_MESSAGE);
	}

	public static OpenBrowser on(PageObject page) {
		return instrumented(OpenBrowser.class, page);
	}
}
