package _02ejemplos;

import java.util.Scanner;

public class _01AlgunasExcepciones {
	public static void main(String[] args) {
		int[] numeros = {0,1,2,3,4,5};
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Vamos a dividir dos elementos del array ");
		System.out.println("Indica posicion del array en que esta el dividendo");
		int posDividendo = tec.nextInt();
		System.out.println("Indica posicion del array en que esta el dividendo");
		int posDivisor = tec.nextInt();
		
		System.out.println("Cociente: " + (numeros[posDividendo] / numeros[posDivisor]));
		
	}
}
