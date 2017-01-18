package com.ipartek.formacion.recetas.ejercicios.herencia;

public abstract class Circulo extends ObjetoGrafico {

	private int radio;

	public Circulo(int x, int y) {
		super(x, y);
		this.radio = 0;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

}
