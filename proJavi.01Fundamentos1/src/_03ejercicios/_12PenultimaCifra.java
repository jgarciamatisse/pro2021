package _03ejercicios;

import java.util.Scanner;

public class _12PenultimaCifra {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce número");
		int numero = tec.nextInt();
		
		int penultimaCifra = numero / 10 % 10; 
		System.out.println("Penultima cifra: " + penultimaCifra);
	}
}
