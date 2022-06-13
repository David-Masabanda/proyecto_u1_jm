package com.uce.edu.demo.bodega.modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Inventario {
	
	private List<Producto> listaProductos;
	private LocalDateTime fechaInventario;
	private String lote;
	
	//SET y GET
	public List<Producto> getListaProductos() {
		return listaProductos;
	}
	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	@Override
	public String toString() {
		return "Inventario [listaProductos=" + listaProductos + "]";
	}
	public LocalDateTime getFechaInventario() {
		return fechaInventario;
	}
	public void setFechaInventario(LocalDateTime fechaInventario) {
		this.fechaInventario = fechaInventario;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}

	
}
