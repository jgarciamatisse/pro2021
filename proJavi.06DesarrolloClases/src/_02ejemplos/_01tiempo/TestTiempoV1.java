package _02ejemplos._01tiempo;

public class TestTiempoV1 {
	public static void main(String[] args) {
//		TiempoV1 entrada = new TiempoV1();
//		entrada.hora = 7;
//		entrada.minuto = 55;
//		entrada.segundo = 0;
		TiempoV1 entrada = new TiempoV1(7,55,0);
//		
//		TiempoV1 salida = new TiempoV1();
//		salida.hora = 14;
//		salida.minuto = 55;
//		salida.segundo = 0;
		TiempoV1 salida = new TiempoV1(14,55,0);
		
		
		
		//El método toString es un método al que Java llama
		//implicitamente cuando usamos un objeto en un contexto
		//en el que se requiere un String
		System.out.println(entrada);
		System.out.println(entrada.toString());
		
		
		
		System.out.println("Se sale a las " + salida.toString());
		System.out.println("Se sale a las " + salida);
		
		
		//Usamos el segundo constructor
		TiempoV1 t = new TiempoV1(3663);
		System.out.println(t);
	}

}
