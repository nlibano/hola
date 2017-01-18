package com.ipartek.formacion.recetas.ejercicios.herencia;

import java.util.ArrayList;

import com.ipartek.formacion.hola.pojo.Ingrediente;

public class Burro extends Animal implements Conducible, Cocinable, Vendible {

	private String nombre;

	public Burro(String nombre, String raza, float precio) {
		super("", 0);
		// super(raza, precio);
		this.nombre = nombre;
	}

	public Burro(String nombre) {
		super("", 0);
		// super(raza, precio);
		setRaza("burro");
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void arrancar() {
		System.out.println("Arre burro");
	}

	@Override
	public void detener() {
		System.out.println("Sooooooo");

	}

	@Override
	public void girar(String direccion) {
		System.out.println("giro a " + direccion);

	}

	@Override
	public ArrayList<Ingrediente> getIngredientes() {
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(new Ingrediente("cebolla", 4, false));
		ingredientes.add(new Ingrediente("Carne de burro", 2, false));

		return ingredientes;
	}

	@Override
	public String getDescripcionReceta() {
		return "Sal pimentar y a la cazuela";
	}

	@Override
	public void generarFactura() {
		float iva = (float) (getPrecio() * 1.21);
		System.out.println("Factura con iva incluido:  " + iva);
	}

	@Override
	public String toString() {
		return "Burro [nombre=" + nombre + "] extends " + super.toString();
	}
}
