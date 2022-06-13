package com.uce.edu.demo.bodega.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	@Override
	public void ingresar(Producto p) {
		System.out.println("Ingresando el producto en la base: "+p);
	}

	@Override
	public Producto buscar(String nombre) {
		System.out.println("Buscando producto en la base de datos: "+nombre);
		return null;
	}

	@Override
	public void actualizar(Producto p) {
		System.out.println("Actualizando datos del producto: "+p);
	}

	@Override
	public void eliminar(String nombre) {
		System.out.println("Borrando el producto de la base: "+nombre);	
	}

}
