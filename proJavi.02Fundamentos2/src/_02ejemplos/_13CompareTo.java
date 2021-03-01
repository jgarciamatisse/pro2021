package _02ejemplos;

import java.util.Scanner;

public class _13CompareTo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce tres nombres: ");
		String n1 = tec.nextLine().toUpperCase();
		String n2 = tec.nextLine().toUpperCase();
		String n3 = tec.nextLine().toUpperCase();

		// Mostramos los 3 nombres ordenados alfabeticamente
		if (n1.compareTo(n2) < 0) {
			if(n1.compareTo(n3) < 0) {
				if(n2.compareTo(n3) < 0) {
					System.out.println(n1);
					System.out.println(n2);
					System.out.println(n3);
				} else {
					System.out.println(n1);
					System.out.println(n3);
					System.out.println(n2);
				}
			} else {
				System.out.println(n3);
				System.out.println(n1);
				System.out.println(n2);
			}
		} else {
			if(n2.compareTo(n3) < 0) {
				if(n1.compareTo(n3) < 0) {
					System.out.println(n2);
					System.out.println(n1);
					System.out.println(n3);
				} else {
					System.out.println(n2);
					System.out.println(n3);
					System.out.println(n1);
				}
			} else {
				System.out.println(n3);
				System.out.println(n2);
				System.out.println(n1);
			}

		}
	}

}
