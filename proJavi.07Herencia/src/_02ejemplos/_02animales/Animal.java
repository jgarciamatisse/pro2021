package _02ejemplos._02animales;

public abstract class Animal {
	protected String nombre;
	public Animal (String nombre) {
		this.nombre = nombre;
	}
	public void saludar() {
		System.out.println("Hola, me llamo " + nombre );
	}
	
	//No sabemos como implementar el metodo en la clase Animal
	public abstract void pedirComida();
}
