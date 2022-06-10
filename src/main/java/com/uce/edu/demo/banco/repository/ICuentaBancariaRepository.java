package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
	
	public void actualizar(CuentaBancaria c);
	public CuentaBancaria buscar(String numero);
	
	//Faltan los metodos Crear y Eliminar
	public void crearCuenta(CuentaBancaria c);
	public void eliminarCuenta(String numero);
}
