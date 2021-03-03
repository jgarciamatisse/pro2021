package _02ejemplos._04Interfaces;

public class Puerta implements Abrible {
	private boolean abierta;
	
	public Puerta() {
		abierta = true;
	}

	@Override
	public void abrir() {
		abierta = true;
		
	}

	@Override
	public void cerrar() {
		abierta = false;
		
	}
}
