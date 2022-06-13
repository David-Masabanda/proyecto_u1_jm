package com.uce.edu.demo.bodega.repository;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoRepository {

	public void ingresar(Producto p);
	public Producto buscar(String nombre);
	public void actualizar(Producto p);
	public void eliminar(String nombre);
}
