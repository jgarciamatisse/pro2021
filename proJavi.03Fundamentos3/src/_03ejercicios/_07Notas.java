package _03ejercicios;

import java.util.Scanner;

public class _07Notas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int nota;
		int contNotas = 0;
		int contAprobados = 0;
		int sumaNotas = 0;
		
		do {
		
			System.out.println("Introduce nota: ");
			nota = tec.nextInt();
			if(nota >= 0) {
				contNotas++;
				if(nota >= 5) contAprobados++;
				sumaNotas += nota; //sumaNotas = sumaNotas + nota;
			}
		
		} while (nota >= 0);
		
		System.out.println("Numero de notas: " + contNotas);
		System.out.println("Numero de aprobados: " + contAprobados);
		System.out.println("Nota media: " + ((double)sumaNotas / contNotas));
	}

}
