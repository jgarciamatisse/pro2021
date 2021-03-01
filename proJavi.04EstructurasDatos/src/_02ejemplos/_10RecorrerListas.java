package _02ejemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class _10RecorrerListas {
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("luis");
		nombres.add("pedro");
		nombres.add("angel");
		
		//Hay tres formas de recorrer un ArrayList
		
		//1.- Por indice, como los arrays
		for(int i = 0; i < nombres.size(); i++) {
			System.out.println(nombres.get(i));
		}
		System.out.println("-------------");
		
		//2.- Usando un bucle for-each
		for(String n: nombres) {
			System.out.println(n);
		}
		int totalLetras = 0;
		for(String n: nombres) {
			totalLetras += n.length();
		}
		System.out.println("Numero total de letras: " + totalLetras);
		System.out.println("-------------");
		
		//3.- Usando un Iterator
		Iterator<String> it = nombres.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
