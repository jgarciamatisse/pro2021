package _03ejercicios;

import java.util.Scanner;

public class _19SumarDivisoresN {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		
		System.out.println("N: ");
		int n = tec.nextInt();
		
		int num = 1;
		int suma = 0;
		while (num <= n){
			if(n % num == 0){
				suma += num;
			}
			
			num++;
		}
		System.out.println(suma);
	}

}
