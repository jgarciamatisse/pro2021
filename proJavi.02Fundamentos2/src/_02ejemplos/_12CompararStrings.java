package _02ejemplos;

import java.util.Scanner;

public class _12CompararStrings {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre 1:");
		String n1 = tec.nextLine();

		System.out.println("Nombre 2:");
		String n2 = tec.nextLine();

		// Aunque el contenido de los dos strings sea identico
		// la comparacion con == dirá que son distintos, porque
		// lo que comprueba es si n1 y n2 son el mismo objeto
		if (n1 == n2) {
			System.out.println("Los nombres son iguales");
		} else {
			System.out.println("Los nombres son distintos");
		}

		// Vamos a comparar dos variables que referencian al
		// mismo objeto
		String n3 = n1;
		if (n1 == n3) {
			System.out.println("Los nombres son iguales");
		} else {
			System.out.println("Los nombres son distintos");
		}

		// A veces la comparación con == si que funciona
		String mueble1 = "mesa";
		String mueble2 = "mesa";
		if (mueble1 == mueble2) {
			System.out.println("Los muebles son iguales");
		} else {
			System.out.println("Los muebles son distintos");
		}

		// La comparación de Strings se tiene que hacer con el
		// metodo equals
		if (n1.equals(n2)) {
			System.out.println("Los nombres son iguales");
		} else {
			System.out.println("Los nombres son distintos");
		}

		// Para comprobar si dos String son distintos
		if (!n1.equals(n2)) {
			System.out.println("Los nombres son distintos");
		} else {
			System.out.println("Los nombres son iguales");
		}
		
		//Comprobar desigualdades
		System.out.println("casa".compareTo("casa")); //Cero
		System.out.println("alumna".compareTo("alumno")); //Menor que cero
		System.out.println("zarza".compareTo("albahaca")); //Mayor que cero
	}

}







