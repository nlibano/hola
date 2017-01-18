package com.ipartek.formacion.recetas.ejercicios.herencia;

/**
 * Comprobar que solo podemos instanciar objetos de las Clases que No sean
 * Abstractas.<br>
 * 
 * @author Curso
 *
 */
public class EjercicioAbstraccion {

	public static void main(String[] args) {
		// ObjetoGrafico og = new ObjetoGrafico() {

		Linea linea = new Linea(0, 0);

		// En principio no se puede instanciar un objeto de Clase abstracta a
		// menos que se implemente en el momento de la instanciacion
		// clase anonima
		Circulo c = new Circulo(5, 5) {

			@Override
			public void dibujar() {
				System.out.println("Dibujando Circulo");
			}
		};
		c.dibujar();

		CirculoNoAbstracto c2 = new CirculoNoAbstracto(0, 0);
	}

}
