package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		
		Validacion val1 = new Validacion();
		
		System.out.println("Prueba 1: "+ val1.validarMonto(0));
		System.out.println("Prueba 2: "+val1.validarMonto(0.1));		

	}// main

}// principal
