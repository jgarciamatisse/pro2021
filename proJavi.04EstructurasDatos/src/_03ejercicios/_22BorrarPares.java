package _03ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class _22BorrarPares {
	public static void main(String[] args) {
		
		//Creamos lista y rellenamos con numeros aleatorios
		ArrayList<Integer> lista = new ArrayList<> ();
		
		Random r = new Random();
		
		while(lista.size() < 10) {
			lista.add(r.nextInt(1000));
		}
		
		//Mostrar la lista
		System.out.println(lista);
		
//		//Eliminar los pares
//		
//		for(int i = 0; i < lista.size(); i++) {
//			int numero = lista.get(i);
//			if(numero % 2 == 0) {
//				lista.remove(i);
//				i--; //Para que siga en la misma posicion de la lista en la siguiente iteracion
//			}
//		}
//		//Mostrar la lista
//		System.out.println(lista);
		
		//Usando iterator --------------------------------
		
		Iterator<Integer> it = lista.iterator();
		while(it.hasNext()) {
			int numero = it.next();
			if(numero % 2 == 0) {
				it.remove(); //Elimina el último elemento que ha consultado
			}
			
		}
		System.out.println(lista);
		
	}

}










