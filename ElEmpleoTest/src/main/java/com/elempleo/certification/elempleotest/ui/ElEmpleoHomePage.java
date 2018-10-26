package com.elempleo.certification.elempleotest.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * @author sebas-garcia-123@hotmail.com
 * Clase que hereda PageObject, esta nos permite indicarle a nuestro actor la pagina web por defecto
 * que debe abrir.
 * 
 * Heredamos de PageObject para poder hacer uso de DefaulURL
 * 
 */

@DefaultUrl("http://www.elempleo.com/")
public class ElEmpleoHomePage extends PageObject {
	
}
