package com.uce.edu.demo.deber5;

import org.springframework.stereotype.Component;

@Component
public class Materia {
	
	private String nombre;
	private String semestre;
	private int creditos;
	private int horasClase;
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public int getHorasClase() {
		return horasClase;
	}
	public void setHorasClase(int horasClase) {
		this.horasClase = horasClase;
	}
	
}
