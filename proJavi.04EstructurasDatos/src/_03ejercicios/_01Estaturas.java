package _03ejercicios;

import java.util.Scanner;

public class _01Estaturas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double estatura[] = new double[10];
		
		//Leemos las estaturas
		for (int i = 0; i < estatura.length; i++) {
			System.out.println("Estatura " + (i + 1) + ": ");
			estatura[i] = tec.nextDouble();
		}
		
		//Mostramos las estaturas introducidas
		for (int i = 0; i < estatura.length; i++) {
			System.out.format("Persona %d: %4.2f m.%n", i+1, estatura[i]);
		}
		
	}

}
