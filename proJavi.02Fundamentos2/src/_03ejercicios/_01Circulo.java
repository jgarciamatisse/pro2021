package _03ejercicios;

import java.util.Scanner;

public class _01Circulo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce radio: ");
		int radio = tec.nextInt();
		
		double longitud = 2 * Math.PI * radio;
		double superficie = Math.PI * Math.pow(radio, 2);
		double volumen = (4.0/3.0) * Math.PI * Math.pow(radio, 3);
		
		System.out.println("Longitud: " + longitud);
		System.out.println("Superficie: " + superficie);
		
	}
}
