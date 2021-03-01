package _03ejercicios;

import java.util.Scanner;

public class _19SumarDivisoresNFor {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("N: ");
		int n = tec.nextInt();
		int suma = 0;
		for(int num = 1; num <= n; num++) {
			if(n % num == 0){
				suma += num;
				//suma = suma + num;
			}
		}
		System.out.println(suma);
	}

}
