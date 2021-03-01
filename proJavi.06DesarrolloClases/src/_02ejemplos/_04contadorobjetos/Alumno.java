
package _02ejemplos._04contadorobjetos;

public class Alumno {
	private int nia;
	private String nombre;
	
	//Se puede usar un atributo static para saber cuantos
	//objetos de la clase se han creado. Por ejemplo para 
	//impedir que se creen más de x objetos
	final static int MAXALUMNOS = 5;
	private static int contAlumnos = 0;
	
	
	
	public Alumno(int nia, String nombre) {
		if(contAlumnos < MAXALUMNOS) {
			this.nia = nia;
			this.nombre = nombre;
			contAlumnos++;
		} else {
			throw new UnsupportedOperationException("Se ha alcanzado el máximo de alumnos");
		}
	}
	
	public int getNia() {
		return nia;
	}
	
	public void setNia(int nia) {
		this.nia = nia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "Alumno [nia=" + nia + ", nombre=" + nombre  + "]";
	}
}
