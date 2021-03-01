package _02ejemplos;

import java.util.Scanner;

public class _16ParImpar {
	public static void main(String[] args) {
		//Pedir 10 numeros al usuario y con cada numero
		//decirle si el numero es PAR o IMPAR
		Scanner tec = new Scanner(System.in);
		int cont = 0;
		while(cont < 10) {
			System.out.println("Introduce numero " + (cont + 1) +": ");
			int num = tec.nextInt();
			if(num % 2 == 0) System.out.println("PAR");
			else System.out.println("IMPAR");
			
			cont = cont + 1; //cont ++;
		}
	}

}
