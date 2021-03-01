package _03ejercicios;

import java.util.Scanner;

public class _17SumaNPrimerosFor {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("N: ");
		int n = tec.nextInt();
		
		int total = 0;
		for(int num = 1; num <= n; num++) {
			total = total + num;
		}
		
		System.out.println("Total: " + total);
		
	}

}
