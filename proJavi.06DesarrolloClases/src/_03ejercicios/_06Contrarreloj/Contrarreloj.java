package _03ejercicios._06Contrarreloj;

import java.util.NoSuchElementException;
import java.util.Scanner;

import _02ejemplos._01tiempo.Tiempo;

public class Contrarreloj {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
		ListaCorredores hanSalido = new ListaCorredores();
		ListaCorredores hanLlegado = new ListaCorredores();
		
		int opcion;
		do {
			opcion = menu();
			switch(opcion) {
			case 1: //Registrar salida
				System.out.println("Nombre del corredor: ");
				String nombre = tec.next();
				
				Tiempo tSalida = leerTiempo("Hora de salida ");
				
				int dorsal = Corredor.generarDorsal();
				
				Corredor c = new Corredor(dorsal, nombre, tSalida);
				try {
					hanSalido.anyadir(c);
				} catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2: //Registrar llegada
				System.out.println("Dorsal: ");
				dorsal = tec.nextInt();
				
				try {
					c = hanSalido.quitar(dorsal);
					Tiempo tLlegada = leerTiempo("Hora de llegada ");
					c.setLlegada(tLlegada);
					hanLlegado.insertarOrdenado(c);
				} catch (NoSuchElementException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 3: 
				System.out.println("CLASIFICACIÓN");
				System.out.println("=============");
				System.out.println(hanLlegado);
				break;
			case 4: 
				System.out.println("Fin del programa");;
			}
			
		} while (opcion != 4); 
		
	}
	private static Tiempo leerTiempo(String texto) {
		System.out.println(texto + "(hora minuto segundo): ");
		int h = tec.nextInt();
		int m = tec.nextInt();
		int s = tec.nextInt();
		
		return new Tiempo(h,m,s);
	}
	public static int menu () {
		int opcion;
		do {
			System.out.println("1.- Salida");
			System.out.println("2.- Llegada");
			System.out.println("3.- Clasificación");
			System.out.println("4.- Salir");
			System.out.println("-----------");
			System.out.println("Seleccione una opcion: ");
			opcion = tec.nextInt();
			
		} while (opcion < 1 || opcion > 4);
		return opcion;
	}

}
