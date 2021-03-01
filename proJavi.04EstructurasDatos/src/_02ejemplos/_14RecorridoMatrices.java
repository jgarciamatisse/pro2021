package _02ejemplos;

public class _14RecorridoMatrices {
	public static void main(String[] args) {
		// Cada fila corresponde a un vendedor
		// Cada columna corresponde a un articulo
		// El elemento ventas[0][0] indicaria cuanto ha vendido el primer
		// vendedor del primer articulo
		int[][] ventas = { { 10, 12, 4 }, { 7, 21, 12 } };

		// Recorrido por filas (por vendedor)

		for (int i = 0; i < ventas.length; i++) {
			System.out.println("Ventas del vendedor " + i + ": ");

			// Mostramos las ventas del vendedor i
			for (int j = 0; j < ventas[i].length; j++) {
				System.out.println("  - Articulo " + j + ": " + ventas[i][j] + " uds.");
			}
		}

		// Recorrido por columnas (por articulo)
		System.out.println("-----------------------------");
		for (int j = 0; j < ventas[0].length; j++) {
			System.out.println("Ventas del articulo " + j + ": ");
			for (int i = 0; i < ventas.length; i++) {
				System.out.println("  - Vendedor " + i + ": " + ventas[i][j] + " uds.");
			}

		}

		// Cuanto ha vendido cada vendedor
		System.out.println("-----------------------------");
		for (int i = 0; i < ventas.length; i++) {
			int total = 0;

			// Mostramos las ventas del vendedor i
			for (int j = 0; j < ventas[i].length; j++) {
				total = total + ventas[i][j];
			}
			System.out.println("Total vendedor " + i + ": " + total);
		}

		// Cuanto ha vendido cada articulo
		System.out.println("-----------------------------");
		for (int j = 0; j < ventas[0].length; j++) {
			int total = 0;

			// Mostramos las ventas del articulo i
			for (int i = 0; i < ventas.length; i++) {
				total = total + ventas[i][j];
			}
			System.out.println("Total articulo " + j + ": " + total);
		}
	}

}
