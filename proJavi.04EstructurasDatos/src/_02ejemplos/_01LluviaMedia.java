package _02ejemplos;

import java.util.Scanner;

public class _01LluviaMedia {
	public static void main(String[] args) {
		//Calculo de la lluvia media
		Scanner tec = new Scanner(System.in);
		double total = 0;
		for(int dia = 1; dia <= 31; dia++) {
			System.out.println("Lluvia del dia " + dia + ": ");
			double lluvia = tec.nextDouble();
			total += lluvia;
		}
		
		//Lluvia media 
		System.out.println("Lluvia media: " + (total / 31));
		
		//Cuantos dias llovió mas de la media:
		
		//no lo puedo saber
	}

}
