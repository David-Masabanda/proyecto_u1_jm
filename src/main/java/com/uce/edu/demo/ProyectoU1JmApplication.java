package com.uce.edu.demo;



import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.service.IGestorInventario;
import com.uce.edu.demo.bodega.service.IInventarioService;
import com.uce.edu.demo.bodega.service.IProductoService;

@SpringBootApplication
public class ProyectoU1JmApplication implements CommandLineRunner{
	
	@Autowired
	private IGestorInventario gestorInventario;
	@Autowired
	private IInventarioService inventarioService;
	@Autowired
	private IProductoService productoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1JmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("---GUARDANDO PRODUCTOS EN LA BASE---");
		
		Producto p1=new Producto();
		p1.setNombre("Fideos");
		p1.setCantidad(45);
		p1.setPrecio(new BigDecimal(16.5));
		p1.setFechaCompra(LocalDateTime.of(2022, 1, 9, 14, 15));
		this.productoService.ingresarProducto(p1);
		
		Producto p2=new Producto();
		p2.setNombre("Aceite");
		p2.setCantidad(60);
		p2.setPrecio(new BigDecimal(8));
		p2.setFechaCompra(LocalDateTime.of(2022, 2, 9, 20, 20));
		this.productoService.ingresarProducto(p2);
		
		Producto p3=new Producto();
		p3.setNombre("Arroz");
		p3.setCantidad(5);
		p3.setPrecio(new BigDecimal(40));
		p3.setFechaCompra(LocalDateTime.of(2022, 4, 22, 15, 24));
		this.productoService.ingresarProducto(p3);
		
		Producto p4=new Producto();
		p4.setNombre("Galletas");
		p4.setCantidad(25);
		p4.setPrecio(new BigDecimal(12));
		p4.setFechaCompra(LocalDateTime.of(2022, 3, 7, 17, 41));
		this.productoService.ingresarProducto(p4);
		
		Producto p5=new Producto();
		p5.setNombre("Cereal");
		p5.setCantidad(20);
		p5.setPrecio(new BigDecimal(19));
		p5.setFechaCompra(LocalDateTime.of(2022, 6, 21, 14, 51));
		this.productoService.ingresarProducto(p5);	
		System.out.println();
		
		System.out.println("---GUARDANDO PRODUCTOS EN EL INVENTARIO---");
		List<Producto> lote1=new ArrayList<Producto>();
		lote1.add(p1);
		lote1.add(p2);
		lote1.add(p3);
		lote1.add(p4);
		lote1.add(p5);
		this.inventarioService.insertarInventario(lote1,LocalDateTime.of(2022, 5, 12, 12, 0),"1");
		System.out.println();
		
		System.out.println("---CONSULTANDO DATOS SEGUN FECHA---");
		List<Producto> bodega=this.gestorInventario.consultarInventario(lote1, LocalDateTime.of(2022, 2, 10, 0, 0));
		System.out.println(bodega);
		
	}

}
