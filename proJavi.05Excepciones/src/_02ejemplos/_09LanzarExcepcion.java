package _02ejemplos;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class _09LanzarExcepcion {
	public static void main(String[] args) {
		try {
			Scanner tec = new Scanner(System.in);
			System.out.println("Numero dia: ");
			int dia = tec.nextInt();
			System.out.println(nombreDiaSemana(dia));
		} catch (NoSuchElementException e) {
			System.out.println("El dia no es valido");
		}
		
	}
	public static String nombreDiaSemana(int dia) {
		String nombre ="";
		if(dia == 1) nombre = "lunes";
		else if(dia == 2) nombre = "martes";
		else if(dia == 3) nombre = "miercoles";
		else if(dia == 4) nombre = "jueves";
		else if(dia == 5) nombre = "viernes";
		else if(dia == 6) nombre = "sabado";
		else if(dia == 7) nombre = "domingo";
		else throw new NoSuchElementException("Dia de la semana incorrecto");
		return nombre;
	}
}
