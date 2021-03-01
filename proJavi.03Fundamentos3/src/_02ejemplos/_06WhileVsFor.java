package _02ejemplos;

public class _06WhileVsFor {
	public static void main(String[] args) {
		//Mostrar del 1 al 10 (while)
		int num1 = 1; //Inicializacion
		while (num1 <= 10) {
			System.out.print(num1 + " ");
			num1++; //Incremento
		}
		System.out.println();
		
		//Mostrar del 1 al 10 (for)
		for(int num2 = 1; num2 <= 10; num2++) {
			System.out.print(num2 + " ");
		}
		System.out.println();
		
		//Mostrar del 10 al 1 (while)
		num1 = 10;
		while (num1 >= 1) {
			System.out.print(num1 + " ");
			num1--;
		}
		System.out.println();
		
		//Mostrar del 10 al 1 (for)
		for(int num2 = 10; num2 >= 1; num2--) {
			System.out.print(num2 + " ");
		}
		System.out.println();
	}

}
