package com.uce.edu.demo.cine.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.cine.modelo.Ticket;

@Repository
public class TicketRepositoryImpl implements ITicketRepository{

	@Override
	public void create(Ticket t) {
		System.out.println("Se ha guardado los datos de ticket en la base: "+ t);
	}

	@Override
	public Ticket read(String codigo) {
		System.out.println("Buscando el ticket con el codigo: "+ codigo);
		Ticket ticket=new Ticket();
		ticket.setCodigo(codigo);
		return ticket;
	}

	@Override
	public void update(Ticket t) {
		System.out.println("Actualizando los datos del ticket: "+ t);
	}

	@Override
	public void delete(String codigo) {
		System.out.println("Elimando el ticket de la base: "+ codigo);
	}

}
