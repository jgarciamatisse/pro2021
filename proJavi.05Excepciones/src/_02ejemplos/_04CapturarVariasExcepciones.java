package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04CapturarVariasExcepciones {
	public static void main(String[] args) {
		int[] numeros = { 0, 1, 2, 3, 4, 5 };
		Scanner tec = new Scanner(System.in);

		try {

			System.out.println("Vamos a dividir dos elementos del array ");
			System.out.println("Indica posicion del array en que esta el dividendo");
			int posDividendo = tec.nextInt();
			System.out.println("Indica posicion del array en que esta el dividendo");
			int posDivisor = tec.nextInt();

			System.out.println("Cociente: " + (numeros[posDividendo] / numeros[posDivisor]));
		} catch (InputMismatchException e) {
			System.out.println("Los valores tienen que ser enteros");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posicion incorrecta");
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por cero");
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Error inesperado");
		} 

	}
}
