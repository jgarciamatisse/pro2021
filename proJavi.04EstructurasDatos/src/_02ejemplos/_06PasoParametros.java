package _02ejemplos;

public class _06PasoParametros {
	public static void main(String[] args) {
		int[] edad = {20, 3, 18, 50};
		
		int edadMaxima = maximo(edad);
		System.out.println("Edad maxima: " + edadMaxima);
	}

	/**
	 * Devuelve el valor mas grande de un array
	 * @param v el array que contiene los valores
	 * @return el valor mas grande
	 */
	public static int maximo (int[] v) {
		int max = v[0];
		for (int i = 1; i < v.length; i++) {
			if(v[i] > max) {
				max = v[i];
			}
		}
		return max;
	}
}
