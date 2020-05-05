package com.uca.capas.TareaLabo3ncapas.domain;

import java.util.ArrayList;

public class Product {
	private static ArrayList<Product> productList = new ArrayList<>();
	private Integer id;
	private String nombre;
	private Integer cantidad;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer id, String nombre, Integer cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	
	public static ArrayList<Product> addProducts(){
		
		productList.add(new Product(0,"Iphone 11", 300));
		productList.add(new Product(1, "Ipad Mini", 20));
		productList.add(new Product(2,"Apple Care Card", 15));
		productList.add(new Product(3, "AirPods", 30));
		productList.add(new Product(4, "MackBook Pro", 27));
		
		return productList;
		
	}

	public boolean isQuantityValid() {
		Product pro = new Product();

		if (productList.get(pro.getId()).getCantidad() >= pro.getCantidad()) {
			return true;
		} else {
			return false;
		}
	}
	}



