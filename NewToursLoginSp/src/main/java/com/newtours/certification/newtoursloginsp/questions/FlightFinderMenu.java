package com.newtours.certification.newtoursloginsp.questions;

import java.util.List;

import com.newtours.certification.newtoursloginsp.ui.NewToursFlightFinderMenuTitle;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class FlightFinderMenu implements Question<List<String>> {

	@Override
	public List<String> answeredBy(Actor actor) {
		return Text.of(NewToursFlightFinderMenuTitle.FLIGHTFINDERMENU_TITLE).viewedBy(actor).asList();
	}

	public static Question<List<String>> isVisibleAnd() {
		return new FlightFinderMenu();
	}

}
