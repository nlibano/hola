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


	
	/**
	 * Nos indica si la receta esta libre de ingredientes con gluten
	 * @return true si todos los ingredientes no contienen gluten <br>
	 *         false si alguno de los ingredientes contienen gluten <br>
	 *         true si no existen ingredientes
	 */
	public boolean isGlutenFree(){
		boolean resul = true;
		if ( this.ingredientes != null ){
			for (Ingrediente i : this.ingredientes) {
				if ( i.isGluten() ){
					resul = false;
					break;
				}
			}
		}	
		return resul;
	}
	
	
	public void addIngrendiente( Ingrediente ingrendiente ){
		
	}
	
	/**
	 * Eliminar el primer ingrendiente que encuentre con el mismo <ode>nombre</code> CaseInsesitive
	 * @param ingrendiente ingrediente a eliminar
	 * @return true si eliminar ingrediente<br>
	 *         false en caso contrario	  
	 */
	public boolean removeIngrendiente( Ingrediente ingrendiente ){
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
