package com.newtours.certification.newtoursloginsp.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.newtours.certification.newtoursloginsp.models.UsuarioModel;
import com.newtours.certification.newtoursloginsp.ui.NewToursLoginComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Write implements Task {
	
	private UsuarioModel usuarioModel;
	
	public Write(UsuarioModel usuarioModel) {
		this.usuarioModel = usuarioModel;
	}
	
	@Override
	@Step("{0} types username and password")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(usuarioModel.getUsername()).into(NewToursLoginComponents.NEWTOURS_USERNAME),
		                 Enter.theValue(usuarioModel.getPassword()).into(NewToursLoginComponents.NEWTOURS_PASSWORD));
	}
	
	public static Write credentialsOn(UsuarioModel usuarioModel) {
		return instrumented(Write.class, usuarioModel);
	}
}
