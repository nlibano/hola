package com.ipartek.formacion.hola.ejercicios;

import com.ipartek.formacion.hola.pojo.Ingrediente;
import com.ipartek.formacion.hola.pojo.Receta;

public class RecetaMarmitako {

	public static void main(String[] args) {
		
		
		//Crear Ingredientes
		Ingrediente[] ingredientes = {
				new Ingrediente("pimiento verde", 0.5f , false),
				new Ingrediente("Bonito", 500 , false),
				new Ingrediente("patatas", 4 , false),
				new Ingrediente("ajo", 1 , false)				
		};
		
		//crear Receta
		Receta marmitako = new Receta("Marmitako by Karlos Arguiñano", ingredientes );
		marmitako.setComensales(16);
		//marmitako.setDescripcion("");
		marmitako.setDificultad("moderada");
		marmitako.setTiempo(90);
				
		//mostrar por pantalla
		System.out.println("Marmitako rico rigo, la receta es:");
		if ( !marmitako.isGlutenFree() ){
			System.out.println("***CONTIENE GLUTEN, atención alergicos");
		}
		System.out.println( marmitako.toString() );
		
		
	}

}
