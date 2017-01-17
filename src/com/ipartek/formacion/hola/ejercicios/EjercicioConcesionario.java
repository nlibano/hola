package com.ipartek.formacion.hola.ejercicios;

import java.util.ArrayList;

import com.ipartek.formacion.recetas.ejercicios.herencia.Vehiculo;
import com.ipartek.formacion.recetas.ejercicios.herencia.VehiculoDiesel;
import com.ipartek.formacion.recetas.ejercicios.herencia.VehiculoElectrico;

/**
 * Listar todos los Vehiculos del concesionario
 * 
 * @author Curso
 *
 */
public class EjercicioConcesionario {

	public static void main(String[] args) {
		// crear vehiculos

		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

		Vehiculo prius = new Vehiculo("Prius");
		prius.setPlazas(5);
		prius.setDimensiones(0);
		prius.setPotencia(300);

		Vehiculo ibiza = new Vehiculo("Ibiza");
		ibiza.setPlazas(5);
		ibiza.setDimensiones(0);
		ibiza.setPotencia(500);

		Vehiculo fordFiesta = new Vehiculo("Ford Fiesta");
		fordFiesta.setPlazas(4);
		fordFiesta.setDimensiones(0);
		fordFiesta.setPotencia(100);

		VehiculoElectrico tesla = new VehiculoElectrico("Tesla");
		tesla.setPlazas(5);
		tesla.setDimensiones(0);
		tesla.setPotencia(150);
		tesla.setCapacidadBaterias(500);

		VehiculoDiesel citroenSara = new VehiculoDiesel("Citroe Sara");
		citroenSara.setPlazas(5);
		citroenSara.setDimensiones(0);
		citroenSara.setPotencia(100);
		citroenSara.setCombustible(95);

		VehiculoDiesel opelAstra = new VehiculoDiesel("Opel Astra");
		opelAstra.setPlazas(5);
		opelAstra.setDimensiones(0);
		opelAstra.setPotencia(120);
		opelAstra.setCombustible(98);

		vehiculos.add(prius);
		vehiculos.add(ibiza);
		vehiculos.add(fordFiesta);
		vehiculos.add(tesla);
		vehiculos.add(citroenSara);
		vehiculos.add(opelAstra);

		// mostrar por pantalla

		System.out.println();

	}

}
