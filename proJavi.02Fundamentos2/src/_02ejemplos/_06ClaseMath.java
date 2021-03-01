package _02ejemplos;

public class _06ClaseMath {
	public static void main(String[] args) {
		//Longitud de un circunferencia de radio 12
		double longitud = 2 * Math.PI * 12;
		System.out.println("Longitud: " + longitud);
		
		//Raiz cuadrada de 128
		System.out.println(Math.sqrt(128));
		
		//Raiz cuadrada de -4
		System.out.println(Math.sqrt(-4));
		System.out.println(Math.sqrt(Math.abs(-4)));
		
		//Potencias
		System.out.println(Math.pow(2, 16));
		System.out.println(Math.pow(-4, 0.5));
	}

}
