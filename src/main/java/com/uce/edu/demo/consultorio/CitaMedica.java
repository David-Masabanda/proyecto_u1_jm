package com.uce.edu.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class CitaMedica {
	
	private LocalDateTime fechaCita;
	
	private Doctor doctor;
	private Paciente paciente;
	
	//2: DI por constructor
	public CitaMedica(Doctor doctor, Paciente paciente) {
		this.doctor=doctor;
		this.paciente=paciente;
	}
	
	public String agendar(LocalDateTime fechaCita, String nombre, String apellido, String edad,String ciudad, 
			String nombrePaciente, int edadPaciente) {
		
		this.doctor.setNombre(nombre);
		this.doctor.setApellido(apellido);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(ciudad);
		
		this.paciente.setEdad(edadPaciente);
		this.paciente.setNombre(nombrePaciente);
		
		//Seteaos los atributos de la cita medica
		this.fechaCita=fechaCita;
		
		
		//Se inserta en la base de datos
		return "Cita agendada";
	}
	
	//SET y GET
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	
	
}
