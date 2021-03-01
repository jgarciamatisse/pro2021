package _03ejercicios;

import java.util.Arrays;

public class _04Invertir {
	public static void main(String[] args) {
		int[] numeros = {7,1,3,2,4};
		System.out.println(Arrays.toString(numeros));
		
		int[] invertido = invertirArray(numeros);
		System.out.println(Arrays.toString(invertido));
	}
	
	public static int[] invertirArray(int[] v) {
		int[] resultado = new int[v.length];
		
		for(int i = 0; i < v.length; i++) {
			resultado[resultado.length - 1 - i] = v[i];
		}
		return resultado;
	}
	
	public static int[] invertirArray2(int[] v) {
		int[] resultado = new int[v.length];
		
		int i = 0;
		int j = v.length - 1; 
		
		while(i < v.length) {
			resultado[j] = v[i];
			i++;
			j--;
		}
		return resultado;
	}

}
