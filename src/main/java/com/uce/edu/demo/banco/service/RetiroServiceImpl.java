package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;


@Service
public class RetiroServiceImpl implements IRetiroService{
	
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IRetiroRepository retiroRepository;
	
	@Override
	public void realizarRetiro(String numeroCuenta, BigDecimal monto) {
		CuentaBancaria ctaRetiro=this.bancariaService.buscar(numeroCuenta);
		BigDecimal saldoCuenta=ctaRetiro.getSaldo();
		BigDecimal saldoFinal=saldoCuenta.subtract(monto);
		ctaRetiro.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaRetiro);
		
		Retiro retiro=new Retiro();
		retiro.setNumeroCuenta(numeroCuenta);
		retiro.setMonto(monto);
		retiro.setFechaRetiro(LocalDateTime.now());
		this.retiroRepository.generarRetiro(retiro);
	}


	@Override
	public Retiro consultar(String numeroCuenta) {
		// TODO Auto-generated method stub
		return this.retiroRepository.buscar(numeroCuenta);
	}

	@Override
	public void actualizarDatos(Retiro r) {
		// TODO Auto-generated method stub
		this.retiroRepository.actualizar(r);
	}

	@Override
	public void eliminarRetiro(String numeroCuenta) {
		// TODO Auto-generated method stub
		this.retiroRepository.eliminar(numeroCuenta);
	}

}
