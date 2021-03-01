package _02ejemplos;

import java.util.Scanner;

public class _01TipoBoolean {
	public static void main(String[] args) {
		// Una variable boolean admite dos posibles valores:
		// true o false
		boolean esViernes = true;
		boolean esLunes;
		esLunes = false;

		System.out.println("Es lunes: " + esLunes);
		System.out.println("Es viernes: " + esViernes);

		// Se pueden usar variables boolean como condiciones
		// en if-else o bucles

		if (esViernes) {
			System.out.println("Es el quinto dia de la semana");
		} else if (esLunes) {
			System.out.println("Es el primer dia de la semana");
		}

		// Equivale a lo siguiente
		if (esViernes == true) {
			System.out.println("Es el quinto dia de la semana");
		} else if (esLunes == true) {
			System.out.println("Es el primer dia de la semana");
		}

		// También podemos definir métodos que devuelven un tipo
		// boolean y usar una llamada al método como condicion
		// de un if o un bucle
		Scanner tec = new Scanner(System.in);
		System.out.println("Indica dia de la semana (1 a 7)");
		int d = tec.nextInt();
		if (esLectivo(d)) {
			System.out.println("Tienes que ir a clase");
		} else {
			System.out.println("No tienes que ir a clase");
		}
	}

	public static boolean esLectivo(int dia) {
		boolean resultado;
		if (dia >= 1 && dia <= 5) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}

	public static boolean esLectivo2(int dia) {
		boolean resultado;
		resultado = dia >= 1 && dia <= 5;
		return resultado;
	}

	public static boolean esLectivo3(int dia) {
		return dia >= 1 && dia <= 5;
	}
}
