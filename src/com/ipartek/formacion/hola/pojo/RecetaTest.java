package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecetaTest {
	
	
	

	@Test
	public void testIsGlutenFree() {
		
		Ingrediente[] ingredientes = {
				new Ingrediente("pimiento verde", 0.5f , true),
				new Ingrediente("Bonito", 500 , true)				
		};
		
		//caso1 todos los ingredientes con gluten
		Receta r = new Receta("", ingredientes );
		assertFalse("caso1 todos los ingredientes con gluten",r.isGlutenFree());
		
		//caso2 todos los ingredientes SIN gluten
		ingredientes[0] = new Ingrediente("", 0 , false);
		ingredientes[1] = new Ingrediente("", 0 , false);
		
		r = new Receta("", ingredientes );
		assertTrue("caso2 todos los ingredientes SIN gluten",r.isGlutenFree());		
		
		//caso3 todos los ingredientes con y sin gluten
		ingredientes[0] = new Ingrediente("", 0 , true);
		ingredientes[1] = new Ingrediente("", 0 , false);
		
		r = new Receta("", ingredientes );
		assertFalse("caso3 todos los ingredientes con y sin gluten",r.isGlutenFree());		
				
		//caso4 sin ingredientes (null)
		r = new Receta("", null );
		assertTrue("caso4 sin ingredientes",r.isGlutenFree());	
		
				
	}

}
