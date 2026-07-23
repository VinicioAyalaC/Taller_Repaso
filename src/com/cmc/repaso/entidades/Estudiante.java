package com.cmc.repaso.entidades;

public class Estudiante {
	
	public String nombre;
	public double nota;
	public String resultado;
	
	public Estudiante(String nombre) {
		this.nombre = nombre;		
	}
	
	
	public void calificar(double nota) {
		if(nota <8) {
			 resultado = "F";
		}else if(nota >= 8) {
			resultado = "A";
		}
		
		System.out.printf("La nota %s, tiene un resultado de %d", nota, resultado);
	}

}//
