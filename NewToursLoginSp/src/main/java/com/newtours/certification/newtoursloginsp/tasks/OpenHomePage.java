package com.newtours.certification.newtoursloginsp.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.CoreMatchers.hasItem;

import com.newtours.certification.newtoursloginsp.exceptions.NoInternetConection;
import com.newtours.certification.newtoursloginsp.questions.NewToursHome;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenHomePage implements Task {

	private PageObject homePage;
	
	public OpenHomePage(PageObject homePage) {
		this.homePage = homePage;
	}
	
	@Override
	@Step("{0} opens the browser on New Tours Register Page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(homePage));
		actor.should(seeThat(NewToursHome.isDisplayed(), hasItem("User Name:")).orComplainWith(NoInternetConection.class, 
				 getNoInternetConectionMessage()));
	}

	public String getNoInternetConectionMessage() {
		return String.format(NoInternetConection.NO_INTERNET_CONECTION_MESSAGE);
	}

	public static OpenHomePage on(PageObject homePage) {
		return instrumented(OpenHomePage.class, homePage);
	}	
}
