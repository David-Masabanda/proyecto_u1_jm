package com.uce.edu.demo.cine.modelo;

import java.time.LocalDateTime;

public class Ticket {
	
	private String codigo;
	private String nombreCliente;
	private String nombreVendedor;
	private String funcion;
	private LocalDateTime horaFuncion;
	
	//GET y SET
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getFuncion() {
		return funcion;
	}
	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	public LocalDateTime getHoraFuncion() {
		return horaFuncion;
	}
	public void setHoraFuncion(LocalDateTime horaFuncion) {
		this.horaFuncion = horaFuncion;
	}
	public String getNombreVendedor() {
		return nombreVendedor;
	}
	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
	
	@Override
	public String toString() {
		return "Ticket [codigo=" + codigo + ", nombreCliente=" + nombreCliente + ", nombreVendedor=" + nombreVendedor
				+ ", funcion=" + funcion + ", horaFuncion=" + horaFuncion + "]";
	}
	

}
