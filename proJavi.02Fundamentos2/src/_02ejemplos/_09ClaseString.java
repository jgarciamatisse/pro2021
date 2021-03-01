package _02ejemplos;

public class _09ClaseString {
	public static void main(String[] args) {
		String nombre = new String("Javi");
		System.out.println(nombre);
		
		String apellidos = "Gomez Gomez";
		
		//La clase String tiene métodos para 
		//extraer información del String
		
		//Longitud del String
		System.out.println(nombre.length());
		System.out.println(apellidos.length());
		
		//Convertir Strin a mayusculas o minusculas
		System.out.println(nombre.toUpperCase());
		System.out.println(apellidos.toLowerCase());
		
		//El contenido del String no ha cambiado
		System.out.println(nombre);
		System.out.println(apellidos);
		
		//Si quiero que nombre esté en mayusculas:
		nombre = nombre.toUpperCase();
		System.out.println(nombre);
		
		//Extraer caracteres del String
		System.out.println(nombre.charAt(0));
		System.out.println(nombre.charAt(1));
		System.out.println(nombre.charAt(2));
		System.out.println(nombre.charAt(3));
		
		//Averiguar posicion de un caracter
		System.out.println(nombre.indexOf('A'));
		System.out.println(nombre.indexOf('X'));
		System.out.println(nombre.toUpperCase().indexOf('A'));
		
		//Averiguar la posicion de otro String
		System.out.println(nombre.indexOf("VI"));
		
		//Obtener sub strings de un String
		String tiempo = "10:25:30";
		String hora = tiempo.substring(0,2);
		String minuto = tiempo.substring(3,5);
		String segundo = tiempo.substring(6);
		System.out.println(hora);
		System.out.println(minuto);
		System.out.println(segundo);
		
		
		
	}
}



