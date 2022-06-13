package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{

	@Override
	public void ingresarInventario(Inventario i) {
		System.out.println("Se ha registrado el inventario en la base de datos:\n "+i);
	}

	@Override
	public Inventario buscar(String nombre) {
		System.out.println("Buscando registros del inventario: "+ nombre);
		return null;
	}

	@Override
	public void actualizar(Inventario i) {
		System.out.println("Actualizando datos del registo: "+i);
	}

	@Override
	public void eliminar(String nombre) {
		System.out.println("Borrando los datos del inventario: "+nombre);
	}

	@Override
	public List<Producto> consultar(LocalDateTime fechaBusqueda) {
		return null;
	}

}
