package _03ejercicios;

import java.util.Scanner;

public class _06Containers {
	final static int MAXCONTENEDORES = 100;
	final static double MAXPESO = 700;
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double pesoTotal = 0;
		int contContenedores = 0;
		
		double peso;
		do {
			System.out.println("Peso: ");
			peso = tec.nextDouble();
			
			pesoTotal += peso;
			contContenedores ++;
		} while(contContenedores < MAXCONTENEDORES && pesoTotal < MAXPESO);
		
		if(pesoTotal > MAXPESO) {
			contContenedores--;
			pesoTotal -= peso;
		}
		
		System.out.println("Contenedores dentro: " + (contContenedores));
		System.out.println("Peso dentro: " + (pesoTotal));
		
	}

}
