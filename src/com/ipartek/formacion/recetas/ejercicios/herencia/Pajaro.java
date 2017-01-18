package com.ipartek.formacion.recetas.ejercicios.herencia;

public class Pajaro extends Animal implements Vendible, Volador {

	private boolean volador;

	public Pajaro(String raza, float precio) {
		super(raza, precio);
	}

	public boolean isVolador() {
		return volador;
	}

	public void setVolador(boolean volador) {
		this.volador = volador;
	}

	@Override
	public void despegar() {
		System.out.println("LLegando a las alturas");
	}

	@Override
	public void aterrizar() {
		System.out.println("Aterriza como puedas");

	}

	/*
	 * public void puedeVolar(String vuelo) { System.out.println(vuelo); }
	 */
	@Override
	public void generarFactura() {
		float iva = (float) (getPrecio() * 1.21);
		System.out.println("Factura con iva incluido:  " + iva);
	}
}
