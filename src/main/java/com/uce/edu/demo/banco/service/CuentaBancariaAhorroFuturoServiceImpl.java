package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("futuro")
public class CuentaBancariaAhorroFuturoServiceImpl implements ICuentaBancariaService{

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
		//VF=VA(1+i)^n     interes anual del 15% - durante 2 años
		BigDecimal interes=new BigDecimal(15).divide(new BigDecimal(100));
		interes=interes.add(new BigDecimal(1));
		interes=interes.pow(2);
		BigDecimal valorFuturo=saldo.multiply(interes);
		System.out.println("Con un saldo original de: "+saldo);
		return valorFuturo;
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
