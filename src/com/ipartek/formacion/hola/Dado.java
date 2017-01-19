package com.ipartek.formacion.hola;

public class Dado {

	final static int NUM_MAX_ALUMNOS = 15;
	static String alumnoAfortunado;

	static String[] aAlumnos = { "Aaron", "Eneko", "Itsaso", "Ivan", "Guillermo", "Lozoya", "Josu", "Ignacio", "Gomez",
			"Nerea", "Nagore", "Garbieñe", "Egoitz", "Pavel", "Pérez" };

	public static void listar() {

		String alumno = "";
		for (int i = 0; i < aAlumnos.length; i++) {
			alumno = aAlumnos[i];
			System.out.println(i + " - " + alumno);
		}
	}

	public static void listarForEach() {
		for (String alumno : aAlumnos) {
			System.out.println(alumno);
		}
	}

	public static void main(String[] args) {

		int numeroAleatorio = Utilidades.getNumeroAleatorio((aAlumnos.length - 1));
		String afortunado = aAlumnos[numeroAleatorio];

		System.out.println("El/a afortunad@ es: " + afortunado);

		System.out.println("-------- listado ----------------");
		listar();

		/********************** bubble sort ********************************/

		System.out.println();
		int[] aDesordenado = { 3, 0, 1, 8, 7, 2, 5, 4, 6, 9 };
		int[] aOrdenado = Utilidades.bubbleSort(aDesordenado);

		System.out.println("Bublle sort: " + aOrdenado[0] + ", " + aOrdenado[1] + ", " + aOrdenado[2] + ", "
				+ aOrdenado[3] + ", " + aOrdenado[4] + ", " + aOrdenado[5] + ", " + aOrdenado[6] + ", " + aOrdenado[7]
				+ ", " + aOrdenado[8] + ", " + aOrdenado[9]);

	}

}
