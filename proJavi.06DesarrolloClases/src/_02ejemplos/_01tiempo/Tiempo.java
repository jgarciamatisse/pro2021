package _02ejemplos._01tiempo;

public class Tiempo implements Comparable <Tiempo> {
	//Atributos
	private int hora;
	private int minuto;
	private int segundo;
	
	//Constructor / constructores
	//Los constructores son los métodos a los que se llama para crear 
	//e inicializar los objetos de la clase
	/**
	 * 
	 * Crea un instante de tiempo dados una hora minuto y segundo
	 */
	public Tiempo(int hora, int minuto, int segundo) {
		//this.hora = hora;
		setHora(hora);
		//this.minuto = minuto;
		setMinuto(minuto);
		//this.segundo = segundo;
		setSegundo(segundo);
	}
	
		
	
	public String toString() {
		//return this.hora + ":" + this.minuto + ":" + this.segundo;
		return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
	}
	
	//Métodos getter 
	public int getHora() {
		return this.hora;
	}
	public int getMinuto() {
		return this.minuto;
	}
	public int getSegundo() {
		return this.segundo;
	}
	//Métodos setter
	public void setHora(int hora) {
		if(hora < 0 || hora > 23) {
			throw new IllegalArgumentException(hora + " no es un valor correcto para la hora");
		}
		this.hora = hora;
	}
	public void setMinuto(int minuto) {
		if(minuto < 0 || minuto > 59) {
			throw new IllegalArgumentException(minuto + " no es un valor correcto para el minuto");
		}
		this.minuto = minuto;
	}
	public void setSegundo(int segundo) {
		if(segundo < 0 || segundo > 59) {
			throw new IllegalArgumentException(segundo + " no es un valor correcto para el segundo");
		}
		this.segundo = segundo;
	}
	
	//Método equals
	
	public boolean equals(Object o) {
		if(this == o) return true; 
		if(o == null) return false;
		if(!(o instanceof Tiempo)) return false;
		
		
		if(this.hora == ((Tiempo)o).hora && 
		   this.minuto == ((Tiempo)o).minuto && 
		   this.segundo == ((Tiempo)o).segundo) {
			return true;
		} else {
			return false;
		}
	}
	public boolean equalsV2(Object o) {
		if(this == o) return true; 
		if(o == null) return false;
		if(!(o instanceof Tiempo)) return false;
		
		Tiempo t = (Tiempo)o;
		if(this.hora ==  t.hora && 
		   this.minuto == t.minuto && 
		   this.segundo == t.segundo) {
			return true;
		} else {
			return false;
		}
	}
	
	public int compareTo(Tiempo t) {
		if(this.hora < t.hora) return -1;
		else if(this.hora > t.hora) return 1;
		else if(this.minuto < t.minuto) return -1;
		else if(this.minuto > t.minuto) return 1;
		else if(this.segundo < t.segundo) return -1;
		else if(this.segundo > t.segundo) return 1;
		else return 0;
	}
	
	//Otra forma de conseguir lo mismo
	public int compareToV2(Tiempo t) {
		if(this.hora != t.hora) return this.hora - t.hora;
		else if(this.minuto != t.minuto) return this.minuto - t.minuto;
		else return this.segundo - t.segundo;
	}



	public static int diferencia(Tiempo salida, Tiempo llegada) {
		int segSalida = salida.hora * 3600 + salida.minuto * 60 + salida.segundo;
		int segLlegada = llegada.hora * 3600 + llegada.minuto * 60 + llegada.segundo;
		return segLlegada - segSalida;
	}
	

}






