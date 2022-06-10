package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {
	
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto);
	
	//Faltan Buscar, Actualizar y Eliminar
	public Deposito consultarDeposito(String numeroCuenta);
	public void cambiarDeposito(Deposito d);
	public void borrarDeposito(String numeroCuenta);
}
