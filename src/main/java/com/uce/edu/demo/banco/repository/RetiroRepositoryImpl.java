package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

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

	

}
