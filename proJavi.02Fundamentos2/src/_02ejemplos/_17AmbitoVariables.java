package _02ejemplos;

import java.util.Scanner;

public class _17AmbitoVariables {
	public static void main(String[] args) {
		//La variable tieneCarnet es local al bloque de
		//codigo de la sentencia if. La variable no existe
		//fuera de ese bloque de código.
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		
		if(edad >= 18) {
			System.out.println("Tienes carnet de conducir (Si/No)?: ");
			String tieneCarnet = tec.next();
			
			if(tieneCarnet.toUpperCase().equals("SI")) {
				System.out.println("Mayor con carnet");
			} else {
				System.out.println("Mayor sin carnet");
			}
		} else {
			System.out.println("Menor");
		}
		//La variable tieneCarnet es inaccesible aqui:
		//System.out.println(tieneCarnet);
	}

}
