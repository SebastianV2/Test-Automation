package com.newtours.certification.newtoursloginsp.ui;

/**
 * @author sebas-garcia-123@hotmail.com
 * 
 * Esta clase contiene el mapeo de un elemento utilizado para comprobar que el registro fue exitoso.
 * 
 * Se declaran como final ya que su valor no cambia y como static para poder acceder a ellas desde otras clases.
 * 
 */

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewToursRegisteredMenu {

	public static final Target REGISTERD_MESSAGE = Target.the("NewTours Register: Mensaje de registro exitoso").located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]")); 
	
}
