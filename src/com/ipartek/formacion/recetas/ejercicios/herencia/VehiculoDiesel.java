package com.ipartek.formacion.recetas.ejercicios.herencia;

public class VehiculoDiesel extends Vehiculo {

	public final float MIN_CAPACIDAD_COMBUSTIBLE = 30;

	private float combustible;

	public VehiculoDiesel() {
		super();
		this.combustible = MIN_CAPACIDAD_COMBUSTIBLE;
	}

	public VehiculoDiesel(String modelo) {
		super(modelo);
		this.combustible = MIN_CAPACIDAD_COMBUSTIBLE;
	}

	public float getCombustible() {
		return combustible;
	}

	public void setCombustible(float combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return "VehiculoDiesel [combustible=" + combustible + "] extends " + super.toString();
	}

}
