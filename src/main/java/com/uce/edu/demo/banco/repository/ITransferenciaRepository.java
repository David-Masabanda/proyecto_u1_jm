package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {
	
	public void insertar(Transferencia t);
	
	//Faltan los metodos Buscar, Actualizar y Eliminar
	public Transferencia buscar(String numeroDestino);
	public void actualizar(Transferencia t);
	public void borrar(String numeroDestino);
}
