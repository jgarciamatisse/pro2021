package _03ejercicios;

import java.util.Scanner;

public class _16CuentaAtrasFor {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("N: ");
		int n = tec.nextInt();
		
		for (int num = n; num >= 0; num--) {
			System.out.println(num);
		}
		
		for(int x = tec.nextInt(); x >= 0; x--) {
			System.out.println(x);
		}
		
	}

}
