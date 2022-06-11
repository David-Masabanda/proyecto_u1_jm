package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {
	
	public void insertarDeposito(Deposito d);
	
	//Faltan Buscar, Actualizar y Eliminar
	public Deposito buscarDeposito(String numeroCuenta);
	public void actualizarDeposito(Deposito d);
	public void eliminarDeposito(String numeroCuenta);
	
	
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro);
}
