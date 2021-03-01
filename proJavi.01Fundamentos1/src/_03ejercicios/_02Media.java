package _03ejercicios;

import java.util.Scanner;

public class _02Media {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Edad 1: ");
		int edad1 = tec.nextInt();
		System.out.println("Edad 2: ");
		int edad2 = tec.nextInt();
		System.out.println("Edad 3: ");
		int edad3 = tec.nextInt();
		
		double media = (edad1 + edad2 + edad3) / 3.0;
		System.out.println("Media: " + media);
		
		System.out.println("Media: " + (edad1 + edad2 + edad3)/ 3.0);
	}

}
