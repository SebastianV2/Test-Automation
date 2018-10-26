package com.elempleo.certification.elempleotest.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;
/**
 * @author sebas-garcia-123@hotmail.com
 * Esta clase contiene el mapeo de los elementos a utilizar en el proyecto en las diferentes Tasks y Questions del proyecto
 * se declaran como final ya que su valor no cambia y como static para poder acceder a ellas desde otras clases.
 * 
 */
public class ElEmpleoHomeComponents {

	public static final Target COUNTRY = Target.the("Country Option").locatedBy("//a[@onclick='changeCountryOmniture({0})']");
	public static final Target HOME_TEXT = Target.the("Elempleo Text").locatedBy(".h3");
	public static final Target SEARCHBOX = Target.the("Search Option").located(By.id("searchBox"));
	public static final Target SEARCH_JOB = Target.the("Search JOB Option").locatedBy("/html/body/div[5]/div[2]/div/form/div/div/span[3]");
	public static final Target JOBS_LIST = Target.the("").locatedBy("//div[@class = 'result-item'][{0}]");
	public static final Target RESULTS = Target.the("Number of Offers Displayed").located(By.id("ResultsByPage"));
	public static final Target COOKIES_BANNER = Target.the("Cookies banner").locatedBy(".btnAcceptPolicyNavigationCO");
	public static final Target APPLY_BUTTON = Target.the("Apply Button").locatedBy(".offer-data > div:nth-child(4) > div:nth-child(1) > button:nth-child(1)");
	public static final Target MAX_OFFERS = Target.the("Max Number of Offers").locatedBy("/html/body/div[8]/div[4]/div[1]/div[4]/div/nav/span/strong[3]");
	public static final Target LOGIN_MESSAGE = Target.the("Login Message").locatedBy(".ee-title");
}
