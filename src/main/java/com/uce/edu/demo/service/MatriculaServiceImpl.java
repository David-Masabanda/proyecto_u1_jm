package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMatriculaRepository;

public class MatriculaServiceImpl implements IMatriculaService{
	
	@Autowired
	private IMatriculaRepository matRepository;
	
	@Override
	public void ingresarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matRepository.insertar(matricula);
	}

	@Override
	public Matricula buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.matRepository.buscar(numero);
	}

	@Override
	public void actualizarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matRepository.actualizar(matricula);
	}

	@Override
	public void borrarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.matRepository.eliminar(numero);
	}

}
