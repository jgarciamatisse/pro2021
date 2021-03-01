package _03ejercicios;

import java.util.Random;

public class _03Dados {

	public static void main(String[] args) {
		final int LANZAMIENTOS = 10000000;
		final int MOSTRAR_CADA = 100000;
		Random r = new Random();

		int[] veces = new int[7];

		for (int i = 1; i <= LANZAMIENTOS; i++) {
			// int dado = 1 + (int)(Math.random() * 6);
			int dado = 1 + r.nextInt(6);

			if (dado == 1)
				veces[1]++;
			else if (dado == 2)
				veces[2]++;
			else if (dado == 3)
				veces[3]++;
			else if (dado == 4)
				veces[4]++;
			else if (dado == 5)
				veces[5]++;
			else
				veces[6]++;

			if (i % MOSTRAR_CADA == 0) {
				// Mostrar porcentajes
				System.out.format("1: %6.2f %% %n", 100.0 * veces[1] / i);
				System.out.format("2: %6.2f %% %n", 100.0 * veces[2] / i);
				System.out.format("3: %6.2f %% %n", 100.0 * veces[3] / i);
				System.out.format("4: %6.2f %% %n", 100.0 * veces[4] / i);
				System.out.format("5: %6.2f %% %n", 100.0 * veces[5] / i);
				System.out.format("6: %6.2f %% %n", 100.0 * veces[6] / i);
				System.out.println("------");
			}

		}

	}

}
