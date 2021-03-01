package _03ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class _21Tocayos {
	public static void main(String[] args) {
		String[] grupo1 = {"miguel","josé","ana","maría"};
		String[] grupo2 = {"ana", "josé", "luján", "juan", "josé", "pepa", "ángela", "sofía", "andrés", "bartolo"};
		
		ArrayList<String> l1 = new ArrayList<> (Arrays.asList(grupo1));
		ArrayList<String> l2 = new ArrayList<> (Arrays.asList(grupo2));
		
		for(String nombre1: l1) {
			if(l2.contains(nombre1)) {
				System.out.println(nombre1 + " tiene un tocayo en el segundo grupo");
			}
		}
		
	}

}
