package _02ejemplos._02animales;

public class Perro extends Canino implements Mascota {
	public Perro(String nombre) {
		super(nombre);
	}

	
	public void pedirComida() {
		System.out.println("Quiero un hueso");

	}


	@Override
	public void llevarAPelu() {
		System.out.println(nombre + " va a la peluqueria de perros");
		
	}

}
