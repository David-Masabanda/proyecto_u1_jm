package com.uce.edu.demo.bodega.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto {

	private String nombre;
	private Integer cantidad;
	private BigDecimal precioCompra;
	private BigDecimal precioVenta;
	private LocalDateTime fechaCompra;
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getPrecio() {
		return precioCompra;
	}
	public void setPrecio(BigDecimal precio) {
		this.precioCompra = precio;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}
	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	
	@Override
	public String toString() {
		return "Producto [ " + nombre + " - " + cantidad +" - $" + precioVenta + " - " + fechaCompra + "]\n";
	}
	
	
	
	
	
}
