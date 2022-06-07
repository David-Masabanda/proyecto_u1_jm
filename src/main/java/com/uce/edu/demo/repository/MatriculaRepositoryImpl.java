package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la matricula:"+ matricula);
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la matricula:"+numero);
		return null;
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la matricula:"+matricula);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado de la base la matricula:"+numero);
	}

}
