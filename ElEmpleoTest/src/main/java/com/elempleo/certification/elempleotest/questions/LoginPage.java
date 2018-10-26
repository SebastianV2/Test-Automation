package com.elempleo.certification.elempleotest.questions;

import java.util.List;

import com.elempleo.certification.elempleotest.ui.ElEmpleoHomeComponents;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
/**
 * @author sebas-garcia-123@hotmail.com
 * Clase que implementa Question, esta nos sirve para verificar un requisito.
 * 
 * En este caso se utiliza para verificar un texto en pantalla, esta nos devuelve dicho texto, el cual guardamos en
 * una lista para luego poder hacer usos de las librerias seeThat() y hasItem().
 */
public class LoginPage implements Question<List<String>>{

	@Override
	public List<String> answeredBy(Actor actor) {
		return Text.of(ElEmpleoHomeComponents.LOGIN_MESSAGE).viewedBy(actor).asList();
	}

	public static Question<List<String>> isDisplayed() {
		return new LoginPage();
	}
}
