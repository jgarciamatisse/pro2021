package _02ejemplos._02animales;

public abstract class Felino extends Animal{
	public Felino(String nombre) {
		super(nombre);
	}
	public void cortarUnyas() {
		System.out.println(this.nombre + " se corta las uñas");
	}
	
	
	

}
