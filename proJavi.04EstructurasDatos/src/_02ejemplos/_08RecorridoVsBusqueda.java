package _02ejemplos;

import java.util.Random;

public class _08RecorridoVsBusqueda {
	public static void main(String[] args) {
		Random r = new Random(1);
		// Array muy grande
		int[] valores = new int[100000000];
		for (int i = 0; i < valores.length; i++) {
			valores[i] = i+1;
		}

		// Cuantos valores del rango [1 .. 100000] están en el array
		System.out.println("Empieza");
		long t2,t1;
		t1 = System.currentTimeMillis();
		int cont = 0;
		for (int num = 1; num <= 1000; num++) {
			for (int i = 0; i < valores.length; i++) {
				if (num == valores[i]) {
					cont++;
				}
			}
		}
		t2 = System.currentTimeMillis();
		System.out.println(t2-t1);

		t1 = System.currentTimeMillis();
		cont = 0;
		for (int num = 1; num <= 1000; num++) {
			boolean enc = false;
			int i = 0;
			while (i < valores.length && !enc) {
				if(num == valores[i]) {
					cont++;
					enc = true;
				} else {
					i++;
				}
			}

		}
		t2 = System.currentTimeMillis();
		System.out.println(t2-t1);

	}

}
