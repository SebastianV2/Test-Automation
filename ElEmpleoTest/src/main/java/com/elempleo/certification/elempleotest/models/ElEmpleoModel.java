package com.elempleo.certification.elempleotest.models;
/**
 * @author sebas-garcia-123@hotmail.com
 * Clase definida para recibir los datos enviados desde el feature
 * con el fin de hacer uso de los metodos get() y set()
 * 
 */
public class ElEmpleoModel {

	String country;
	String job;
	String option;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}
	
}
