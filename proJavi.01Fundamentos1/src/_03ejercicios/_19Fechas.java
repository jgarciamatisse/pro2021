package _03ejercicios;

import java.util.Scanner;

public class _19Fechas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Fecha 1 ( dd mm aaaa): ");
		int d1 = tec.nextInt();
		int m1 = tec.nextInt();
		int a1 = tec.nextInt();
		
		System.out.println("Fecha 2 ( dd mm aaaa): ");
		int d2 = tec.nextInt();
		int m2 = tec.nextInt();
		int a2 = tec.nextInt();
		
		if(a1 < a2) {
			//System.out.format("%d/%d/%d\n",d1,m1,a1);
			//System.out.format("%2d/%2d/%4d\n",d1,m1,a1);
			System.out.format("%02d/%02d/%04d\n",d1,m1,a1);
			
		} else if (a2 < a1) {
			System.out.format("%02d/%02d/%04d\n",d2,m2,a2);
		} else if(m1 < m2) {
			System.out.format("%02d/%02d/%04d\n",d1,m1,a1);
		} else if (m2 < m1) {
			System.out.format("%02d/%02d/%04d\n",d2,m2,a2);
		} else if(d1 < d2) {
			System.out.format("%02d/%02d/%04d\n",d1,m1,a1);
		} else if (d2 < d1) {
			System.out.format("%02d/%02d/%04d\n",d2,m2,a2);
		} else {
			System.out.println("Fechas identicas");
		}
		
		

	}

}
