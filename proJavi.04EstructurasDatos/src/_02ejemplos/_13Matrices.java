package _02ejemplos;

import java.util.Arrays;

public class _13Matrices {
	public static void main(String[] args) {
		//Matriz de dos 2 x 3
		int[][] m1 = new int[2][3];
		m1[0][1] = 7;
		//System.out.println(m1);
		
		System.out.println(Arrays.toString(m1));
		System.out.println(Arrays.deepToString(m1));
		
		
		//Inicializacion
		int[][] m2 = {{1,2,3},{1,2,3,4},{1}};
		System.out.println(Arrays.deepToString(m2));
		
		//Numero de filas
		System.out.println("Numero filas: " + m2.length);
		System.out.println("Columnas de la fila 0: " + m2[0].length);
		System.out.println("Columnas de la fila 1: " + m2[1].length);
		
		
		
		
	}

}
