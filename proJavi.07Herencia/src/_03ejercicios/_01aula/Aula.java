package _03ejercicios._01aula;

public class Aula {
	private int codigo;
	private double longitud;
	private double anchura;
	

		
	public Aula(int codigo, double longitud, double anchura) {
		this.codigo = codigo;
		this.longitud = longitud;
		this.anchura = anchura;
	}
	public double superficie() {
		return longitud * anchura;
	}
	public int capacidad(){
		return (int) (superficie() / 1.4);
	}
	
	public String toString(){
		return this.codigo + " - Superf.: " + superficie() + 
				" - " + capacidad() + " alumnos"; 
		
	}

	
	
}
