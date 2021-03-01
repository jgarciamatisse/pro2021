package _03ejercicios;

import java.util.Scanner;

public class _04Minutos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Escribe número de segundos: ");
		int segundos = tec.nextInt();
		
		int minutos = segundos / 60;
		int segundosSobrantes = segundos % 60;
		
		System.out.println("En " + segundos + " segundos hay " + minutos + " minutos y " + segundosSobrantes + " segundos");
		System.out.format("En %d segundos hay %d minutos y %d segundos\n", segundos, minutos, segundosSobrantes);
		
	} 

}
