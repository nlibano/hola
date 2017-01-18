package com.ipartek.formacion.recetas.ejercicios.herencia;

public abstract class ObjetoGrafico {

	private int x;
	private int y;

	/**
	 * Se compone de una laitud y longitud, mediante una clase interna
	 */
	private GeoPunto gp;

	// clase interna
	final class GeoPunto {
		public float latitud;
		public float longitud;
	}

	public ObjetoGrafico(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void mover(int x, int y) {
		System.out.println("Objeto movido a nueva posicion " + x + " " + y);
	}

	public abstract void dibujar();

	@Override
	public String toString() {
		return "ObjetoGrafico [x=" + x + ", y=" + y + "]";
	}

}
