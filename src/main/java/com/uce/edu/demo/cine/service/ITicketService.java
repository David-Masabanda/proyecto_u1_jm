package com.uce.edu.demo.cine.service;

import com.uce.edu.demo.cine.modelo.Ticket;

public interface ITicketService {
	
	public void nuevoTicket(String codigo, String funcion);
	
	
	public Ticket buscar(String codigo);
	public void actualizarDatos(Ticket t);
	public void borrar(String codigo);
}
