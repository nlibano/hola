package com.ipartek.formacion.hola.pojo;

import java.util.Arrays;

public class Receta {
	
	private String titulo;
	private Ingrediente[] ingredientes;
	private int tiempo;
	private String dificultad;
	private int comensales;
	private String descripcion;
	
	
	public Receta(String titulo, Ingrediente[] ingredientes) {
		super();
		this.titulo = titulo;
		this.ingredientes = ingredientes;
		this.tiempo = 0;
		this.comensales = 0;
		this.dificultad = "facil";
		this.descripcion = "Lorem ipsum....";
	}


	//TODO realizar TEst e implementacion
	public boolean isGlutenFree(){
		return false;
	}
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Ingrediente[] getIngredientes() {
		return ingredientes;
	}


	public void setIngredientes(Ingrediente[] ingredientes) {
		this.ingredientes = ingredientes;
	}


	public int getTiempo() {
		return tiempo;
	}


	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}


	public String getDificultad() {
		return dificultad;
	}


	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}


	public int getComensales() {
		return comensales;
	}


	public void setComensales(int comensales) {
		this.comensales = comensales;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "Receta [titulo=" + titulo + ", ingredientes=" + Arrays.toString(ingredientes) + ", tiempo=" + tiempo
				+ ", dificultad=" + dificultad + ", comensales=" + comensales + ", descripcion=" + descripcion + "]";
	}
	 
	
	

}
