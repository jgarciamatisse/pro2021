package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _07ExcepcionesComprobadas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce nombre del fichero: ");
		String nomFich = tec.nextLine();
		
		//Leer los enteros que hay en el fichero y calcular 
		//cuánto suman
		Scanner f = null;
		
		try {
			f = new Scanner(new File(nomFich));
			System.out.println("Se ha abierto el fichero");
			
			//El fichero se ha abierto correctamente
			int suma = 0;
			while(f.hasNext())  {
				int edad = f.nextInt();
				suma += edad;
			}
			
			System.out.println("Suma de las edades: " + suma);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero indicado no existe o no se puede abrir");
			//e.printStackTrace();
		} finally {
			if(f != null) { //Si se ha conseguido abrir el fichero, lo cerramos
				f.close();
				System.out.println("Se ha cerrado el fichero");
			}
		}
		
	}

}
	
	
	
	
	
