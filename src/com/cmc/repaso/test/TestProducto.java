package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		
		Producto prod1 = new Producto("Iphone", 1200.45);
		
		prod1.setPrecio(-123);
		
		double resultado = prod1.calcularPrecioPromo(0.15);
		
		
		System.out.println("Valor recibido: "+prod1.getPrecio());
		System.out.println("Producto con descuento: "+resultado);
		

	}// main

}// principal
