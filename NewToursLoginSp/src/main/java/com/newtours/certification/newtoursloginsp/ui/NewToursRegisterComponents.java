package com.newtours.certification.newtoursloginsp.ui;

/**
 * @author sebas-garcia-123@hotmail.com
 * Esta clase contiene el mapeo de los elementos a utilizar en las diferentes Tasks y Questions del Registro.
 * 
 * Se declaran como final ya que su valor no cambia y como static para poder acceder a ellas desde otras clases.
 * 
 */

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewToursRegisterComponents {
	
	public static final Target NT_REGISTERPAGE_BUTTON = Target.the("NewTours Register Page Button").located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	public static final Target NT_REGISTER_FIRSTNAME = Target.the("NewTours Register Firstname field").located(By.name("firstName"));
	public static final Target NT_REGISTER_LASTNAME = Target.the("NewTours Register lastname field").located(By.name("lastName"));
	public static final Target NT_REGISTER_PHONE = Target.the("NewTours Register Phone field").located(By.name("phone"));
	public static final Target NT_REGISTER_EMAIL = Target.the("NewTours Register Email field").located(By.name("userName"));
	public static final Target NT_REGISTER_ADDRESS = Target.the("NewTours Register Address1 field").located(By.name("address1"));
	public static final Target NT_REGISTER_ADDRESS2 = Target.the("NewTours Register Address2 field").located(By.name("address2"));
	public static final Target NT_REGISTER_CITY = Target.the("NewTours Register City field").located(By.name("city"));
	public static final Target NT_REGISTER_STATE = Target.the("NewTours Register State/Province field").located(By.name("state"));
	public static final Target NT_REGISTER_POSTALCODE = Target.the("NewTours Register Postal Code field").located(By.name("postalCode"));
	public static final Target NT_REGISTER_COUNTRY = Target.the("NewTours Register Country field").located(By.name("country"));
	public static final Target NT_REGISTER_USERNAME = Target.the("NewTours Register Username field").located(By.name("email"));
	public static final Target NT_REGISTER_PASSWORD = Target.the("NewTours Register Password field").located(By.name("password"));
	public static final Target NT_REGISTER_CONFIRMPASSWORD = Target.the("NewTours Register Confirm Password field").located(By.name("confirmPassword"));
	public static final Target NT_REGISTER_BUTTON = Target.the("NewTours Register button").located(By.name("register"));

}
