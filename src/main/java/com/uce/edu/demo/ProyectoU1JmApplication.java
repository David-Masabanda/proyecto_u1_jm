package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1JmApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estudiante e=new Estudiante();
		e.setNombre("David");
		e.setApellido("Lopez");
		e.setCedula("1719139881");

		this.estudianteService.ingresarEstudiante(e);
		
		//Usar los 3 metodos restantes
		e.setCedula("1719139980");
		this.estudianteService.actualizarEstudiante(e);
		this.estudianteService.buscarPorApellido("Lopez");
		this.estudianteService.borrarEstudiante("1719139881");
	}

}
