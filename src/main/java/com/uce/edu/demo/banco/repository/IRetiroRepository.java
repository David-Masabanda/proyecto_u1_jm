package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {
	
	public void generarRetiro(Retiro r);
	
	public Retiro buscar(String numeroCuenta);
	public void actualizar(Retiro r);
	public void eliminar(String numeroCuenta);
}
