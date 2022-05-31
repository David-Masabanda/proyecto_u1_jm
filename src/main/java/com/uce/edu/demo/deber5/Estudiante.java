package com.uce.edu.demo.deber5;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Estudiante {
	
	private String nombre;
	private String apellido;
	private LocalDateTime fechaNacimiento;
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
}
