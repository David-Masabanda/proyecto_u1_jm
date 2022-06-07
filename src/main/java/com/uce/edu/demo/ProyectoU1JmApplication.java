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
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1JmApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMateriaService materiaService1;
	@Autowired
	private IMateriaService materiaService2;
	@Autowired
	private IMateriaService materiaService3;
	
	@Autowired
	private IMatriculaService matriculaService;
	
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
		//e.setCedula("1719139980");
		//this.estudianteService.actualizarEstudiante(e);
		//this.estudianteService.buscarPorApellido("Lopez");
		//this.estudianteService.borrarEstudiante("1719139881");
		
		System.out.println();
		System.out.println("----MATERIA----");
		
		//-------------MATERIA----------------
		Materia m1=new Materia ();
		m1.setNombre("Programacion Superior");
		m1.setSemestre("Sexto");
	
		Materia m2=new Materia ();
		m2.setNombre("Sistemas");
		m2.setSemestre("Sexto");
		
		Materia m3=new Materia ();
		m3.setNombre("Redes Neuronales");
		m3.setSemestre("Sexto");
		
		this.materiaService1.ingresarMateria(m1);
		this.materiaService2.ingresarMateria(m2);
		this.materiaService3.ingresarMateria(m3);
		
		m1.setNombre("Programacion Avanzada 2");
		this.materiaService1.actualizarMateria(m1);
		this.materiaService1.buscarPorNombre("Programacion Avanzada 2");
		this.materiaService1.borrarMateria("Programacion Avanzada 2");
		
		m2.setNombre("Bases de Datos 2");
		this.materiaService2.actualizarMateria(m2);
		this.materiaService2.buscarPorNombre("Bases de Datos 2");
		this.materiaService2.borrarMateria("Bases de Datos 2");
		
		m3.setNombre("Inteligencia Artificial");
		this.materiaService3.actualizarMateria(m3);
		this.materiaService3.buscarPorNombre("Inteligencia Artificial");
		this.materiaService3.borrarMateria("Inteligencia Artificial");

		List<Materia> listaMaterias=new ArrayList<Materia>();
		listaMaterias.add(m1);
		listaMaterias.add(m2);
		listaMaterias.add(m3);
		
		System.out.println();
		System.out.println("----MATRICULA----");
		
		//-------------MATERIA----------------
		Matricula matricula1=new Matricula();
		matricula1.setNumero("204511");
		matricula1.setEstudiante(e);
		matricula1.setMateria(listaMaterias);
		
		this.matriculaService.ingresarMatricula(matricula1);
		matricula1.setNumero("204517");
		this.matriculaService.actualizarMatricula(matricula1);
		this.matriculaService.buscarPorNumero("204517");
		this.matriculaService.borrarMatricula("204517");
		
		
		
	}

}
