package _03ejercicios;

import java.util.Scanner;

public class _05LeerEntero {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
		int edad = leerEnteroPositivo();
		System.out.println("Edad: " + edad);
	}

	public static int leerEnteroPositivo() {
		int num;
		do {
			System.out.println("Numero positivo: ");
			num = tec.nextInt();
			if(num <= 0) {
				System.out.println("Numero no valido");
			}
		} while (num <= 0);
		
		return num;
	}
}
