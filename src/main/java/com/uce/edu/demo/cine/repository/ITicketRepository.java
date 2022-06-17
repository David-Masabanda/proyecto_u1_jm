package com.uce.edu.demo.cine.repository;

import com.uce.edu.demo.cine.modelo.Ticket;

public interface ITicketRepository {
	
	public void create(Ticket t);
	public Ticket read(String codigo);
	public void update(Ticket t);
	public void delete(String codigo);
}
