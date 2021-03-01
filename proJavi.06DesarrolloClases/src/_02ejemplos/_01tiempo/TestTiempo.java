package _02ejemplos._01tiempo;

public class TestTiempo {
	public static void main(String[] args) {

		Tiempo entrada = new Tiempo(7,55,0);
		Tiempo salida = new Tiempo(7,55,0);
		
		//Como los atributos son privados, no puedo acceder a ellos
		//entrada.hora = 100;
		//entrada.setHora(10);
		
		System.out.println(entrada);
		System.out.println(salida);
		
		if(entrada.equals(salida)) {
			System.out.println("iguales");
		} else {
			System.out.println("diferentes");
		}
	
		if(entrada.toString().equals(salida.toString())) {
			System.out.println("iguales");
		} else {
			System.out.println("diferentes");
		}
			
		
		
	}

}
