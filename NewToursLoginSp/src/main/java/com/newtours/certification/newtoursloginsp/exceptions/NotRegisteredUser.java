package com.newtours.certification.newtoursloginsp.exceptions;

/**
 * @author sebas-garcia-123@hotmail.com
 * Esta clase permite manejar una excepcion, cuando el usuario no está registrado.
 *
 *  serialVersionUID: Variable predefinida de AssertionError, esta se crea una vez se importa AssertionError
 *  NOT_REGISTERED_USER_MESSAGE: Variable que contiene el mensaje que se muestra en el informe de serenity
 */

public class NotRegisteredUser extends AssertionError {

	private static final long serialVersionUID = 1L;
	public static final String NOT_REGISTERED_USER_MESSAGE = "Usuario o contraseña incorrectos";
	
	public NotRegisteredUser(String message, Throwable cause) {       
        super(message, cause);
    }
}
