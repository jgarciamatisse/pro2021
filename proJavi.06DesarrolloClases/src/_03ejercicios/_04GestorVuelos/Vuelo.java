package _03ejercicios._04GestorVuelos;

import java.util.Iterator;

import _02ejemplos._01tiempo.Tiempo;

public class Vuelo {
	
	public final static char VENTANILLA = 'V';
	
	private String id;
	private String origen;
	private String destino;
	private Tiempo horaSalida;
	private Tiempo horaLlegada;
	private int capacidad;
	private int numReservas;
	private Pasajero[] pasaje;
	
	public Vuelo (String id, String orig, String dest, Tiempo hsal, Tiempo hlleg, int capacidad) {
		this.id = id;
		this.origen = orig;
		this.destino = dest;
		this.horaSalida = hsal;
		this.horaLlegada = hlleg;
		this.capacidad = capacidad;
		
		this.numReservas = 0;
		pasaje = new Pasajero[capacidad + 1];
	}
	
	public boolean hayLibres() {
		return numReservas < capacidad;
	}
	
	public int reservarAsiento(String nombrePasajero, String nifPasajero) throws IllegalArgumentException{
		if(hayLibres()) {
			Pasajero p = new Pasajero(nifPasajero, nombrePasajero);
			//Comproba si es o no un duplicado
			boolean enc = false;
			for (int i = 1; i < pasaje.length && !enc; i++) {
				if(pasaje[i] != null && pasaje[i].equals(p)) {
					enc = true;
				}
			}
			if(enc) throw new IllegalArgumentException("Pasajero duplicado");
			
//			//De otra forma
//			for (int i = 1; i < pasaje.length; i++) {
//				if(pasaje[i] != null && pasaje[i].equals(p)) {
//					throw new IllegalArgumentException("Pasajero duplicado");
//				}
//			}
			//Hay sitio en el avión y el pasajero no es un duplicado
			//Buscamos un asiento aleatorio libre
			int asiento;
			do {
				asiento = (int) (Math.random() * capacidad + 1);
				//int asiento = new Random().nextInt(capacidad) + 1; 
			} while (pasaje[asiento] != null);
			
			//Asignamos el asiento
			pasaje[asiento] = p;
			numReservas ++;
			return asiento;
			
		} else {
			return 0;
		}
	}
	
	public int reservarAsiento(String nombrePasajero, String nifPasajero, char preferencia) throws IllegalArgumentException{
		if(hayLibres()) {
			Pasajero p = new Pasajero(nifPasajero, nombrePasajero);
			//Comproba si es o no un duplicado
			boolean enc = false;
			for (int i = 1; i < pasaje.length && !enc; i++) {
				if(pasaje[i] != null && pasaje[i].equals(p)) {
					enc = true;
				}
			}
			if(enc) throw new IllegalArgumentException("Pasajero duplicado");
			
			//Hay sitio en el avión y el pasajero no es un duplicado
			//Buscamos un asiento aleatorio libre
			int asiento = 0;
			int posInicial1,posInicial2;
			if(preferencia == VENTANILLA) {
				posInicial1 = 1;
				posInicial2 = 2;
			} else {
				posInicial1 = 2;
				posInicial2 = 1;
			}
			
			//Busca primer asiento libre en la preferencia del pasajero
			for(int i = posInicial1; i < pasaje.length && asiento == 0; i+=2) {
				if(pasaje[i] == null) asiento = i;
			}
			//Busca primer asiento libre en lo que no queria el pasajero
			for(int i = posInicial2; i < pasaje.length && asiento == 0; i+=2) {
				if(pasaje[i] == null) asiento = i;
			}
			
			
			//Asignamos el asiento
			pasaje[asiento] = p;
			numReservas ++;
			return asiento;
			
		} else {
			return 0;
		}
	}
	
	public void cancelarReserva (int numAsiento) throws IllegalArgumentException {
		//Comprobamos que el asiento esté reservado
		if(pasaje[numAsiento] == null) {
			throw new IllegalArgumentException("El asiento no está reservdo");
		} else {
			pasaje[numAsiento] = null;
			numReservas --;
		}	
	}

	public String toString() {
		String res = id + " " + origen + " " + destino + " " + horaSalida + " " + horaLlegada;
		res += "\nPasajeros";
		for(int i = 1; i < pasaje.length; i++) {
			if(pasaje[i] != null) {
				res += "\nAsiento " + i + ": " + pasaje[i].toString();
			}
		}
		return res;
	}

}





