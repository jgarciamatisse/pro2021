package _02ejemplos._03polimorfismo;

import java.util.ArrayList;

import _03ejercicios._03figuras.Circulo;
import _03ejercicios._03figuras.Figura;
import _03ejercicios._03figuras.Rectangulo;

public class PolimorfismoNoForzado {
	public static void main(String[] args) {
		ArrayList<Figura> misFiguras = new ArrayList<>();
		misFiguras.add(new Circulo(10,10,"rojo",20));
		misFiguras.add(new Rectangulo(10,10,"verde",20, 30));
		
		System.out.println(sumarAreas(misFiguras));
		
	}

	private static double sumarAreas(ArrayList<Figura> misFiguras) {
		double suma = 0;
		
		for(Figura f: misFiguras) {
			suma += f.area();
		}
		return suma;
	}

}
