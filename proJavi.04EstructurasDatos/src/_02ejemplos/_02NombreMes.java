package _02ejemplos;

import java.util.Scanner;

public class _02NombreMes {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Numero de mes: ");
		int numMes = tec.nextInt();
		
		System.out.println("Nombre del mes: " + nombreMes(numMes));
	}

	private static String nombreMes(int numMes) {
		String[] nombre = {"","ene","feb","mar","abr","may","jun","jul",
				"ago","sep","oct","nov","dic"};
		
		return nombre[numMes];
	}
	
	private static String nombreMes2(int numMes) {
		String[] nombre = {"ene","feb","mar","abr","may","jun","jul",
				"ago","sep","oct","nov","dic"};
		
		return nombre[numMes-1];
	}

}
