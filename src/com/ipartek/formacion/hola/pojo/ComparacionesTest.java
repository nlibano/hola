package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ComparacionesTest {

	ArrayList<Receta> recetas = new ArrayList<Receta>();
	ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

	Receta solomillo = new Receta("Solomillo");
	Receta marmitako = new Receta("Marmitako");
	Receta tortillaPatatas = new Receta("Tortilla de Patatas");

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		solomillo.setDificultad(Receta.MODERADO);
		marmitako.setDificultad(Receta.DIFICIL);
		tortillaPatatas.setDificultad(Receta.FACIL);

		ingredientes.add(new Ingrediente("pimiento verde", 0.5f, false));
		ingredientes.add(new Ingrediente("Bonito", 500, false));
		ingredientes.add(new Ingrediente("patatas", 4, false));
		ingredientes.add(new Ingrediente("ajo", 1, false));
		marmitako.setIngredientes(ingredientes);

		ingredientes.clear();
		ingredientes.add(new Ingrediente("huevo", 4, false));
		ingredientes.add(new Ingrediente("cebolla", 1, false));
		ingredientes.add(new Ingrediente("patatas", 6, false));
		tortillaPatatas.setIngredientes(ingredientes);

		ingredientes.clear();
		ingredientes.add(new Ingrediente("solomillo", 2, false));
		solomillo.setIngredientes(ingredientes);

		recetas.add(solomillo);
		recetas.add(marmitako);
		recetas.add(tortillaPatatas);

	}

	@After
	public void tearDown() throws Exception {
		recetas = null;
		solomillo = null;
		marmitako = null;
		tortillaPatatas = null;
		ingredientes = null;
	}

	@Test
	public void testComparable() {

		// Ordenar de la A-Z
		Collections.sort(recetas); // funciona con implements Comparable.

		// Comprobar
		assertEquals(marmitako, recetas.get(0));
		assertEquals(solomillo, recetas.get(1));
		assertEquals(tortillaPatatas, recetas.get(2));

		// Ordenar de la Z-A
		Collections.sort(recetas, Collections.reverseOrder());

		assertEquals(tortillaPatatas, recetas.get(0));
		assertEquals(solomillo, recetas.get(1));
		assertEquals(marmitako, recetas.get(2));

	}

	@Test
	public void testComparator() {

		final String MSG_ERROR_DIFICULTAD = "No ordena por nivel de dificultad";
		final String MSG_ERROR_NUM_INGREDIENTES = "No ordena por numero de ingredientes";

		// vamos a ordenar por nivel de dificultad de Receta

		// ordenar
		Collections.sort(recetas, new ComparatorRecetaNivelDificultad());
		// Comprobar

		assertEquals(MSG_ERROR_DIFICULTAD, tortillaPatatas, recetas.get(0));
		assertEquals(MSG_ERROR_DIFICULTAD, solomillo, recetas.get(1));
		assertEquals(MSG_ERROR_DIFICULTAD, marmitako, recetas.get(2));

		Collections.sort(recetas, new ComparatorNumeroIngredientes());
		assertEquals(MSG_ERROR_NUM_INGREDIENTES, solomillo, recetas.get(0));
		assertEquals(MSG_ERROR_NUM_INGREDIENTES, tortillaPatatas, recetas.get(1));
		assertEquals(MSG_ERROR_NUM_INGREDIENTES, marmitako, recetas.get(2));

	}

}
