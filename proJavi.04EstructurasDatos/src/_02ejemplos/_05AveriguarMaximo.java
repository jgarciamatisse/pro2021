package _02ejemplos;

public class _05AveriguarMaximo {
	public static void main(String[] args) {
		int[] edad = {10,20,13,22,44,87,1,9};
		
		//Averiguar cual es el valor mas grande del array
		
		int maximo; //Al finalizar el programa, contendrá el valor mas grande
		
		maximo = edad[0]; //Suponemos que el valor mas grande es el primero
		
		//Recorremos array a partir de la posicion 1
		for (int i = 1; i < edad.length; i++) {
			if(edad[i] > maximo) {  //Si es mas grande que el maximo, 
				maximo = edad[i];   // actualizamos el maximo
			}
		}
		
		System.out.println("Edad mas grande: " + maximo);
		
		//De otra forma
		maximo = -1; //Valor muy bajo
		//maximo = Integer.MIN_VALUE;
		for (int i = 0; i < edad.length; i++) {
			if(edad[i] > maximo) {  //Si es mas grande que el maximo, 
				maximo = edad[i];   // actualizamos el maximo
			}
		}
	}

}
