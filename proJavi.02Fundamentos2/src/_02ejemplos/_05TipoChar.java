package _02ejemplos;

public class _05TipoChar {
	public static void main(String[] args) {
		//El tipo char permite almacenar caracteres sueltos
		
		char inicial = 'J';
		System.out.println(inicial);
		
		//A cada caracter le corresponde un número (su
		//codigo UNICODE)
		int codigo = (int) inicial;
		System.out.println(codigo);
		
		//También es posible hacer la operación inversa
		int numero = 58;
		char caracter = (char) numero;
		System.out.println(caracter);
		
		//Se pueden hacer comparaciones de caracteres
		if('a' < 'b') {
			System.out.println("El codigo de 'a' "
					+ "es menor que el de 'b'");
		}
		
		//Se pueden hacer operaciones aritmeticas con caracteres
		System.out.println('a' + 1);
		System.out.println('a'+'b');
		
		//Qué caracter hay a continuación del '€'?
		System.out.println((char)('€'+1));
		
		//Cuantos caracteres hay entre la 'A' y la 'Z'?
		System.out.println('Z'-'A'+1);
		
		//Secuencias de escape
		System.out.println("1\t2\t3\t4\n5\t6\t7\t8");
		System.out.println("El dijo \"hola\"");
		System.out.println("Ruta: c:\\documentos\\cartas");
		
		
	}

}



