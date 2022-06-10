package com.uce.edu.demo.banco.service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	
	public void actualizar(CuentaBancaria c);
	public CuentaBancaria buscar(String numero);
	
	//Faltan los metodos Crear y Eliminar
	public void crear(CuentaBancaria c);
	public void eliminar(String numero);
}
