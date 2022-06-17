package com.uce.edu.demo.cine.service;

import com.uce.edu.demo.cine.modelo.Empleado;

public interface IEmpleadoService {
	
	public void ingresarEmpleado(Empleado e);
	public Empleado buscar(String nombre);
	public void actualizarDatos(Empleado e);
	public void borrar(String nombre);
}
