package com.newtours.certification.newtoursloginsp.stepdefinitions;
/**
 * @author sebas-garcia-123@hotmail.com
 *
 *Esta clase contiene los pasos a realizar por el actor en la ventana del registro, en este caso sebas.
 *
 *	Managed: Anotacion la cual indica el navegador a utilizar.
	WebDriver: se define la variable webbdriver la cual recibe el driver del navegador.
	Actor: Se define el actor que realizará cada uno de los pasos en el test.
	NewToursHomePage: Instancia de la clase que contiene la pagina web por defecto.
	Before: Indica que debe ejecutarse antes de la prueba.
	setUp(): definmos la habilidad del actor para nevegar en el navegador escogido.
	Given: Precondiciones, lo que se debe cumplir antes de relizar las acciones.
	When: Acciones que se realizan, es decir lo que estamos probando.
	Then:Este metodo comprueba que los pasos anterios hayan sido exitosos.
 */
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.hasItem;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.newtours.certification.newtoursloginsp.models.NewUserModel;
import com.newtours.certification.newtoursloginsp.questions.RegisterWasSuccesful;
import com.newtours.certification.newtoursloginsp.tasks.ClickOn;
import com.newtours.certification.newtoursloginsp.tasks.ClickOnRegister;
import com.newtours.certification.newtoursloginsp.tasks.OpenHomePage;
import com.newtours.certification.newtoursloginsp.tasks.TypeOn;
import com.newtours.certification.newtoursloginsp.ui.NewToursHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class NewToursRegisterSpStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor sebas = Actor.named("Sebas");
	
	private NewToursHomePage browser;
	
	@Before
	public void setUp() {
		sebas.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that sebas wants to register into new tours he gets into register page$")
	public void thatSebasWantsToRegisterIntoNewToursHeGetsIntoRegisterPage() throws Exception {
	    sebas.wasAbleTo(OpenHomePage.on(browser), //Abrimos el navegador en la pagina por defecto.
	    				ClickOnRegister.button()); //Damos click en el botonr registro.
	}

	@When("^he types all required fields$")
	public void heTypesAllRequiredFields(List<NewUserModel> fields) throws Exception {
	    sebas.attemptsTo(TypeOn.register(fields.get(0)));//Llenamos cada uno de los campos del registro.
	}

	@When("^he clicks register button$")
	public void heClicksRegisterButton() throws Exception {
	   sebas.attemptsTo(ClickOn.registerButton()); //Damos click en el boton sumbmit del registro.
	}

	@Then("^he should see a message that confirms register was succesful$")
	public void heShouldSeeAMessageThatConfirmsRegisterWasSuccesful() throws Exception {
		sebas.should(seeThat(RegisterWasSuccesful.andPage(), hasItem("sign-in")));
		//Comprobamos que el registro haya sido exitoso comprobando un elemento en pantalla.
	}
	
}
