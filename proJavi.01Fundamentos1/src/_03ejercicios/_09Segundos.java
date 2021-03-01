package _03ejercicios;

import java.util.Scanner;

public class _09Segundos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce segundos: ");
		int segundos = tec.nextInt();
		System.out.format("%d segundos son: \n", segundos);

		int dias = segundos / 86400;
		segundos = segundos % 86400;

		int horas = segundos / 3600;
		segundos = segundos % 3600;

		int minutos = segundos / 60;
		segundos = segundos % 60;

		System.out.format("%d dias \n%d horas \n%dminutos \n%dsegundos", dias, horas, minutos, segundos);
	}

}
