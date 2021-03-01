package _02ejemplos;

import java.util.Scanner;

public class _05WhileVsDoWhile {
	public static void main(String[] args) {
		// Escribir un programa en el que el usuario introduzca un entero
		// y se le diga si es par o impar.
		// El programa finaliza cuando el usuario introduce un valor negativo
		
		Scanner tec = new Scanner(System.in);
		
		//Con while
		System.out.println("Introduce entero: ");
		int num = tec.nextInt();
		while(num >= 0) {
			if(num % 2 == 0) {
				System.out.println("PAR");
			} else {
				System.out.println("IMPAR");
			}
			System.out.println("Introduce entero: ");
			num = tec.nextInt();
		}
		
		//Con do-while
		int num2;
		do {
			System.out.println("Introduce entero: ");
			num2 = tec.nextInt();
			if(num2 >= 0) {
//				if(num2 % 2 == 0) {
//					System.out.println("PAR");
//				} else {
//					System.out.println("IMPAR");
//				}
				System.out.println(num%2 == 0?"PAR":"IMPAR");
			}
			
		} while(num2 >= 0);
		
		
	}

}






