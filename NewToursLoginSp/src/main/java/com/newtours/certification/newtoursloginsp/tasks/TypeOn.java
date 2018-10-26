package com.newtours.certification.newtoursloginsp.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.newtours.certification.newtoursloginsp.models.NewUserModel;
import com.newtours.certification.newtoursloginsp.ui.NewToursRegisterComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

public class TypeOn implements Task {
	
	private NewUserModel newUserModel;
	
	public TypeOn(NewUserModel newUserModel) {
		this.newUserModel = newUserModel;
	}
	
	@Override
	@Step("{0} types on all register fields")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(newUserModel.getFirstname()).into(NewToursRegisterComponents.NT_REGISTER_FIRSTNAME),
					     Enter.theValue(newUserModel.getLastname()).into(NewToursRegisterComponents.NT_REGISTER_LASTNAME),
					     Enter.theValue(newUserModel.getPhone()).into(NewToursRegisterComponents.NT_REGISTER_PHONE),
					     Enter.theValue(newUserModel.getEmail()).into(NewToursRegisterComponents.NT_REGISTER_EMAIL),
					     Enter.theValue(newUserModel.getAddress()).into(NewToursRegisterComponents.NT_REGISTER_ADDRESS),
					     Enter.theValue(newUserModel.getAddress2()).into(NewToursRegisterComponents.NT_REGISTER_ADDRESS2),
					     Enter.theValue(newUserModel.getCity()).into(NewToursRegisterComponents.NT_REGISTER_CITY),
					     Enter.theValue(newUserModel.getState()).into(NewToursRegisterComponents.NT_REGISTER_STATE),
					     Enter.theValue(newUserModel.getPostalcode()).into(NewToursRegisterComponents.NT_REGISTER_POSTALCODE),
					     SelectFromOptions.byVisibleText(newUserModel.getCountry()).from(NewToursRegisterComponents.NT_REGISTER_COUNTRY),
					     Enter.theValue(newUserModel.getUsername()).into(NewToursRegisterComponents.NT_REGISTER_USERNAME),
					     Enter.theValue(newUserModel.getPassword()).into(NewToursRegisterComponents.NT_REGISTER_PASSWORD),
					     Enter.theValue(newUserModel.getConfirmpass()).into(NewToursRegisterComponents.NT_REGISTER_CONFIRMPASSWORD));
	}

	public static TypeOn register(NewUserModel newUserModel) {
		return instrumented(TypeOn.class, newUserModel);
	}

}
