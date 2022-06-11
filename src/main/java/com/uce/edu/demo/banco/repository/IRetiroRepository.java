package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {
	
	public void generarRetiro(Retiro r);
	
	public Retiro buscar(String numeroCuenta);
	public void actualizar(Retiro r);
	public void eliminar(String numeroCuenta);
	
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro);
}
