package _02ejemplos;

public class _07ForRaros {
	public static void main(String[] args) {
		// En las partes de inicializacion
		// y avance puede haber más de una
		// instruccion separadas por comas

		// Sumar los numeros del 1 al 10
		int num = 1;
		int suma = 0;
		while (num <= 10) {
			suma = suma + num;
			num++;
		}
		System.out.println("Suma: " + suma);

		// Version NO ADECUADA con FOR
		for (num = 1, suma = 0; num <= 10; num++) {
			suma = suma + num;
		}
		System.out.println("Suma: " + suma);

		// Version NO ADECUADA con FOR
		for (num = 1, suma = 0; num <= 10; suma = suma + num, num++) {
			
		}
		System.out.println("Suma: " + suma);
		
		//Version ADECUADA con FOR
		suma = 0;
		for(num = 1; num <= 10; num++) {
			suma += num;
		}
		System.out.println("Suma: " + suma);
		
		//Es posible omitir la parte de inicializacion o 
		//la parte de avance (o ambas)
		//EVITAR CONSTRUIR ESTE TIPO DE FOR'S
		
		num = 1;
		suma = 0;
		for (;num <= 10;) {
			suma = suma + num;
			num++;
		}
		System.out.println("Suma: " + suma);

	}
}







