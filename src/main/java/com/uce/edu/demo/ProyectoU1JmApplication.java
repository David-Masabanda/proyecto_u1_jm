package com.uce.edu.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.cine.modelo.ClienteNormal;
import com.uce.edu.demo.cine.modelo.ClienteVIP;
import com.uce.edu.demo.cine.service.ITicketService;

@SpringBootApplication
public class ProyectoU1JmApplication implements CommandLineRunner{
	
	@Autowired
	private ClienteNormal clienteN1;
	@Autowired
	private ClienteNormal clienteN2;
	@Autowired
	private ClienteVIP clienteV1;
	@Autowired
	private ClienteVIP clienteV2;
	@Autowired
	private ITicketService ticketService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println();
		System.out.println("COMPRA DE ENTRADAS EN UN CINE \n");
		//En un cine algunos clientes obtienen una membresia para mayor beneficio en cada consumo
		//Un descuento en las entradas o canjeo de puntos. 
		//Estos en vez de dar la cedula dan un carnet con un codigo especial que los diferencia.

		System.out.println("------>Ejemplo Singleton");
		this.clienteV1.setCodigo("1531");
		this.clienteV1.setNombre("Sara");
		this.clienteV1.setPuntos("120");
		this.ticketService.nuevoTicket("1531", "The Batman");
		System.out.println(this.clienteV1);
		this.clienteV1.setNombre("Daniel");
		System.out.println(this.clienteV1);
		System.out.println(this.clienteV2);
		System.out.println();
		
		
		System.out.println("------>Ejemplo Prototype");
		this.clienteN1.setCedula("1719276810");
		this.clienteN1.setNombre("Luis");
		this.ticketService.nuevoTicket("1719276810", "El Conjuro");
		System.out.println(clienteN1);
		this.clienteN2.setNombre("Rebeca");
		System.out.println(clienteN2);
	
	}

}
