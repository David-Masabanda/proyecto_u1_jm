package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Materia;

public class MateriaRepositoryImpl implements IMateriaRepository{

	@Override
	public void insertar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado la materia:"+ m +" en la base");
	}

	@Override
	public Materia buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la materia:"+ nombre);
		return null;
	}

	@Override
	public void actualizar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la materia:"+m);
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado de la base la materia:"+nombre);
	}

}
