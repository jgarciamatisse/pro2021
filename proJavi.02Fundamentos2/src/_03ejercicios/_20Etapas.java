package _03ejercicios;

import java.util.Scanner;

public class _20Etapas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Cuantas edades vas a introducir: ");
		int edades = tec.nextInt();
		
		int cont = 0;
		int inf = 0, pub = 0, ado = 0, adul = 0, vej = 0, anc = 0;
		while (cont < edades) {
			System.out.println("Edad " + (cont + 1));
			int edad = tec.nextInt();
			
			if(edad <= 10 ) {
				inf ++;
			} else if(edad <= 14 ) {
				pub ++;
			} else if(edad <= 21 ) {
				ado ++;
			} else if(edad <= 55 ) {
				adul ++;
			} else if(edad <= 70 ) {
				vej ++;
			} else {
				anc ++;
			} 
			
			
			cont ++;
		}
		
		//Mostrar porcentajes
		System.out.format("%-15s: %6.2f %% %n","Infancia",(100.0 * inf /edades));
		System.out.format("%-15s: %6.2f %% %n","Pubertad",(100.0 * pub /edades));
		System.out.format("%-15s: %6.2f %% %n","Adolescencia",(100.0 * ado /edades));
		System.out.format("%-15s: %6.2f %% %n","Adultez",(100.0 * adul /edades));
		System.out.format("%-15s: %6.2f %% %n","Vejez",(100.0 * vej /edades));
		System.out.format("%-15s: %6.2f %% %n","Ancianidad",(100.0 * anc /edades));
	}

}





