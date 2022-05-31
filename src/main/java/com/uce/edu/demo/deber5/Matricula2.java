package com.uce.edu.demo.deber5;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class Matricula2 {
	
	private Estudiante estudiante;
	private Materia materia;
	
	//Por Constructor
	public Matricula2(Estudiante estudiante, Materia materia) {
		this.estudiante=estudiante;
		this.materia=materia;
	}
	
	public String matriculacion(String nombre, String apellido, LocalDateTime fechaNacimiento,
			String nombreMateria, String semestre, int creditos, int horasClase) {
		
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		this.estudiante.setFechaNacimiento(fechaNacimiento);
		
		this.materia.setNombre(nombreMateria);
		this.materia.setSemestre(semestre);
		this.materia.setCreditos(creditos);
		this.materia.setHorasClase(horasClase);
			
		return "La matriculacion fue exitosa";
	}

	
	//SET y GET
	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
}