package _02ejemplos;

public class _02CambiosTipo {
	public static void main(String[] args) {
		//Cambios de tipo implicito
		byte b = 30;
		
		//Puedo guardar short , byte en variable int
		short s = b;
		int i = s;
		i = b;
		
		//Puedo guardar un byte, short, int en variable long
		long l = b;
		l = s;
		l = i;
		
		float f = 2.45f;
		//Puedo guardar un float o un entero en un double
		double d = f;
		d = i;
		
		
		//No se puede:
		//b = i;
		//s = i;
		//i = f ;
		
	}

}
