package _02ejemplos;

import java.util.Scanner;

public class _03LluviaMedia {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double[] lluvia = new double[31];
		double total = 0;

		// Recorremos el array para rellenarlo
		for (int i = 0; i < 31; i++) {
			System.out.println("Lluvia del dia " + (i + 1));
			lluvia[i] = tec.nextDouble();
			total = total + lluvia[i];
		}

		// Lluvia media
		double media = total / 31;
		System.out.println("Lluvia media: " + (total / 31));

		// Cuantos dias llovió mas de la media:
		// Recorremos el array contando los valores superiores a la media
		int diasMasMedia = 0;
		for (int i = 0; i < 31; i++) {
			if(lluvia[i] > media) {
				diasMasMedia++;
			}
		}
		System.out.println("Numero dias con lluvia superior a la media: " + diasMasMedia);

	}

}


