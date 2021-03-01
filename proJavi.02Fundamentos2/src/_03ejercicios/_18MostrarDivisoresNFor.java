package _03ejercicios;

import java.util.Scanner;

public class _18MostrarDivisoresNFor {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("N: ");
		int n = tec.nextInt();
		
		for(int num = 1; num <= n; num++) {
			if(n % num == 0){
				System.out.println(num);
			}
		}
	}

}
