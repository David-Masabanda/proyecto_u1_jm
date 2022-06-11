package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository{
	
	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: "+d);
	}

	@Override
	public Deposito buscarDeposito(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Buscando el deposito con destino: "+ numeroCuenta);
		return null;
	}

	@Override
	public void actualizarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se esta actualizando los datos del deposito: "+d);
	}

	@Override
	public void eliminarDeposito(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se esta eliminando el deposito con destino: "+numeroCuenta);
	}

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
		// TODO Auto-generated method stub
		//Aqui deberian estar los SQL
		List<Deposito> listaDepositos=new ArrayList<>();
		Deposito depo1=new Deposito();
		depo1.setFecha(LocalDateTime.of(2021, 2, 10, 8, 50, 2));
	    depo1.setMonto(new BigDecimal(20));
		depo1.setNumeroCuenta("7895");
	 
		listaDepositos.add(depo1);
		
		
		Deposito depo2=new Deposito();
		depo2.setFecha(LocalDateTime.of(2022, 5, 17, 9, 15, 25));
	    depo2.setMonto(new BigDecimal(30));
		depo2.setNumeroCuenta("7585");
	 
		listaDepositos.add(depo2);
		
		
		return listaDepositos;
	}

}
