package _02ejemplos._01tiempo;

public class TiempoV1 {
	//Atributos
	int hora;
	int minuto;
	int segundo;
	
	//Constructor / constructores
	//Los constructores son los métodos a los que se llama para crear 
	//e inicializar los objetos de la clase
	/**
	 * 
	 * Crea un instante de tiempo dados una hora minuto y segundo
	 */
	public TiempoV1(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	/**
	 * Crea un instante de tiempo a partir de una cantidad de segundos
	 * 
	 */
	public TiempoV1 (int segundos) {
		this.hora = segundos / 3600;
		this.minuto = (segundos % 3600) / 60;
		this.segundo = (segundos % 3600) % 60;
	}
	/**
	 * Crea un instante a partir de un String con formato hh:mm:ss
	 *
	 */
	public TiempoV1 (String t) {
		int posPuntos1 = t.indexOf(":");
		int posPuntos2 = t.lastIndexOf(":");
		this.hora  = Integer.parseInt(t.substring(0, posPuntos1));
		this.minuto = Integer.parseInt(t.substring(posPuntos1 + 1, posPuntos2));
		this.segundo = Integer.parseInt(t.substring(posPuntos2 + 1));
		
	}
	
	/**
	 * Crea las 0:0:0
	 */
	public TiempoV1() {
		this(0,0,0); //Llamada al constructor que recibe 3 parametros
	}
	
	
	public String toString() {
		return this.hora + ":" + this.minuto + ":" + this.segundo;
	}

}
