package _03ejercicios._01gestionempleados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * Permite representar una empresa. La empresa tiene un nombre
 * y una plantilla de cero o más empleados. Entre los empleados
 * de la plantilla no habrá duplicados.
 * @author javigarcia
 */
public class Empresa {
	private String nombre;
	private ArrayList<Empleado> plantilla;
	
	/**
	 * Crea una empresa con el nombre indicado y sin 
	 * empleados
	 * @param nombre el nombre de la empresa
	 */
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.plantilla = new ArrayList<>();
	}
	
	/**
	 * Devuelve el numero de empleados de la empresa
	 * @return el numero de empleados
	 */
	public int getNumeroEmpleados() {
		return this.plantilla.size();
	}
	
	/**
	 * Devuelve el nombre de la empresa
	 * @return el nombre de la empesa
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Modifica el nombre de la empresa
	 * @param nombre nuevo nombre de la empresa
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Añade un empleado a la plantilla de la empresa, siempre y cuando 
	 * no esté ya contratado
	 * @param e el empleado a añadir
	 * @throws IllegalArgumentException si el empleado ya estaba contratado
	 */
	public void contratar (Empleado e) throws IllegalArgumentException {
		if(this.plantilla.contains(e)){
			throw new IllegalArgumentException("No se puede contratar a alguien ya contratado");
		} else {
			this.plantilla.add(e);
		}
	}
	/**
	 * Despide a un empleado, siempre y cuando estuviera contratado
	 * @param e el empleado a despedir
	 * @throws NoSuchElementException si el empleado no está contratado
	 */
	public void despedir(Empleado e) throws NoSuchElementException {
		if(this.plantilla.contains(e)) {
			this.plantilla.remove(e);
		} else {
			throw new NoSuchElementException("No se puede despedir a alguien no contratado");
		}
		
		// De otra forma
//		boolean borrado = this.plantilla.remove(e);
//		if(!borrado) throw new NoSuchElementException("No se puede despedir a alguien no contratado");
//		
		//De otra forma
//		if(!this.plantilla.remove(e)) throw new NoSuchElementException("No se puede despedir a alguien no contratado");
	}
	/**
	 * Despide a un empleado del que se conoce el dni
	 * @param dni dni del empleado a despedir
	 * @throws NoSuchElementException si el empleado no está contratado
	 */
	public void despedir (String dni) throws NoSuchElementException {
		int pos = -1;
		//Empleado x = null;
		for(int i = 0; i < this.plantilla.size() && pos == -1; i++) {
			Empleado e = this.plantilla.get(i);
			if(e.getDni().equals(dni)) {
				pos = i;
				//x = e;
			}
			
		}
		if(pos == -1) throw new NoSuchElementException("No se puede despedir a alguien no contratado");
		//if(x == null) throw new NoSuchElementException("No se puede despedir a alguien no contratado");
		else this.plantilla.remove(pos);
		
	}
	
	public void despedir2 (String dni) throws NoSuchElementException {
		Iterator<Empleado> it = this.plantilla.iterator();
		boolean enc = false;
		
		while(it.hasNext() && !enc) {
			Empleado e = it.next();
			if(e.getDni().equals(dni)) {
				enc = true;
				it.remove();
			}
		}
		if(!enc) throw new NoSuchElementException("No se puede despedir a alguien no contratado");
		
	}
	
	public void despedir3 (String dni) throws NoSuchElementException {
		Empleado e = new Empleado("",dni,0,0.0);
//		if(this.plantilla.contains(e)) {
//			this.plantilla.remove(e);
//		} else {
//			throw new NoSuchElementException("No se puede despedir a alguien no contratado");
//		}
		this.despedir(e);
	}
	
	/**
	 * Sube el sueldo a todos los empleados de la plantilla que han cumplido
	 * un trienio, es decir, a aquellos cuya entiguedad es multiplo de 3
	 * 
	 * @param porcentaje el porcentaje en el que se sube el sueldo
	 */
	public void subirTrienio(double porcentaje) {
//		for(int i = 0; i < plantilla.size(); i++) {
//			Empleado e = plantilla.get(i);
		for(Empleado e: plantilla) {
			if(e.antiguedad() % 3 == 0) {
				e.incrementarSueldo(porcentaje);
			}
		}
		
	}
	
	@Override
	public String toString() {
		String result = "Empresa: " + this.nombre +"\n========";
		for(Empleado e: this.plantilla) {
			result += "\n" + e + "\n------"; // e.toString
		}
		return result;
	}
	
	
	
	
	

}
