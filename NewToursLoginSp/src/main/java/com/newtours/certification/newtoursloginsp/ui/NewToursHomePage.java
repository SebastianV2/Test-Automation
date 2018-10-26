package com.newtours.certification.newtoursloginsp.ui;

/**
 * @author sebas-garcia-123@hotmail.com
 * Clase que hereda PageObject, esta nos permite indicarle a nuestro actor la pagina web por defecto
 * que debe abrir.
 * 
 * Heredamos de PageObject para poder hacer uso de DefaulURL
 * 
 */

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/")
public class NewToursHomePage extends PageObject {

}
