package _02ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class _11ClaseCollections {
	public static void main(String[] args) {
		//La clase Collections es una clase de LIBRERIA	con métodos 
		//utiles para trabajar con ArrayList y otras colecciones
		
		//Creamos una lista con 10 numeros aleatorios entre 0 y 999
		Random r = new Random();
		ArrayList<Integer> numeros = new ArrayList<>();
		for(int i = 1; i<= 10; i++) numeros.add(r.nextInt(1000));
		System.out.println(numeros);
		
		//Maximo de una coleccion
		Integer maximo = Collections.max(numeros);
		System.out.println(maximo);
		//Minimo de una coleccion
		Integer minimo = Collections.min(numeros);
		System.out.println(minimo);
		
		//Ordenacion
		Collections.sort(numeros);
		System.out.println(numeros);
		
		//Rellenar una coleccion
		Collections.fill(numeros, 1);
		System.out.println(numeros);
	}
}
