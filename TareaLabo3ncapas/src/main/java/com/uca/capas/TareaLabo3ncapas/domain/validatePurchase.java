package com.uca.capas.TareaLabo3ncapas.domain;

public class validatePurchase {

	private Integer id;
	private String cantidad;
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public validatePurchase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public validatePurchase(Integer id, String cantidad, String nombre) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

}
