package _03ejercicios;

import java.util.Arrays;

public class _06Rotaciones {
	public static void main(String[] args) {
		int[] numeros = {1,2,3,4,5};
		System.out.println(Arrays.toString(numeros));
		
		//Rotamos tantas veces como elementos tiene el array
		for (int i = 0; i < numeros.length; i++) {
			rotarDerecha(numeros);
			System.out.println(Arrays.toString(numeros));
		}
		
	}
	
	public static void rotarDerecha(int[] v) {
		
		int aux = v[v.length-1]; //Reservo el último
		
		//Despazo a la derecha
		for(int i = v.length-1; i >= 1  ; i--) {
			v[i] = v[i-1];
		}
		
		//Copio el reservado a la posicion 0
		v[0] = aux;
	}

}
