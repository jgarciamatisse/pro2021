package _03ejercicios._01aula;


public class AulaMusica extends Aula{
	
	private boolean tienePiano;
	
	public AulaMusica(int codigo, double longitud, double anchura, boolean piano){
		super(codigo, longitud, anchura);
		this.tienePiano = piano;
	}

	@Override
	public String toString(){
		return super.toString() + " - " + (tienePiano ? "Con piano": "Sin piano");
	}
	
	@Override
	public int capacidad(){
		//Reescritura total
//		if(piano){
//			return (int) (superficie() / 1.4) - 2;
//		} else {
//			return (int) (superficie() / 1.4);
//		}
		//Reescritura parcial
		if(tienePiano){
			return super.capacidad() - 2;
		} else {
			return super.capacidad();
		}
	}
}
