package _03ejercicios;

import java.util.Scanner;

public class _15ImprimirNImparesFor {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Cuantos impares quieres mostrar? : ");
		int n = tec.nextInt();
		
		
		int impar = 1;
		for(int cont = 0; cont < n; cont++) {
			System.out.println(impar);
			impar = impar + 2;
			
		}
		
		
	}
}





