package com.ipartek.formacion.hola.pojo.comparator;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.recetas.ejercicios.herencia.IEstupida;
import com.ipartek.formacion.recetas.ejercicios.herencia.Pajaro;
import com.ipartek.formacion.recetas.ejercicios.herencia.Vehiculo;

public class ComparatorVehiculoPajaroTest {

	ArrayList<IEstupida> iEstupida = new ArrayList<IEstupida>();

	Vehiculo seat = new Vehiculo();
	Vehiculo fordK = new Vehiculo();

	Pajaro kiwi = new Pajaro("kiwi", 3500);
	Pajaro gallina = new Pajaro("gallina", 150);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		kiwi.setNumHuevosSemana(2);

		gallina.setNumHuevosSemana(700);

		seat.setModelo("seat");
		seat.setPotencia(500.33f);

		fordK.setModelo("Ford k");
		fordK.setPotencia(100);

		iEstupida.add(kiwi);
		iEstupida.add(gallina);
		iEstupida.add(seat);
		iEstupida.add(fordK);

	}

	@After
	public void tearDown() throws Exception {
		iEstupida = null;
		seat = null;
		fordK = null;
		kiwi = null;
		gallina = null;
	}

	@Test
	public void testComparator() {
		final String MSG_ERROR_POTENCIA_HUEVOS_SEM = "No ordena por potencia ni por numero de huvos semana";

		Collections.sort(iEstupida, new ComparatorPotenciaNumHuevoSemana());

		assertEquals(MSG_ERROR_POTENCIA_HUEVOS_SEM, kiwi, iEstupida.get(0));
		assertEquals(MSG_ERROR_POTENCIA_HUEVOS_SEM, fordK, iEstupida.get(1));
		assertEquals(MSG_ERROR_POTENCIA_HUEVOS_SEM, seat, iEstupida.get(2));
		assertEquals(MSG_ERROR_POTENCIA_HUEVOS_SEM, gallina, iEstupida.get(3));
	}

}
