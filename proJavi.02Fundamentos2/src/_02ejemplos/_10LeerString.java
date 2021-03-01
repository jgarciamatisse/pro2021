package _02ejemplos;

import java.util.Scanner;

public class _10LeerString {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		String nombre = tec.nextLine();
		
		System.out.println("Apellidos: ");
		String apellidos = tec.nextLine();
		
		
		System.out.println("Te llamas: " 
				+ nombre + " " + apellidos);
	}

}
