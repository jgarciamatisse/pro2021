package _02ejemplos;

public class _01Tipos {
	public static void main(String[] args) {
		//Hay 6 tipos numéricos
		byte b;
		short s;
		int i;
		long l;
		
		float f;
		double d;
		
		
		//Literales enteros
		b = 2; //Conversión implicita de int a byte
		//b = 130; //No puede hacer la conversión a byte
		
		s = 2; //Conversión implícita de int a short
		i = 2;
		l = 2; //Conversión implícita de int a long
		
		//Literal entero largo
		//l = 65465879797987; El literal no es un int valido
		l = 65465879797987L;
		
		//Literales reales
		d = 2.54;
		//f = 2.54;
		f = 2.54F;
		
		//Literales "raros" de tipo double
		
		System.out.println(27/0.0); //Infinito
		System.out.println(-27/0.0); //-Infinito
		System.out.println(0.0/0.0); //NaN
	}
}







