package _03ejercicios;

import java.util.Scanner;

public class _02Bisiesto {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int anyo = 1865;
		while (anyo < 2025) {
			System.out.println(anyo + ": " + esBisiesto(anyo));
			anyo ++;
		}
		
	}
	public static boolean esBisiesto (int anyo) {
		boolean resultado;
		if(anyo % 400 == 0) {
			resultado = true;
		} else if(anyo % 100 == 0) {
			resultado = false;
		} else if (anyo % 4 == 0) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}
	public static boolean esBisiesto2 (int anyo) {
		return anyo % 400 == 0 || anyo % 4 == 0 && anyo % 100 != 0;
	}
	
}
	
