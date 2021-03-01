package _02ejemplos._01tiempo;

import java.util.Arrays;

public class TestOrdenar {
	public static void main(String[] args) {
		
		//Vamos a ordenar un array de Strings. El array se ordena
		//siguiendo el criterio que marca el método compareTo de
		//la clase String: Alberto aparece antes que Ana porque 
		//"Alberto".compareTo("Ana") es menor que 0
		String[] nombres = {"Luis", "Ana", "Pedro", "David", "Alberto"};
		System.out.println(Arrays.toString(nombres));
		
		Arrays.sort(nombres); 
		System.out.println(Arrays.toString(nombres));
		
		//Ordenacion de un array de objetos Tiempo
		Tiempo[] horario = {new Tiempo(10,15,20), new Tiempo(10,2,1), new Tiempo(1,0,0)};
		System.out.println(Arrays.toString(horario));
		
		Arrays.sort(horario);
		System.out.println(Arrays.toString(horario));
		
		
	}

}
