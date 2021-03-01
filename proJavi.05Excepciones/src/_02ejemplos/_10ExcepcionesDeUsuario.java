package _02ejemplos;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class _10ExcepcionesDeUsuario {

	static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		boolean volverAPedir = true;
		do {
			try {
				System.out.println("Introduce tu nif: ");
				String nif = leerNif();
				volverAPedir = false;
			} catch (NifIncorrectoException e) {
				System.out.println("Nif incorrecto");
			}
		} while (volverAPedir);
		System.out.println("Nif leido correctamente");

	}

	public static String leerNif() throws NifIncorrectoException {
		String texto = tec.next().toUpperCase();
		String sNumeros = texto.substring(0, texto.length()-1); // Numeros del nif
		char letra = texto.charAt(texto.length() - 1); // letra del nif
		int numero = Integer.parseInt(sNumeros); // Convertimos a entero

		// Calculamos qué letra corresponde al numero

		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int posLetra = numero % 23;

		if (letra != letras.charAt(posLetra)) {
			throw new NifIncorrectoException("Letra nif incorrecta");
		}
		return texto;

	}

}
