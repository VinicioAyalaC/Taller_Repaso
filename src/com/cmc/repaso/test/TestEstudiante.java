package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
	
		
		Estudiante est1 = new Estudiante("Vinicio");
		
		est1.calificar(8);		
		
		
		System.out.println("Nombre: "+est1.getNombre());
		System.out.println("Nota: "+est1.getNota());
		System.out.println("Resultado: "+est1.getResultado());

	}

}
