package _03ejercicios;

import java.util.Random;
import java.util.Scanner;

public class _09BlackJack {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Random r = new Random();
		int total = 0;
		String quiere;
		do {
			System.out.println("Quiere otra carta (si/no) ?");
			quiere = tec.next().toLowerCase();

			if (quiere.equals("si")) {
				int carta = r.nextInt(10) + 1;

				System.out.println("Carta: " + carta);

				total += carta;
				System.out.println("Total: " + total);
			}

		} while (total < 20 && quiere.equals("si"));
	
		if(total <= 20) {
			System.out.println("Puntuacion final: " + total);
		} else {
			System.out.println("Te has pasado");
		}
	}

}
