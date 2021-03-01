package _02ejemplos;

public class _07NumerosAleatorios {
	public static void main(String[] args) {
		//Numero aleatorio en [0,1[
		double a = Math.random();
		System.out.println(a);
		
		//Numero aleatorio en [0, 100[
		a = Math.random() * 100;
		System.out.println(a);
		
		//Numero aleatorio en [10,11[
		a = Math.random() + 10;
		System.out.println(a);
		
		//Numero aleatorio en [10,100[
		a = (Math.random() * 90) + 10;
		System.out.println(a);
		
		//Numero ENTERO entre 0 y 10
		int nota = (int) (Math.random() * 11);
		System.out.println(nota);
		
		//Lanzamiento de un dado
		int dado = (int)(Math.random() * 6 + 1);
		System.out.println(dado);
		
		//Lanzamiento de dos dados
		int dosDados = (int)(Math.random() * 6 + 1) +
				(int)(Math.random() * 6 + 1) ;
		System.out.println(dosDados);
		
		//Cara o cruz
		int caraCruz = (int) (Math.random() * 2);
		if (caraCruz == 0) System.out.println("cara");
		else System.out.println("cruz");
		
		
		
	}

}
