package com.flisol2019.taller2019.obj;

public class User {
	
	
	private String nombre;
	private String correo;
	private Integer edad;

	
	public User() {
		
	}
	public User(String nombre, String correo, Integer edad ) {
		this.nombre = nombre;
		this.correo = correo;
		this.edad = edad;
	}

	
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the edad
	 */
	public Integer getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	

}
