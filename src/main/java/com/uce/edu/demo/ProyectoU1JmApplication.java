package com.uce.edu.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1JmApplication implements CommandLineRunner{
	
	@Autowired
	private ProfesorGeneral general;
	@Autowired
	private ProfesorGeneral general1;
	
	@Autowired
	private ProfesorMateria materia;
	@Autowired
	private ProfesorMateria materia1;
	@Autowired
	private IMatriculaService iMatriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("EJEMPLO SINGLETON");
		this.general.setNombre("David");
		this.general.setApellido("Lopez");
		System.out.println(this.general);
		System.out.println("---------");
		
		System.out.println(this.general1);
		this.general1.setNombre("Alex");
		System.out.println("---------");
		System.out.println(this.general1);
		System.out.println();
		
		System.out.println("EJEMPLO PROTOTYPE");
		this.materia.setNombre("Daniel");
		this.materia.setApellido("Martinez");
		System.out.println(this.materia);
		System.out.println("--------");
		System.out.println(this.materia1);
		System.out.println();
		
		Matricula matricula1=new Matricula();
		matricula1.setEstudiante(new Estudiante());
		//List<Materia> materia=new ArrayList
		matricula1.setMateria(new ArrayList<Materia>());
		matricula1.setNumero("1234");
		this.iMatriculaService.ingresarMatricula(matricula1);
	}

}
