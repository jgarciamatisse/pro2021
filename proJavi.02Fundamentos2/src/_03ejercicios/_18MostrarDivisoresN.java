package _03ejercicios;

import java.util.Scanner;

public class _18MostrarDivisoresN {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("N: ");
		int n = tec.nextInt();
		
		int num = 1;
		while (num <= n){
			if(n % num == 0){
				System.out.println(num);
			}
			
			num++;
		}
	}

}
