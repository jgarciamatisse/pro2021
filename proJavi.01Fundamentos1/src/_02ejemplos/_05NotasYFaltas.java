package _02ejemplos;

import java.util.Scanner;

/* Escribir un programa que pida al usuario
  la nota de un examen (número con decimales)
 y el número de faltas que tiene

 El programa mostrará un mensaje del tipo
 "Tienes un 7.3 y has faltado 4 veces"
*/
public class _05NotasYFaltas {
	public static void main(String args[]) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce nota: ");
		double nota;
		nota = tec.nextDouble();
		
		System.out.println("Introduce numero de faltas");
		int faltas = tec.nextInt();
		
		System.out.println("Tienes un " + nota + 
				" y has faltado " + faltas + " veces");
		
	}

}
