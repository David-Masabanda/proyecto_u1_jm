package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;

@SpringBootApplication
public class ProyectoU1JmApplication implements CommandLineRunner{
	
	@Autowired
	private ITransferenciaService iTransferenciaService;
	@Autowired
	private IDepositoService depositoService;
	@Autowired
	private IRetiroService retiroService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----TRANSFERENCIA----");
		this.iTransferenciaService.realizarTransferencia("12", "13", new BigDecimal(20));
		System.out.println();
		System.out.println("---DEPOSITO----");
		this.depositoService.realizarDeposito("14", new BigDecimal(40));
		System.out.println();
		System.out.println("----RETIRO----");
		this.retiroService.realizarRetiro("15", new BigDecimal(15));
	}

}
