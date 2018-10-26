package com.newtours.certification.newtoursloginsp.ui;

/**
 * @author sebas-garcia-123@hotmail.com
 * 
 * Esta clase contiene el mapeo de un elemento utilizado para comprobar que el login fue exitoso.
 * 
 * Se declaran como final ya que su valor no cambia y como static para poder acceder a ellas desde otras clases.
 * 
 */

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class NewToursFlightFinderMenuTitle {

	public static final Target FLIGHTFINDERMENU_TITLE = Target.the("New Tours Flight Finder Menu Title").located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[1]/font/b"));
	
}
