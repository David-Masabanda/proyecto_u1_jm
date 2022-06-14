package com.uce.edu.demo;


import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IFachadaCuentaBancaria;

@SpringBootApplication
public class ProyectoU1JmApplication implements CommandLineRunner{
	
	@Autowired
	private IFachadaCuentaBancaria bancaria;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println();
		BigDecimal interes=this.bancaria.calcularInteres("1214");
		System.out.println("El saldo futuro sera de: "+interes);
	}

}
