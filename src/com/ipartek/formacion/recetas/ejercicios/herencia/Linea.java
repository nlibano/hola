package com.ipartek.formacion.recetas.ejercicios.herencia;

public class Linea extends ObjetoGrafico {

	private int longitud;

	public Linea(int x, int y) {
		super(x, y);
		this.longitud = 0;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	@Override
	public void dibujar() {
		System.out.println("pintar Linea");
	}

}
