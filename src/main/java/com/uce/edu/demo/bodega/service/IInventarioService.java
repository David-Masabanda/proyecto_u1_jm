package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IInventarioService {
	
	public void insertarInventario(List<Producto> listaProductos, LocalDateTime fechaInventario, String lote);
	
	public Inventario buscarRegistro(String nombre);
	public void actualizarRegistro(Inventario i);
	public void eliminarRegistro(String nombre);
	
}
