package com.ipartek.formacion.hola.pojo.comparator;

import java.util.Comparator;

import com.ipartek.formacion.recetas.ejercicios.herencia.IEstupida;
//import com.ipartek.formacion.recetas.ejercicios.herencia.Pajaro;
//import com.ipartek.formacion.recetas.ejercicios.herencia.Vehiculo;

public class ComparatorPotenciaNumHuevoSemana implements Comparator<IEstupida> {

	@Override
	public int compare(IEstupida o1, IEstupida o2) {
		// return getPotenciaNumHuevos(o1) - getPotenciaNumHuevos(o2);
		return o1.getPeso() - o2.getPeso();
	}

/*	private int getPotenciaNumHuevos(IEstupida i) {
		int valorAOrdenar = 0;

		if (i instanceof Vehiculo) {
			valorAOrdenar = (int) ((Vehiculo) i).getPotencia();
		} else if (i instanceof Pajaro) {
			valorAOrdenar = ((Pajaro) i).getNumHuevosSemana();
		}
		return valorAOrdenar;
	}
*/
}
