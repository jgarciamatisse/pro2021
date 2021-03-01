package _03ejercicios;

import java.util.Scanner;

public class _17SumaNPrimeros {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("N: ");
		int n = tec.nextInt();
		
		int total = 0;
		int num = 1;
		while (num <= n){
			total = total + num;
			num = num + 1;
		}
		
		System.out.println("Total: " + total);
		
	}

}
