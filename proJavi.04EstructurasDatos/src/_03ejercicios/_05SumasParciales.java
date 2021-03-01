package _03ejercicios;

import java.util.Arrays;

public class _05SumasParciales {
	public static void main(String[] args) {
		int v[] = {2, 6, 8, 12, 20};
		System.out.println(Arrays.toString(v));
		System.out.println(Arrays.toString(sumasParcialesBuena(v)));
		System.out.println(Arrays.toString(sumasParcialesBuena2(v)));
		System.out.println(Arrays.toString(sumasParcialesMala(v)));
		
		
	}
	public static int[] sumasParcialesMala(int[] v) {
		int[] t = new int[v.length];
		
		for (int i = 0; i < t.length; i++) {
			//Calculo la suma de los elementos 
			//de v desde la posicion 0 a la i
			int suma = 0;
			for (int j = 0; j <= i; j++) {
				suma = suma + v[j];
			}
			t[i] = suma;
		}
		return t;
	}
	public static int[] sumasParcialesBuena(int[] v) {
		int[] t = new int[v.length];
		
		t[0] = v[0];
		
		for (int i = 1; i < t.length; i++) {
			t[i] = t[i-1] + v[i];
		}
		
		return t;
	}
	public static int[] sumasParcialesBuena2(int[] v) {
		int[] t = new int[v.length];
		int suma = 0;
		
		for (int i = 0; i < t.length; i++) {
			suma = suma + v[i];
			t[i] = suma;
		}
		
		return t;
	}
	
}
