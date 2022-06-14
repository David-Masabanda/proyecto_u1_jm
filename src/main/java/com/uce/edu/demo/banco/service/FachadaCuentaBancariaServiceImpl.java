package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class FachadaCuentaBancariaServiceImpl implements IFachadaCuentaBancaria{

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	
	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaServiceA;
	
	@Override
	public BigDecimal calcularInteres(String numeroCuenta) {
		// TODO Auto-generated method stub
		BigDecimal interes=null;
		CuentaBancaria cta=this.bancariaRepository.buscar(numeroCuenta);
		if(cta.getTipo().equals("A")) {
			//Ahorros
			interes=this.bancariaServiceA.calcularInteres(numeroCuenta, cta.getSaldo());
		}else {
			//Corriente
			interes=this.bancariaService.calcularInteres(numeroCuenta, cta.getSaldo());
		}
		return interes;
	}

}
