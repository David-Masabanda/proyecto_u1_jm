package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IInventarioRepository;

@Service
public class GestorInventarioImpl implements IGestorInventario{
	
	@Autowired
	private IInventarioRepository inventarioRepository;
	
	
	@Override
	public BigDecimal calcularPrecio(Producto p) {
		BigDecimal ganancia=p.getPrecio().multiply(new BigDecimal(10)).divide(new BigDecimal(100));
		BigDecimal iva=p.getPrecio().multiply(new BigDecimal(12)).divide(new BigDecimal(100));
		BigDecimal valorVenta=p.getPrecio().add(ganancia).add(iva);
		
		return valorVenta;
	}

	@Override
	public List<Producto> consultarInventario(List<Producto> bodega, LocalDateTime fechaBusqueda) {
		//En este caso, la practica real no tendria un parametro bodega. Solo requiere la fecha 
		//de busqueda. Coloque las instrucciones solo para poder encontrar los elementos de la lista,
		//pero estos pasos los realizaria la base de datos.
		
		//List<Producto> listaInventario=this.inventarioRepository.consultar(fechaBusqueda);
		List<Producto> listaInventario=new ArrayList<>();
		LocalDateTime presente=LocalDateTime.now();
		for(Producto a: bodega) {
			if(a.getFechaCompra().compareTo(fechaBusqueda)>0 && a.getFechaCompra().compareTo(presente)<0) {
				listaInventario.add(a);
			}
		}
		System.out.println("Los productos consultados desde el "+fechaBusqueda+" son los siguientes");
		return listaInventario;
	}

}
