package com.newtours.certification.newtoursloginsp.tasks;

import com.newtours.certification.newtoursloginsp.ui.NewToursRegisterComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class ClickOn implements Task {

	@Override
	@Step("{0} cliks submit button")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(NewToursRegisterComponents.NT_REGISTER_BUTTON));
	}

	public static ClickOn registerButton() {
		return Tasks.instrumented(ClickOn.class);
	}

}
