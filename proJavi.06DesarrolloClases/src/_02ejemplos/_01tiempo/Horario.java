package _02ejemplos._01tiempo;

import java.util.ArrayList;
import java.util.Collections;

public class Horario {
	private String nombre;
	private ArrayList<Tiempo> sesiones;
	
	//Constructores
	/**
	 * Crea un horario sin sesiones
	 * @param nombre el nombre del horario
	 */
	public Horario(String nombre) {
		this.nombre = nombre;
		this.sesiones = new ArrayList<>();
	}
	
	//Getter y setter
	public String getNombre() {
		return nombre;
		
	}
	public ArrayList<Tiempo> getSesiones(){
		return this.sesiones;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setSesiones(ArrayList<Tiempo> sesiones) {
		this.sesiones = sesiones;
	}
	
	@Override
	public String toString() {
		String result = "Horario: " + nombre;
		int num = 1;
		for(Tiempo t: sesiones) {
			result += "\n" + num  + ".- " + t.toString();
			num++;
		}
		return result;
	}
	
	public void anyadirSesion (Tiempo t) {
		this.sesiones.add(t);
		Collections.sort(this.sesiones);
	}
	
	public int numSesiones() {
		return this.sesiones.size();
	}
	
	public void eliminarSesion(Tiempo t) {
		this.sesiones.remove(t);
	}
	
	public void eliminarSesion(int numSesion) {
		this.sesiones.remove(numSesion-1);
	}

}
