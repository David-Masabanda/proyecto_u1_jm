package com.uce.edu.demo.bodega.service;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoService {
	
	public void ingresarProducto(Producto p);
	
	public Producto consultar(String nombre);
	public void actualizarDatos(Producto p);
	public void eliminarDatos(String nombre);
}
