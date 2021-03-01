package _03ejercicios._01aula;

public class AulaInformatica extends Aula {
	
	private int numOrdenadores;

	public AulaInformatica(int codigo, double longitud, double anchura, int numOrdenadores){
		super(codigo,longitud,anchura);
		this.numOrdenadores = numOrdenadores;
	}
	
	@Override
	public int capacidad(){
		return 2 * numOrdenadores;
	}
	
	@Override
	public String toString(){
		return  super.toString() + " - " + numOrdenadores + " ordenadores";
	}
}
