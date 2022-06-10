package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto);
	
	//Faltan los metodos Buscar, Actualizar y Eliminar
	public Transferencia buscar(String numeroDestino);
	public void actualizar(Transferencia t);
	public void borrar(String numeroDestino);
}
