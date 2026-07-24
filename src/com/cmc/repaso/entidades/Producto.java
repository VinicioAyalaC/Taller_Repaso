package com.cmc.repaso.entidades;

public class Producto {
	
	
	// atributos
	private String nombre;
	private double precio;
	
	
	// constructor
	public Producto(String nombre, double precio ) {
		this.nombre = nombre;
		this.precio = precio;		
	}

	
	
	// get & set
	public String getNombre() {	return nombre;	}
	public void setNombre(String nombre) {	this.nombre = nombre;	}

	public double getPrecio() {	return precio;	}
	
	public void setPrecio(double precio) {	
		if(precio>=0) {
			this.precio = precio;
		}else {
			this.precio = precio*(-1);
		}	
	}

	
	// metodo
	public double calcularPrecioPromo(double descuento) {
		
		double resultado = precio - (precio*descuento);
		return resultado;
	}
	

}// principal
