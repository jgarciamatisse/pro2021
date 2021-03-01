package _03ejercicios;

import java.util.Scanner;

public class _24ReplicarCaracteres {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce caracter ");
		char letra = tec.next().charAt(0);
		System.out.println("Veces: ");
		int veces = tec.nextInt();
		
				
		//Al vuelo
		System.out.println(replicar(letra,veces));
		
		//Guardando en una variable el resultado de llamar al método
		String texto = replicar(letra,veces);
		System.out.println(texto);
		
		
		
	}
	public static String replicar(char letra, int veces) {
		String resultado = "";
		int cont = 0;
		while(cont < veces) {
			resultado = resultado + letra;
			cont ++;
		}
		return resultado;
		
	}

}
