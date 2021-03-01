package _02ejemplos._05singleton;

public class Reloj {
	private static Reloj objeto = null;
	
	private Reloj() {
		System.out.println("Se crea reloj");
	}
	public static Reloj getInstance() {
		if(objeto == null) {
			objeto = new Reloj();
		}
		return objeto;
	}
	public int getHora() {
		//Averigua cual es la hora del sistema y la devuelve
		return 10;		
	}

}
