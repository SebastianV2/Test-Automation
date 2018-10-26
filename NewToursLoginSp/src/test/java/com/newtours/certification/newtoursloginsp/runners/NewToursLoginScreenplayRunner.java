package com.newtours.certification.newtoursloginsp.runners;

/**
 * @author sebas-garcia-123@hotmail.com
 * 
 * Clase runner, esta  nos permite correr los diferentes test, definidos por los features y los
 * stepdefinitions
 * 
 * RunWith: nos permite especificar la clase que correrá los tests
 * CucumberOptions: Nos permite utilizar las opciones que contiene cucumber
 * 
 * features: Carpeta en la cual estan guardadas las features del proyecto.
 * glue: Carptea en la cual estan guardados los stepdefinitions
 * snippets: lo utilizamos para que al generar los metodos estos cumplan con CAMELCASE
 */

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
				 glue= "com.newtours.certification.newtoursloginsp.stepdefinitions",
				 snippets = SnippetType.CAMELCASE)
public class NewToursLoginScreenplayRunner {

}
