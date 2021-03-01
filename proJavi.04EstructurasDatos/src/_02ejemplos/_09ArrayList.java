package _02ejemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class _09ArrayList {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		ArrayList<String> nombres = new ArrayList<>();
		
		//Leemos nombres hasta que el usuario introduzca la cadena vacía
		String nombre;
		do {
			
			System.out.println("Nombre: ");
			nombre = tec.nextLine();
			
			//Añadimos el nombre al final del arrayList
			nombres.add(nombre.toUpperCase());
			System.out.println(nombres);
			
		//} while(!nombre.equals(""));
		//} while(nombre.length() != 0);
	    } while(!nombre.isEmpty());
		
		//Comprobar si "carlos" está entre los nombres
		if(nombres.contains("CARLOS")) {
			System.out.println("CARLOS esta en la lista");
		} else {
			System.out.println("CARLOS no esta en la lista");
		}
		
		//En qué posición está "monica"?
		int pos = nombres.indexOf("MONICA");
		if(pos == -1) {
			System.out.println("MONICA no está");
		} else {
			System.out.println("MONICA está en la posición " + pos);
		}

		//Eliminar por posicion
		System.out.println("Que posicion quieres borrar");
		pos = tec.nextInt(); tec.nextLine();
		String eliminado = nombres.remove(pos);
		System.out.println("Se ha eliminado a " + eliminado);
		
		//Eliminar por contenido
		System.out.println("A quién quieres eliminar?");
		nombre = tec.nextLine();
		boolean conseguido = nombres.remove(nombre.toUpperCase());
		if(conseguido) System.out.println("Se ha eliminado a " + nombre);
		else System.out.println("NO se ha eliminado a " + nombre);
	}	
}




