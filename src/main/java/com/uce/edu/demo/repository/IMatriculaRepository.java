package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {
	
	//CRUD
	//C: crear/insertar
	public void insertar(Matricula matricula);
	
	//R: leer/buscar
	public Matricula buscar(String numero);
	
	//U: actualizar
	public void actualizar(Matricula matricula);
	
	//D: eliminar
	public void eliminar(String numero);
}