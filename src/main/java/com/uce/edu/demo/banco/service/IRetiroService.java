package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {
	
	public void realizarRetiro(String numeroCuenta, BigDecimal monto);
	
	public Retiro consultar(String numeroCuenta);
	public void actualizarDatos(Retiro r);
	public void eliminarRetiro(String numeroCuenta);
}
