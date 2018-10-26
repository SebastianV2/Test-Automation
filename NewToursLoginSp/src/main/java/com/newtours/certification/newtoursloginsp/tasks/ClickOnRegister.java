package com.newtours.certification.newtoursloginsp.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.newtours.certification.newtoursloginsp.ui.NewToursLoginComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class ClickOnRegister implements Task {

	@Override
	@Step("Click on register button")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(NewToursLoginComponents.NEWTOURS_HOMEPAGE_REGISTER_BUTTON));
	}

	public static ClickOnRegister button() {
		return instrumented(ClickOnRegister.class);
	}
	
}