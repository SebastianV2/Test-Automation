package com.newtours.certification.newtoursloginsp.models;

/**
 * @author sebas-garcia-123@hotmail.com
 * Clase definida para recibir los datos enviados desde el feature
 * con el fin de hacer uso de los metodos get() y set()
 * 
 */

public class UsuarioModel {

	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
