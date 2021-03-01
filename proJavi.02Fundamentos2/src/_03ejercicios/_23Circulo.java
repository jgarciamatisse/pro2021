package _03ejercicios;

import java.util.Scanner;

public class _23Circulo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce radio de circunfencia: ");
		double radio = tec.nextDouble();

		// double longitud = 2 * Math.PI * radio;
		double longitud = longitudCircunferencia(radio);
		double area = areaCirculo(radio);
		double vol = volumenEsfera(radio);

		System.out.println("Longitud: " + longitud);	
		System.out.println("Area: " + area);	
		System.out.println("Volumen: " + vol);	
		//Se puede hacer también "al vuelo"
		System.out.println("Volumen: " + volumenEsfera(radio));
	}

	// Metodo que calcula y devuelve la longitud de una circunferencia
	// de radio r
	public static double longitudCircunferencia(double radio) {
		double l = 2 * Math.PI * radio;
		return l;
	}

	// Metodo que calcula y devuelve el area de un circulo
	// de radio r
	public static double areaCirculo(double radio) {
		double a =  Math.PI * radio * radio;
		return a;
	}

	// Metodo que calcula y devuelve el volumen de una esfera
	// de radio r
	public static double volumenEsfera(double radio) {
//		double v = 4/3.0 * Math.PI * Math.pow(radio, 3);
//		return v;
		return 4/3.0 * Math.PI * Math.pow(radio, 3);
		
	}

}
