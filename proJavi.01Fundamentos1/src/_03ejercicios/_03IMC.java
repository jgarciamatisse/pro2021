package _03ejercicios;

import java.util.Scanner;

public class _03IMC {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Peso: ");
		double peso = tec.nextDouble();
		System.out.println("Estatura: ");
		double estatura = tec.nextDouble();
		
		double imc = peso / (estatura * estatura);
		//imc = peso * Math.pow(estatura,2);
		
		System.out.println("IMC: " + imc);
		
		
	}

}
