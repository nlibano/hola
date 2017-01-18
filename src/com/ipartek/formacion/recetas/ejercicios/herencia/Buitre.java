package com.ipartek.formacion.recetas.ejercicios.herencia;

public class Buitre extends Pajaro {

	public Buitre(String raza, float precio) {
		super(raza, precio);
	}

	public String puedeVolar() {
		return "puedo volar";
	}

	@Override
	public void generarFactura() {
		float iva = (float) (getPrecio() * 1.21);
		System.out.println("Factura con iva incluido:  " + iva);
	}
}
