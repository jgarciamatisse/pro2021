package _02ejemplos;

import java.util.Scanner;

public class _08Primos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce numero: ");
		int num = tec.nextInt();

		long t1, t2;

		int cont = 0;
		System.out.println("Numeros primos hasta el " + num);
		t1 = System.currentTimeMillis();
		for (int i = 1; i <= num; i++) {
			if (esPrimo1(i))
				cont++;
		}
		t2 = System.currentTimeMillis();
		System.out.println(cont + " - " + (t2 - t1));
		
		cont = 0;
		t1 = System.currentTimeMillis();
		for (int i = 1; i <= num; i++) {
			if (esPrimo2(i))
				cont++;
		}
		t2 = System.currentTimeMillis();
		System.out.println(cont + " - " + (t2 - t1));
		
		cont = 0;
		t1 = System.currentTimeMillis();
		for (int i = 1; i <= num; i++) {
			if (esPrimo3(i))
				cont++;
		}
		t2 = System.currentTimeMillis();
		System.out.println(cont + " - " + (t2 - t1));
		
		cont = 0;
		t1 = System.currentTimeMillis();
		for (int i = 1; i <= num; i++) {
			if (esPrimo4(i))
				cont++;
		}
		t2 = System.currentTimeMillis();
		System.out.println(cont + " - " + (t2 - t1));

	}

	public static boolean esPrimo1(int n) {
		// Los numeros primos tienen uno o dos divisores
		// Sol: Contar cuantos divisores tiene n

		int cont = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				cont++;
		}
		if (cont <= 2)
			return true;
		else
			return false;
	}

	public static boolean esPrimo2(int n) {
		// Los numeros primos no tienen divisores distintos de el mismo y el 1
		// Sol: Buscar si tiene algun divisor en [2 .. n-1]
		boolean enc = false;
		int i = 2;
		while(i < n && !enc) {
			if(n % i == 0) enc = true;
			else i++;
		}
		return !enc;
		
	}
	public static boolean esPrimo3(int n) {
		// Los numeros primos no tienen divisores distintos de el mismo y el 1
		// Sol: Buscar si tiene algun divisor en [2 .. n-1]
		boolean enc = false;
		int i = 2;
		while(i <= n/2 && !enc) {
			if(n % i == 0) enc = true;
			else i++;
		}
		return !enc;
		
	}
	
	public static boolean esPrimo4(int n) {
		if(n == 1 || n == 2) return true; //El 1 y 2 son primos
		else if(n % 2 == 0) return false; //Los demas pares no son primos
		else {
			int raiz = (int) (Math.ceil(Math.sqrt(n)));
			boolean enc = false;
			
			int i = 3; //Empiezo por el 3
			while(i <= raiz && !enc) {
				if(n % i == 0) enc = true;
				else i += 2; //Intento dividir por impares
			}
			return !enc;
			
		}
		
	}

}
