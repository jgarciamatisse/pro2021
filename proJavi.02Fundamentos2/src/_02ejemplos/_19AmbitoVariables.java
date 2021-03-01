package _02ejemplos;

import java.util.Scanner;

public class _19AmbitoVariables {
	// La variable tec es GLOBAL. En este caso su uso si que es "licito"
	// porque los métodos no la usan para intercambiar información
	// entre si
	static Scanner tec = new Scanner(System.in);
	
	public static void main(String[] args) {
		int edad = leerEnteroPositivo("Edad: ");
		double peso = leerDoublePositivo("Peso: ");
		double estatura = leerDoublePositivo("Estatura: ");
		
		System.out.println(edad + " años");
		System.out.println("IMC: " + imc(peso,estatura));
	}

	private static double imc(double peso, double estatura) {
		return peso / Math.pow(estatura, 2);
	}

	private static double leerDoublePositivo(String mensaje) {
		System.out.println(mensaje);
		double numero = tec.nextDouble();
		while(numero < 0) {
			System.out.println("Tienes que introducir un valor positivo");
			System.out.println(mensaje);
			numero = tec.nextDouble();
		}
		
		return numero;
	}

	public static int leerEnteroPositivo(String mensaje) {
		System.out.println(mensaje);
		int numero = tec.nextInt();
		while(numero < 0) {
			System.out.println("Tienes que introducir un valor positivo");
			System.out.println(mensaje);
			numero = tec.nextInt();
		}
		
		return numero;		
	}
}
