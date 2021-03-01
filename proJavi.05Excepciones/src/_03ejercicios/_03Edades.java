package _03ejercicios;

import java.util.Scanner;

public class _03Edades {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int suma = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Edad " + (i + 1));
			int edad = tec.nextInt();
			
			suma += edad;
			
		}	
		double media = suma / 5.0;
		System.out.println("Media: " + media);
	}

}
