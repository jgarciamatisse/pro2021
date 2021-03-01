package _03ejercicios;

import java.util.Scanner;

public class _13Taxi {
	public static void main(String[] args) {
		final double TARIFA_DIA = 0.73;
		final double TARIFA_NOCHE = 0.84;
		final double TARIFA_DOMINGO = 0.93;
		final double MINIMO_DIA = 2.95;
		final double MINIMO_NOCHE = 4;
		
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Indica DIA o NOCHE");
		String dianoche = tec.next().toUpperCase();
		
		System.out.println("Indica dia de la semana (1 - 7):");
		int dia = tec.nextInt();
		
		System.out.println("Quilometros: ");
		double km = tec.nextDouble();
		
		double precioTrayecto;
		if (dia == 7) {
			precioTrayecto = km * TARIFA_DOMINGO;
		}else {
			if(dianoche.equals("DIA")) {
				precioTrayecto = km * TARIFA_DIA;
			} else {
				precioTrayecto = km * TARIFA_NOCHE;
			}
		}
		
		//precio mínimo
		if(dianoche.equals("DIA")) {
			//if(precioTrayecto < MINIMO_DIA) precioTrayecto = MINIMO_DIA;
			precioTrayecto = Math.max(precioTrayecto, MINIMO_DIA);
		} else {
			//if(precioTrayecto < MINIMO_NOCHE) precioTrayecto = MINIMO_NOCHE;
			precioTrayecto = Math.max(precioTrayecto, MINIMO_NOCHE);
		}
		
		
		System.out.println("Precio del trayecto: " + precioTrayecto);
	}

}
