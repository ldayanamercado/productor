package com.kafka.model;

public class Pedido {
	private String producto;
	private int unidades;
	private double precio;
	private String descripcion;
	private boolean estado;
	
	public Pedido(String producto, int unidades, double precio, String descripcion,boolean estado) {
		super();
		this.producto = producto;
		this.unidades = unidades;
		this.precio = precio;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	public Pedido() {
		super();
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}

