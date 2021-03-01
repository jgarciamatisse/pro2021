package _02ejemplos;

import java.util.ArrayList;
import java.util.Arrays;

public class _12ArrayListDesdeArray {
	public static void main(String[] args) {
		String[] nombres = { "A", "B", "C" };

		// Creamos un ArrayList a partir de los datos de un array
		ArrayList<String> nomb = new ArrayList<>(Arrays.asList(nombres));
		System.out.println(nomb);
	}
}
