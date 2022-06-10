package com.uce.edu.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{

	@Override
	public void insertar(Transferencia t) {
		System.out.println("Aqui se inserta la trasferencia en la base de datos: "+t);
		
	}

	@Override
	public Transferencia buscar(String numeroDestino) {
		// TODO Auto-generated method stub
		System.out.println("Buscando la trasferencia en la base de datos: "+ numeroDestino);
		return null;
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando la transferencia en la base: "+t);
	}

	@Override
	public void borrar(String numeroDestino) {
		// TODO Auto-generated method stub
		System.out.println("Borrando la transferencia en la base: "+numeroDestino);
	}

}
