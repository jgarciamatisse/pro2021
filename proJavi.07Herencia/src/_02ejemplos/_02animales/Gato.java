package _02ejemplos._02animales;

public class Gato extends Felino implements Mascota {
	public Gato(String nombre) {
		super(nombre);
	}

	
	public void pedirComida() {
		System.out.println("Quiero pescado");

	}


	@Override
	public void llevarAPelu() {
		System.out.println(nombre + " va a la peluqueria de gatos");
		
	}

}
