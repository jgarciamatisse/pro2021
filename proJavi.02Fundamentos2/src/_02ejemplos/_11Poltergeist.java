package _02ejemplos;

import java.util.Scanner;

public class _11Poltergeist {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Edad: ");
		//Leemos entero y vaciamos el INTRO que ha quedado
		//en la memoria del teclado
		int edad = tec.nextInt(); tec.nextLine(); 
		
		System.out.println("Nombre: ");
		String nombre = tec.nextLine();
		
		System.out.println("Estatura: ");
		double estatura = tec.nextDouble();
		
	}

}
