package com.uce.edu.demo.cine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.cine.modelo.Empleado;
import com.uce.edu.demo.cine.repository.IEmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

	@Autowired
	private IEmpleadoRepository empleadoRepository;
	
	@Override
	public void ingresarEmpleado(Empleado e) {
		this.empleadoRepository.create(e);
	}

	@Override
	public Empleado buscar(String nombre) {
		return this.empleadoRepository.read(nombre);
	}

	@Override
	public void actualizarDatos(Empleado e) {
		this.empleadoRepository.update(e);
	}

	@Override
	public void borrar(String nombre) {
		this.empleadoRepository.delete(nombre);
	}

}
