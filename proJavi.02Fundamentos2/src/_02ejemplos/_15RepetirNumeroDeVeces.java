package _02ejemplos;

import java.util.Scanner;

public class _15RepetirNumeroDeVeces {
	public static void main(String[] args) {
		//Pedir 5 nombres al usuario
		
		Scanner tec = new Scanner(System.in);
		//Usamos un contador para que el bucle
		//se ejecute 5 veces
		int veces = 0;
		while(veces < 5) {
			System.out.println("Introduce nombre: ");
			String nombre = tec.nextLine();
			System.out.println("El nombre tiene " + nombre.length()+ " letras");
			
			veces = veces + 1;
		}
		
	}
}
