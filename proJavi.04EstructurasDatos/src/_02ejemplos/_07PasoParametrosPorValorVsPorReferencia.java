package _02ejemplos;

import java.util.Arrays;

public class _07PasoParametrosPorValorVsPorReferencia {
	public static void main(String[] args) {
		
		//Paso de parámetros por valor:
		// - Se produce cuando pasamos parametros de tipo PRIMITIVO (byte, short, ....)
		// - Los cambios que el método hace en el parametro recibido NO AFECTAN
		//   al parametro con el que se hace la llamada
		int numero = 10;
		System.out.println("Numero antes de llamar al metodo: " + numero);
		incrementar(numero);
		System.out.println("Numero despues de llamar al metodo: " + numero);
		
		//Paso de parámetros por referencia
		// - Se produce cuando pasamos parametros de tipo NO PRIMITIVO
		// - Los cambios que el método hace en el parametro recibido SI AFECTAN
		//   al parametro con el que se hace la llamada 
		int[] edad = {10,20,30};
		System.out.println("Array antes de llamar al método: " + Arrays.toString(edad));
		incrementar(edad);
		System.out.println("Array despues de llamar al método: " + Arrays.toString(edad));
		
 	}
	public static void incrementar(int num) {
		num ++;
	}
	
	public static void incrementar(int[] v) {
		for (int i = 0; i < v.length; i++) {
			v[i]++;
		}
	}
}
