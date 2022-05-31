package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.deber5.Matricula;
import com.uce.edu.demo.deber5.Matricula2;
import com.uce.edu.demo.deber5.Matricula3;

@SpringBootApplication
public class ProyectoU1JmApplication implements CommandLineRunner{
	
//	//1: DI por atributo
//	@Autowired
//	private CitaMedica cita;

//	//3: DI por metodos set
//	@Autowired
//	private CitaMedica2 cita;
	
	@Autowired
	private Matricula matricula;
	
	@Autowired
	private Matricula2 matricula2;
	
	@Autowired
	private Matricula3 matricula3;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		//Practica en clases 
//		System.out.println("Mi primer proyecto con Spring Framework");	
//		String respuesta=cita.agendar(LocalDateTime.now(), "Javier", "Lopez", "35", "Quito", "Luis", 19);
//		System.out.println(respuesta);
		
		System.out.println();
		
		//Practica DEBER 5
		System.out.println("DEBER 5: Modelos de DI");	
		System.out.println("[1]: Por atributos");
		String referencia=matricula.matriculacion("David", "Lopez", LocalDateTime.parse("1999-12-08T15:31"),
				"Inteligencia Artificial", "Sexto", 38, 96);
		System.out.println(referencia);
		System.out.println("-------------------");
		
		System.out.println("[2]: Por constructor");
		referencia=matricula2.matriculacion("Sara", "Martinez", LocalDateTime.parse("1999-02-14T19:21"),
				"Bases de Datos II", "Quinto", 26, 64);
		System.out.println(referencia);
		System.out.println("-------------------");
		
		System.out.println("[3]: Por metodos SET");
		referencia=matricula3.matriculacion("Juan", "Alban", LocalDateTime.parse("1998-12-14T21:03"),
				"Programacion Web", "Octavo", 31, 96);
		System.out.println(referencia);
		
	}

}
