package _03ejercicios;

import java.util.Scanner;

public class _01ValidarFecha {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce fecha: ");
		String fecha = tec.nextLine();
		if (esFechaValida(fecha)) {
			System.out.println("Valida");
		} else {
			System.out.println("No valida");
		}
	}

	private static boolean esFechaValida(String fecha) {
		boolean esValida;
		try {
		int posBarra1 = fecha.indexOf('/');
		int posBarra2 = fecha.lastIndexOf('/');
		
		int d = Integer.parseInt(fecha.substring(0,posBarra1));
		int m = Integer.parseInt(fecha.substring(posBarra1 + 1, posBarra2));
		int a = Integer.parseInt(fecha.substring(posBarra2 + 1));
		
		
		if(d > 0 && d < 32 && m > 0 && m < 13 && a > 0) {
			esValida = true;
		} else {
			esValida = false;
		}
		} catch (NumberFormatException | StringIndexOutOfBoundsException e) {
			esValida = false;
		}
		return esValida;
		
	}

}
