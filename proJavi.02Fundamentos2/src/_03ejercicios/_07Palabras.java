package _03ejercicios;

import java.util.Scanner;

public class _07Palabras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Texto: ");
		String texto = tec.nextLine();

		System.out.println("Primera letra: " + texto.charAt(0));
		System.out.println("Ultima letra: " + texto.charAt(texto.length() - 1));

		int posPrimerBlanco = texto.indexOf(' ');
		if (posPrimerBlanco == -1) {
			// El texto solo tiene una palabra
			System.out.println("Primera palabra: " + texto);
		} else {
			// El texto tiene, al menos, 2 palabras. Separo la primera
			System.out.println("Primer palabra: " + texto.substring(0, posPrimerBlanco));
			int posSegundoBlanco = texto.indexOf(' ', posPrimerBlanco + 1);
			if (posSegundoBlanco == -1) {
				System.out.println("Segunda palabra: " + texto.substring(posPrimerBlanco+1));
			} else {
				System.out.println("Segunda palabra: " + texto.substring(posPrimerBlanco+1, posSegundoBlanco));
				
				//Lo mismo con el tercer blanco
				//...
				//...
				
			}
		}
	}
}
