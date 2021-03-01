package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03CapturarExcepcion {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		try {
			System.out.println("Edad: ");
		
			int edad = tec.nextInt();
		
			if(edad >= 18) System.out.println("Mayor de edad");
			else System.out.println("Menor de edad");
		} catch(InputMismatchException e) {
			System.out.println("La edad tiene que ser un numero entero");
		}
		System.out.println();
	}

}
