package _03ejercicios._06Contrarreloj;

import _02ejemplos._01tiempo.Tiempo;

public class Corredor {
	private int dorsal;
	private String nombre;
	private Tiempo salida;
	private Tiempo llegada;
	private static int siguienteDorsal = 1;
	
	public Corredor(int d, String n, Tiempo salida) {
		this.dorsal = d;
		this.nombre = n;
		this.salida = salida;
	}

	public int getDorsal() {
		return dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public Tiempo getSalida() {
		return salida;
	}

	public Tiempo getLlegada() {
		return llegada;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSalida(Tiempo salida) {
		this.salida = salida;
	}

	public void setLlegada(Tiempo llegada) {
		if(llegada.compareTo(salida) < 0) {
			throw new IllegalArgumentException("La llegada tiene que ser posterior a la salida");
		}
		this.llegada = llegada;
	}
	public int getDuracion() {
		if (llegada == null) {
			throw new UnsupportedOperationException("El corredor no ha llegado a meta");
		}
		return Tiempo.diferencia(salida,llegada);
	}
	
	public String toString() {
		if(llegada == null) {
			return String.format("(%d) - %s - Salida: %s", dorsal, nombre, salida);
		} else {
			return String.format("(%d) - %s - Salida: %s - Llegada: %s - Duración: %d", 
					dorsal, nombre, salida,llegada, getDuracion());			
		}
	}
	
	public static int generarDorsal() {
		int d = siguienteDorsal;
		siguienteDorsal ++;
		return d;
		
		// o lo que es lo mismo
		// return siguienteDorsal++;
		
		// o también
		// siguientDorsal ++;
		// return siguienteDorsal - 1;
	}
	
}
