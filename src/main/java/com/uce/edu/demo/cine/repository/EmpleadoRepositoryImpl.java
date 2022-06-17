package com.uce.edu.demo.cine.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.cine.modelo.Empleado;

@Repository
public class EmpleadoRepositoryImpl implements IEmpleadoRepository{

	@Override
	public void create(Empleado e) {
		System.out.println("Se ha creado un nuevo empleado en la base: "+ e);
	}

	@Override
	public Empleado read(String nombre) {
		System.out.println("Buscando empleado en la base de datos:"+ nombre);
		Empleado empleado=new Empleado();
		empleado.setNombre(nombre);
		return empleado;
	}

	@Override
	public void update(Empleado e) {
		System.out.println("Actualizando los datos del empleado: "+ e);
	}

	@Override
	public void delete(String nombre) {
		System.out.println("Eliminando al empleado de la base: "+ nombre);
	}

	@Override
	public Empleado buscarCajero() {
		Empleado empleado=new Empleado();
		empleado.setNombre("David");
		empleado.setApellido("Martinez");
		empleado.setCargo("Cajero");
		
		return empleado;
	}

}
