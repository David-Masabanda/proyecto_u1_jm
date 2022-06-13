package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService{
	
	@Autowired
	private IInventarioRepository inventarioRepository;

	@Override
	public void insertarInventario(List<Producto> listaProductos, LocalDateTime fechaInventario, String lote) {
		Inventario inventario=new Inventario();
		inventario.setListaProductos(listaProductos);
		inventario.setFechaInventario(fechaInventario);
		inventario.setLote(lote);
		this.inventarioRepository.ingresarInventario(inventario);	
	}

	@Override
	public Inventario buscarRegistro(String nombre) {
		return this.inventarioRepository.buscar(nombre);
	}

	@Override
	public void actualizarRegistro(Inventario i) {
		this.inventarioRepository.actualizar(i);
	}

	@Override
	public void eliminarRegistro(String nombre) {	
		this.inventarioRepository.eliminar(nombre);
	}


}
