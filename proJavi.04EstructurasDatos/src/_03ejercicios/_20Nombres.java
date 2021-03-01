package _03ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _20Nombres {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		ArrayList<String> nombres = new ArrayList<>();
		while(nombres.size() < 10) {
			System.out.println("Nombre: ");
			String n = tec.next().toUpperCase();
			
			if(!nombres.contains(n)) {
				nombres.add(n);
			}
		}
		System.out.println(nombres);
		
		//Lo mismo con arrays
		int cont = 0;
		String[] nombres2 = new String[10];
		while(cont < 10) {
			String n = tec.next().toUpperCase();
			
			//Compruebo si el nombre esta repetido
			boolean enc = false;
			int i = 0;
			while(i < cont && !enc) {
				if(n.equals(nombres2[i])) {
					enc = true;
				}
				i++;
			}
			if(!enc) { //Es un nombre nuevo
				//Lo añado al array
				nombres2[cont] = n;
				cont ++;
			}		
		}
		System.out.println(Arrays.toString(nombres2));
	}

}
