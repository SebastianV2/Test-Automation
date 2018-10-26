package com.newtours.certification.newtoursloginsp.tasks;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.CoreMatchers.hasItem;

import com.newtours.certification.newtoursloginsp.exceptions.NotRegisteredUser;
import com.newtours.certification.newtoursloginsp.questions.FlightFinderMenu;
import com.newtours.certification.newtoursloginsp.ui.NewToursLoginComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class MakeClick implements Task{

	@Override
	@Step("{0} cliks sing-in button")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(NewToursLoginComponents.LOGIN_BUTTON));
		actor.should(seeThat(FlightFinderMenu.isVisibleAnd(), hasItem("Passengers:")).orComplainWith(NotRegisteredUser.class, 
		 getNotRegisteredUserMessage()));
	}

	public String getNotRegisteredUserMessage() {
		return String.format(NotRegisteredUser.NOT_REGISTERED_USER_MESSAGE);
	}
	
	public static MakeClick onSignInButton() {
			return instrumented(MakeClick.class);
	}
}
