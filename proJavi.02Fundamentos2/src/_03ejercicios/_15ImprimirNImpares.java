package _03ejercicios;

import java.util.Scanner;

public class _15ImprimirNImpares {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Cuantos impares quieres mostrar? : ");
		int n = tec.nextInt();
		
		int cont = 0;
		int impar = 1;
		while(cont < n) {
			System.out.println(impar);
			impar = impar + 2;
			cont = cont + 1;
		}
		
		//De otra forma
		cont = 0;
		
		while(cont < n) {
			System.out.println(cont * 2 + 1);
			
			cont = cont + 1;
		}
	}
}





