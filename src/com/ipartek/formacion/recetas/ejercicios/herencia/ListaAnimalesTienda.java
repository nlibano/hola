package com.ipartek.formacion.recetas.ejercicios.herencia;

import java.util.ArrayList;

/**
 * Ejercicio para aprender a usar la Herencia e interfaces <br>
 * Capitulo 8 del Libro Java 7
 * 
 * @author Curso
 *
 */
public class ListaAnimalesTienda {

	public static void main(String[] args) {

		// crear objetos
		// Burro burro = new Burro("Margarita", "burro", 800);
		Burro b1 = new Burro("Platero");
		b1.setPrecio(300);

		Burro b2 = new Burro("Margarita");
		b2.setPrecio(3.25f);

		Pajaro kiwi = new Pajaro("Kiwi", 3500);
		Pajaro buitre = new Pajaro("buitre", 1000);
		buitre.setVolador(true);

		// añadir en ArrayList
		ArrayList<Vendible> stock = new ArrayList<Vendible>();
		stock.add(b1);
		stock.add(b2);
		stock.add(buitre);
		stock.add(kiwi);

		// Mostrar por pantalla
		Burro b = null;
		Pajaro p = null;

		// System.out.println("---------- Listado de animales en la
		// tienda---------------");

		for (Vendible v : stock) {
			if (v instanceof Burro) {
				b = (Burro) v;
				System.out.println("----------------------------------");
				System.out.println(b.getRaza() + " [" + b.getNombre() + "]");
				System.out.println("Precio: " + b.getPrecio());
				System.out.println("Comestible: Si");
				System.out.println("Volador: No");
			} else if (v instanceof Pajaro) {
				p = (Pajaro) v;

				// tambien se puede preguntar por Interfaces
				// if (p instanceof Volador){
				//
				// }

				System.out.println("----------------------------------");
				System.out.println(p.getRaza());
				System.out.println("Precio: " + p.getPrecio());
				System.out.println("Comestible: No");
				if (p.isVolador()) {
					System.out.println("Volador: Si");
				} else {
					System.out.println("Volador: No");
				}
			} else {
				System.out.println("****** No dabemos que eres " + v.toString());
				System.out.println();
			}
		}

		/*
		 * // generar factura
		 * 
		 * System.out.println(); System.out.println(
		 * "---------- Generando factura:---------------");
		 * 
		 * for (Vendible vendible : stock) { vendible.generarFactura(); }
		 * 
		 * // puede volar
		 * 
		 * System.out.println(); System.out.println(
		 * "---------- Puede volar:---------------");
		 * 
		 * System.out.println(b.getRaza() + ": " + b.puedeVolar());
		 * System.out.println(k.getRaza() + ": " + k.puedeVolar());
		 * 
		 * // Es comestible System.out.println(); System.out.println(
		 * "---------- Es comestible:---------------");
		 * 
		 * System.out.println(burro.getIngredientes());
		 */
	}
}
