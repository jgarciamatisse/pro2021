package _02ejemplos;

import java.util.Scanner;

public class _06Salario {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Horas trabajadas: ");
		int horas = tec.nextInt();
		
		System.out.println("Precio por hora");
		double precio = tec.nextDouble();
		
		double salario = horas * precio;
		System.out.println("Tu salario es de " + salario);
		
		//También se puede hacer la operación "al vuelo"
		System.out.println("Tu salario es de " + (horas * precio));
		
	}
}




