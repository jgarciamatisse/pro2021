package _02ejemplos;

import java.util.Scanner;

public class _18AmbitoVariables {
	//Las variables GLOBALES se declaran dentro de la clase,
	//pero fuera de todos los métodos
	//ESTO ES UN EJEMPLO DE LO QUE NO HAY QUE HACER: Se está 
	//usando la variable radio para que el método main y el
	// método longitudCircunferencia intercambien información.
	//La forma correcta de que dos métodos intercambien información
	//es a través de los parámetros y de la sentencia return
	static double radio;
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce radio: ");
		radio = tec.nextDouble();
		double longitud = longitudCircunferencia();
		System.out.println("Longitud: " + longitud);
	}
	public static double longitudCircunferencia() {
		return 2 * Math.PI * radio;
	}

}
