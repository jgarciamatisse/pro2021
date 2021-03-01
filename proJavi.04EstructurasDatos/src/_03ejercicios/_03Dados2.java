package _03ejercicios;

import java.util.Random;

public class _03Dados2 {

	public static void main(String[] args) {
		final int LANZAMIENTOS = 10000000;
		final int MOSTRAR_CADA = 100000;
		Random r = new Random();

		int[] veces = new int[13];

		for (int i = 1; i <= LANZAMIENTOS; i++) {
			// int dado = 1 + (int)(Math.random() * 6);
			int dado = 1 + r.nextInt(6) + 1 + r.nextInt(6);
			

			veces[dado]++;
			if (i % MOSTRAR_CADA == 0) {
				// Mostrar porcentajes
				for(int pos = 1; pos < veces.length; pos++) {
					System.out.format("%d: %6.2f %% %n", pos, 100.0 * veces[pos] / i);
				}
				System.out.println("------");
			}

		}

	}

}
