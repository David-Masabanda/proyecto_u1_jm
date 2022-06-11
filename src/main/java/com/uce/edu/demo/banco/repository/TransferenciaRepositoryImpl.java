package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
		// TODO Auto-generated method stub
		//Aqui deberian estar los SQL
		List<Transferencia> listaConsultada=new ArrayList<>();
		Transferencia trans1=new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaDestino("1234");
		trans1.setNumeroCuentaOrigen("0578");
		listaConsultada.add(trans1);
		return listaConsultada;
	}

}
