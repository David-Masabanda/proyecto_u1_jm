package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("ahorros")
public class CuentaBancariaAhorrosServiceImpl implements ICuentaBancariaService{
	
	
	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal calcularInteres(String numeroCuenta, BigDecimal saldo) {
		//Codigo duplicado/Solucionado con una fachada
		//CuentaBancaria cta=this.bancariaRepository.buscar(numeroCuenta);
		//BigDecimal saldo=null;
		BigDecimal interes=new BigDecimal(560).multiply(new BigDecimal(15).divide(new BigDecimal(100)));
		interes=interes.add(saldo.divide(new BigDecimal(100)));
		return interes;
	}

	@Override
	public void crear(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		
	}

}
