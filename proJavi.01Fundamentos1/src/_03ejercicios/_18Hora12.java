package _03ejercicios;

import java.util.Scanner;

public class _18Hora12 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Hora y minutos ");
		int hora = tec.nextInt();
		int minutos = tec.nextInt();
		
		if(hora == 0) {
			System.out.println("12:"+minutos+ " AM");
		} else if(hora < 12) {
			System.out.println(hora + ":" + minutos + " AM");
		} else if (hora == 12) {
			System.out.println("12:"+minutos+ " PM");
		} else {
			System.out.println((hora - 12) + ":" + minutos + " PM");
		}

	}

}
