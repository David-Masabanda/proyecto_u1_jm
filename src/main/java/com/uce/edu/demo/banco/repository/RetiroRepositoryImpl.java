package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository{

	@Override
	public void generarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se esta procesando el retiro: "+r);
	}

	@Override
	public Retiro buscar(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Buscando el retiro de la cuenta: "+numeroCuenta);
		return null;
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Guardando los datos de retiro: "+r);
	}

	@Override
	public void eliminar(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se esta eliminando el retiro de la cuenta: "+numeroCuenta);
	}

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
		// TODO Auto-generated method stub
		//Aqui deberian estar los SQL
		List<Retiro> listaRetiros=new ArrayList<>();
		Retiro reti1=new Retiro();
		reti1.setFechaRetiro(LocalDateTime.of(2022, 12, 9, 11, 31, 9));
		reti1.setMonto(new BigDecimal(80));
		reti1.setNumeroCuenta("7005");
			 
		listaRetiros.add(reti1);
		return listaRetiros;
	}

	

}
