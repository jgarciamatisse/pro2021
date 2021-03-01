package _03ejercicios;

import java.util.Scanner;

public class _02NifMala {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("NIF: ");
		String nif = tec.next();
		try {
			if (validarNif(nif)) {
				System.out.println("VÁLIDO");
			} else {
				System.out.println("NO VALIDO");
			}
		} catch (NumberFormatException e) {
			System.out.println("NO VALIDO");
		}

	}

	public static boolean validarNif(String nif) {
		boolean valido;
		// Separar letra y números
		char letra = nif.charAt(nif.length() - 1);
		String sNumeros = nif.substring(0, nif.length() - 1);
		int numero = Integer.parseInt(sNumeros);

		// Comprobar si letra y número se corresponden
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int posLetra = numero % 23;

		if (letra != letras.charAt(posLetra)) {
			valido = false;
		} else {
			valido = true;
		}
		return valido;

	}

}
