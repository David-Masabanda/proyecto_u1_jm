package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IGestorInventario {
	
	public BigDecimal calcularPrecio(Producto p);
	
	public List<Producto> consultarInventario(List<Producto> bodega, LocalDateTime fechaBusqueda);
}
