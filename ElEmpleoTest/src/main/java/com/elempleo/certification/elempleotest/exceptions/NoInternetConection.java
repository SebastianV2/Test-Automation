package com.elempleo.certification.elempleotest.exceptions;
/**
 * @author sebas-garcia-123@hotmail.com
 * Esta clase permite manejar una excepcion, cuando no existe conexion a internet.
 *
 *  serialVersionUID: Variable predefinida de AssertionError, esta se crea una vez se importa AssertionError
 *  No_INTERNET_CONECTION_MESSAGE: Variable que contiene el mensaje que se muestra en el informe de serenity
 */
public class NoInternetConection extends AssertionError {

	private static final long serialVersionUID = 1L;
	public static final String NO_INTERNET_CONECTION_MESSAGE = "No internet conection";
	
	public NoInternetConection(String message, Throwable cause) {       
        super(message, cause);
    }
	
}
