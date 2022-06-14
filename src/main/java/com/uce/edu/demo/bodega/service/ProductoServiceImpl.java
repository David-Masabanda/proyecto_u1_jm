package com.uce.edu.demo.bodega.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoRepository productoRepository;
	@Autowired
	private IGestorInventario gestorInventario;
	
	@Override
	public void ingresarProducto(Producto p) {
		p.setPrecioVenta(this.gestorInventario.calcularPrecio(p));
		this.productoRepository.ingresar(p);
	}
	
	@Override
	public Producto consultar(String nombre) {
		return this.productoRepository.buscar(nombre);
	}

	@Override
	public void actualizarDatos(Producto p) {	
		this.productoRepository.actualizar(p);
	}

	@Override
	public void eliminarDatos(String nombre) {	
		this.productoRepository.eliminar(nombre);
	}


}
