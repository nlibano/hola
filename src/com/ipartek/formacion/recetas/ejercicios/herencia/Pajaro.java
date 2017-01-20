package com.ipartek.formacion.recetas.ejercicios.herencia;

public class Pajaro extends Animal implements Vendible, Volador, IEstupida {

	private boolean volador;
	private int numHuevosSemana;

	public Pajaro(String raza, float precio) {
		super(raza, precio);
		this.numHuevosSemana = 0;
	}

	public int getNumHuevosSemana() {
		return numHuevosSemana;
	}

	public void setNumHuevosSemana(int numHuevosSemana) {
		this.numHuevosSemana = numHuevosSemana;
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

	@Override
	public int getPeso() {
		// System.out.println("Numero de huevos a la semana: " +
		// this.numHuevosSemana);
		return this.numHuevosSemana;
	}
}
