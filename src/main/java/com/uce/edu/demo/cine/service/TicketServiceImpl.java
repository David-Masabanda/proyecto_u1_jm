package com.uce.edu.demo.cine.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.cine.modelo.ClienteNormal;
import com.uce.edu.demo.cine.modelo.ClienteVIP;
import com.uce.edu.demo.cine.modelo.Empleado;
import com.uce.edu.demo.cine.modelo.Ticket;
import com.uce.edu.demo.cine.repository.IEmpleadoRepository;
import com.uce.edu.demo.cine.repository.ITicketRepository;

@Service
public class TicketServiceImpl implements ITicketService{
	
	@Autowired
	private ITicketRepository ticketRepository;
	@Autowired
	private IEmpleadoRepository empleadoRepository;
	
	@Autowired
	private ClienteNormal clienteN;
	@Autowired
	private ClienteVIP clienteV;
		
	@Override
	public void nuevoTicket(String codigo, String funcion) {
		
		String nombreCliente;
		if(codigo.length()<=4) {
			System.out.println("Bienvenido cliente: "+ this.clienteV);
			nombreCliente=this.clienteV.getNombre();
		}else{
			System.out.println("Compra realizada por el cliente: "+ this.clienteN);
			nombreCliente=this.clienteN.getNombre();
		}	
		
		Empleado cajero=this.empleadoRepository.buscarCajero();
		Ticket compra=new Ticket();
		compra.setCodigo(codigo);
		compra.setNombreCliente(nombreCliente);
		compra.setNombreVendedor(cajero.getNombre());
		compra.setFuncion(funcion);
		compra.setHoraFuncion(LocalDateTime.now());
		this.ticketRepository.create(compra);
		
		
	}

	@Override
	public Ticket buscar(String codigo) {
		return this.ticketRepository.read(codigo);
	}

	@Override
	public void actualizarDatos(Ticket t) {
		this.ticketRepository.update(t);
	}

	@Override
	public void borrar(String codigo) {
		this.ticketRepository.delete(codigo);
	}



}
