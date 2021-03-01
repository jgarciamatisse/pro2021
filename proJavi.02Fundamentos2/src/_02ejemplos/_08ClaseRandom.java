package _02ejemplos;

import java.util.Random;

public class _08ClaseRandom {
	public static void main(String[] args) {
		Random r = new Random(5);
		Random r2 = new Random(10);
		
		//Numero entero
		System.out.println(r.nextInt());
		//Numero entero entre [0 y 100[
		System.out.println(r.nextInt(100));
		//Dado
		System.out.println("Dado: " + (r.nextInt(6) + 1));
		//Cara o cruz
		boolean cara = r.nextBoolean();
		if(cara == true) System.out.println("cara");
		else System.out.println("cruz");
		
		
	}
}
