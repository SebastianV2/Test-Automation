package com.newtours.certification.newtoursloginsp.stepdefinitions;
/**
 * @author sebas-garcia-123@hotmail.com
 *
 *Esta clase contiene los pasos a realizar por el actor en la vantana de login, en este caso sebas.
 *
 */
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.hasItem;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.newtours.certification.newtoursloginsp.models.UsuarioModel;
import com.newtours.certification.newtoursloginsp.questions.FlightFinderMenu;
import com.newtours.certification.newtoursloginsp.tasks.MakeClick;
import com.newtours.certification.newtoursloginsp.tasks.OpenTheBrowser;
import com.newtours.certification.newtoursloginsp.tasks.Write;
import com.newtours.certification.newtoursloginsp.ui.NewToursHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class NewToursLoginSpStepDefinitions {
	
	@Managed(driver = "chrome")//Anotacion la cual indica el navegador a utilizar.
	private WebDriver hisBrowser;//se define la variable webbdriver la cual recibe el driver del navegador.
	private Actor sebas = Actor.named("Sebas"); //Se define el actor que realizará cada uno de los pasos en el test.
	
	private NewToursHomePage newToursHomePage; //Instancia de la clase que contiene la pagina web por defecto.
	
	@Before //Anotacion que indica que debe ejecutarse antes de la prueba.
	public void setUp() {
		sebas.can(BrowseTheWeb.with(hisBrowser)); //definmos la habilidad del actor para nevegar en el navegador escogido.
	}
	
	@Given("^that sebas wants to login into new tours$") //Precondiciones, lo que se debe cumplir antes de relizar las acciones.
	public void thatSebasWantsToLoginIntoNewTours() throws Exception {
	    sebas.wasAbleTo(OpenTheBrowser.on(newToursHomePage)); // Se abre el navegador en la pagina por defecto.
	}
	
	@When("^he types username and password$") //Acciones que se realizan, es decir lo que estamos probando.
	public void heTypesUsernameAndPassword(List<UsuarioModel> theFields) throws Exception {
		sebas.attemptsTo(Write.credentialsOn(theFields.get(0))); // Escribimos los datos recibidos, en los campos del login.
	}

	@When("^he clicks sing-in button$") //Acciones que se realizan, es decir lo que estamos probando.
	public void heClicksSingInButton() throws Exception {
	    sebas.attemptsTo(MakeClick.onSignInButton());//Damos click en el boton sign-in.
	}
	
	@Then("^he should see the flight finder menu$") //Este metodo comprueba que los pasos anterios hayan sido exitosos.
	public void heShouldSeeTheFlightFinderMenu() throws Exception {
	    sebas.should(seeThat(FlightFinderMenu.isVisibleAnd(), hasItem("Passengers:"))); //Comprobamos que el login haya sido exitoso
	    																				//verificando un elemento en pantalla.
	}
}
