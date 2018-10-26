package com.elempleo.certification.elempleotest.stepdefinitions;

/**
 * @author sebas-garcia-123@hotmail.com
 *
 *Esta clase contiene los pasos a realizar por el actor, en este caso sebas.
 *
 */

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.hasItem;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.elempleo.certification.elempleotest.models.ElEmpleoModel;
import com.elempleo.certification.elempleotest.questions.LoginPage;
import com.elempleo.certification.elempleotest.tasks.ApplyTo;
import com.elempleo.certification.elempleotest.tasks.OpenBrowser;
import com.elempleo.certification.elempleotest.tasks.Select;
import com.elempleo.certification.elempleotest.tasks.SelectOne;
import com.elempleo.certification.elempleotest.tasks.TypeOn;
import com.elempleo.certification.elempleotest.ui.ElEmpleoHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ElEmpleoTestStepDefinitions {

	@Managed(driver = "chrome") //Anotacion la cual indica el navegador a utilizar.
	private WebDriver hisBrowser; //se define la variable webbdriver la cual recibe el driver del navegador.
	private Actor sebas = Actor.named("Sebas"); //Se define el actor que realizará cada uno de los pasos en el test.
	
	private ElEmpleoHomePage elEmpleohomePage; //Instancia de la clase que contiene la pagina web por defecto.
	
	@Before //Anotacion que indica que debe ejecutarse antes de la prueba.
	public void setUp() {
		sebas.can(BrowseTheWeb.with(hisBrowser)); //definmos la habilidad del actor para nevegar en el navegador escogido.
	}
	
	@Given("^thet sebas in on elempleo homepage$") //Precondiciones, lo que se debe cumplir antes de relizar las acciones.
	public void thetSebasInOnElempleoHomepage() throws Exception {
	    sebas.wasAbleTo(OpenBrowser.on(elEmpleohomePage)); // Se abre el navegador en la pagina por defecto.
	}

	@When("^he clicks on desired country and he gets into selected country homepage$") //Acciones que se realizan, es decir lo que estamos probando.
	public void heClicksOnDesiredCountryAndHeGetsIntoSelectedCountryHomepage(List<ElEmpleoModel> country) throws Exception {
		sebas.attemptsTo(Select.a(country.get(0))); //Seleccionamos un pais.
	}

	@When("^he searches a job on search box$") //Acciones que se realizan, es decir lo que estamos probando.
	public void heSearchesAJobOnSearchBox(List<ElEmpleoModel> desiredJob) throws Exception {
	    sebas.attemptsTo(TypeOn.searchBox(desiredJob.get(0))); //Se escribe en el caja de texto y se da click en buscar.
	}

	@When("^he clicks one option from list of jobs$") //Acciones que se realizan, es decir lo que estamos probando.
	public void heClicksOneOptionFromListOfJobs(List<ElEmpleoModel> theJobOptions) throws Exception {
	   sebas.attemptsTo(SelectOne.of(theJobOptions.get(0))); //Se seleciona uno de los resultados obtenidos en la busqueda.
	}

	@Then("^he applies to selected offer$") //Este metodo comprueba que los pasos anterios hayan sido exitosos.
	public void heAppliesToSelectedOffer() throws Exception {
	    sebas.attemptsTo(ApplyTo.aJobOffer()); //Damos click en el boton aplicar a oferta
	    sebas.should(seeThat(LoginPage.isDisplayed(), hasItem("Crea tu cuenta en elempleo.com"))); //Dado que no estamos logueados en la pagina, se comprueba
	    																		  //que se muestre la pagina de Login
	}
}
