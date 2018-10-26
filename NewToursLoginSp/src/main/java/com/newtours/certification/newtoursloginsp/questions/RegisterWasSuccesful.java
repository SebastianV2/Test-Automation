package com.newtours.certification.newtoursloginsp.questions;

import java.util.List;

import com.newtours.certification.newtoursloginsp.ui.NewToursRegisteredMenu;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RegisterWasSuccesful implements Question<List<String>>{

	@Override
	public List<String> answeredBy(Actor actor) {
		return Text.of(NewToursRegisteredMenu.REGISTERD_MESSAGE).viewedBy(actor).asList();
	}

	public static Question<List<String>> andPage() {
		return new RegisterWasSuccesful();
	}

}
