package _03ejercicios;
import java.util.Scanner;

public class _09LeerStrings {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		//Leer una linea
		System.out.println("Nombre y apellidos: ");
		String nombreCompleto = tec.nextLine();
		
		System.out.println("Domicilio: ");
		String domicilio = tec.nextLine();
		
		System.out.println("-----------");
		System.out.println(nombreCompleto);
		System.out.println(domicilio);
		
		//Leer la primera palabra
		System.out.println("Nombre de pila: ");
		String nombre = tec.next();
		System.out.println("-----------");
		System.out.println(nombre);
		
	}

}
