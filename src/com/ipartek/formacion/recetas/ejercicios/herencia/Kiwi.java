package com.ipartek.formacion.recetas.ejercicios.herencia;

public class Kiwi extends Pajaro {

	public Kiwi(String raza, float precio) {
		super(raza, precio);
	}

	public String puedeVolar() {
		return "no puedo volar";
	}

}
