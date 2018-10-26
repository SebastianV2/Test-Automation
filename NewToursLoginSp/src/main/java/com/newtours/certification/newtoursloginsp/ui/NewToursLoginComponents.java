package com.newtours.certification.newtoursloginsp.ui;

/**
 * @author sebas-garcia-123@hotmail.com
 * Esta clase contiene el mapeo de los elementos a utilizar en las diferentes Tasks y Questions del Login
 * 
 * Se declaran como final ya que su valor no cambia y como static para poder acceder a ellas desde otras clases.
 * 
 */

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewToursLoginComponents {

	public static final Target NEWTOURS_USERNAME = Target.the("New Tours Username field").located(By.name("userName"));
	public static final Target NEWTOURS_PASSWORD = Target.the("New Tours Password field").located(By.name("password"));
	public static final Target LOGIN_BUTTON = Target.the("New Tours Login button").located(By.name("login"));
	public static final Target NEWTOURS_LOGIN_TITLE = Target.the("New Tours Login Title").located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/font"));
	public static final Target NEWTOURS_HOMEPAGE_REGISTER_BUTTON = Target.the("New Tours Home Page Register Button").located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
}
