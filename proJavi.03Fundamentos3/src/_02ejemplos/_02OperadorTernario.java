package _02ejemplos;

import java.util.Scanner;

public class _02OperadorTernario {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		
		//Con if-else
		if(edad >= 18) {
			System.out.println("SI puedes conducir");
		} else {
			System.out.println("NO puedes conducir");
		}
		
		//Lo mismo con operador ternario
		System.out.println((edad >= 18 ? "SI":"NO") + " puedes conducir");
	}
}
