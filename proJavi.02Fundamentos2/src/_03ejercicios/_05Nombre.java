package _03ejercicios;

import java.util.Scanner;

public class _05Nombre {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre = tec.nextLine();
		
		char primero = nombre.toUpperCase().charAt(0);
		char ultimo = nombre.toUpperCase().charAt(nombre.length()-1);
		
		if(primero == ultimo) {
			System.out.println("Primero y ultimo iguales");
		} else {
			System.out.println("Primero y ultimo distintos");
		}
		
		//Lo mismo con substring
		String sPrimero = nombre.toUpperCase().substring(0,1);
		String sUltimo = nombre.toUpperCase().substring(nombre.length()-1);
		if(sPrimero.equals(sUltimo)) {
			System.out.println("Primero y ultimo iguales");
		} else {
			System.out.println("Primero y ultimo distintos");
		}
		
		//Como se transforma de caracter a String
		String s1 = String.valueOf('x');
		String s2 = ""+'x';
		
	}
}






