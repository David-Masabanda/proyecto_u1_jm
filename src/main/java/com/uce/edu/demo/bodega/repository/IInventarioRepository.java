package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IInventarioRepository {
	
	public void ingresarInventario(Inventario i);
	public Inventario buscar(String nombre);
	public void actualizar(Inventario i);
	public void eliminar(String nombre);
	
	public List<Producto> consultar(LocalDateTime fechaBusqueda);
	
}
