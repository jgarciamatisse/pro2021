package _03ejercicios._03figuras;

import java.util.ArrayList;

public class TestFiguras {
	public static void main(String[] args) {
		
		Circulo c = new Circulo(10,10,"AZUL",20);
		Circulo c2 = new Circulo(10,10,"AZUL",20);
		System.out.println(c.equals(c2));
	}
}
