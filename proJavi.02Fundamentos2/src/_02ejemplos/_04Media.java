package _02ejemplos;

import java.util.Scanner;

public class _04Media {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Cuanto suman las notas de todos los alumnos?: ");
		int suma = tec.nextInt();
		
		System.out.println("Cuantos alumnos hay?: ");
		int numAlumnos = tec.nextInt();
		
		double media = suma / (double) numAlumnos;
		System.out.println("Nota media: " + media);
	}
}
