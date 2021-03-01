package _03ejercicios._06Contrarreloj;

import java.util.Scanner;

import _02ejemplos._01tiempo.Tiempo;

public class TestCorredor {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		// Creamos dos corredores cuyo nombre indica el usuario
		System.out.println("Nombre 1: ");
		String nombre1 = tec.nextLine();
		System.out.println("Nombre 2: ");
		String nombre2 = tec.nextLine();

		int d1 = Corredor.generarDorsal();
		int d2 = Corredor.generarDorsal();

		Corredor c1 = new Corredor(d1, nombre1, new Tiempo(10, 30, 0));
		Corredor c2 = new Corredor(d2, nombre2, new Tiempo(10, 35, 0));
		System.out.println(c1);
		System.out.println(c2);

		try {
			c1.setLlegada(new Tiempo(10, 40, 0));
			c2.setLlegada(new Tiempo(10, 30, 0));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(c1);
		System.out.println(c2);

	}

}
