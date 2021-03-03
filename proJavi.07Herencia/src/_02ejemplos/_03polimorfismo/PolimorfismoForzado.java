package _02ejemplos._03polimorfismo;

import _03ejercicios._03figuras.Circulo;
import _03ejercicios._03figuras.Figura;
import _03ejercicios._03figuras.Rectangulo;

public class PolimorfismoForzado {
	public static void main(String[] args) {
		
		Figura f1 = new Circulo(10,10,"ROJO",20);
		
		System.out.println(f1.getColor());
		
		//La siguiente instrucción no compila porque
		// el tipo estático de f1 es Figura y Figura 
		// no tiene definido el método getRadio()
		//System.out.println(f1.getRadio());
		
		//Haciendo un casting puedo cambiar el tipo estático
		System.out.println(((Circulo)f1).getRadio());
		
		//Como el tipo dinamico es Circulo, se ejecutará el metodo
		//toString de Circulo
		System.out.println(f1.toString());
		
		
		//Y si hago este casting ....
		System.out.println(((Rectangulo)f1).getAlto());
		
		
	}
}
