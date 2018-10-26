package com.elempleo.certification.elempleotest.exceptions;
/**
 * @author sebas-garcia-123@hotmail.com
 * Esta clase permite manejar una excepcion, cuando el numero de elemento no existe.
 *
 *  serialVersionUID: Variable predefinida de AssertionError, esta se crea una vez se importa AssertionError.
 *  MAX_NUMBER_OF_OFFERS: Variable que contiene el mensaje que se muestra en el informe de serenity.
 */
public class OffersShowed extends AssertionError{

	private static final long serialVersionUID = 1L;
	public static final String MAX_NUMBER_OF_OFFERS = "El numero de ofertas no es correcto";
	
	public OffersShowed(String message, Throwable cause) {       
        super(message, cause);
    }
}
