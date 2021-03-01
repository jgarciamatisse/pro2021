package _02ejemplos;

import java.util.Scanner;

public class _03EntradaTeclado {
	public static void main(String args[]) {
		Scanner tec = new Scanner(System.in);
		
		//Entrada
		System.out.println("Introduce edad: ");
		int edad = tec.nextInt();
		
		System.out.println("Introduce estatura: ");
		double estatura = tec.nextDouble();
		
		System.out.println("Introduce nombre: ");
		String nombre = tec.next();
		
		//Salida
		System.out.println("Hola " + nombre + ". Tienes " + edad + " años");
		System.out.println("y mides " + estatura);
	}

}
