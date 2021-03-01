package _03ejercicios;

import java.util.Scanner;

public class _05Horas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Escribe número de segundos: ");
		int segundos = tec.nextInt();
		
		int horas = segundos / 3600;
		int segundosSobrantes = segundos % 3600;
		
		System.out.println("En " + segundos + " segundos hay " + horas + " horas y " + segundosSobrantes + " segundos");
		System.out.format("En %d segundos hay %d horas y %d segundos\n", segundos, horas, segundosSobrantes);
		
	} 

}
