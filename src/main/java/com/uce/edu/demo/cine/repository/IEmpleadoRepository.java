package com.uce.edu.demo.cine.repository;

import com.uce.edu.demo.cine.modelo.Empleado;

public interface IEmpleadoRepository {
	
	public Empleado buscarCajero();
	
	public void create(Empleado e);
	public Empleado read(String nombre);
	public void update(Empleado e);
	public void delete(String nombre);
}
