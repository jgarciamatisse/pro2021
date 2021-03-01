
package _02ejemplos._03atributosestaticos;

public class Alumno {
	private int nia;
	private String nombre;
	private static String tutor;
	
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
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		Alumno.tutor = tutor;
	}
	@Override
	public String toString() {
		return "Alumno [nia=" + nia + ", nombre=" + nombre + ", tutor=" + tutor + "]";
	}
}
