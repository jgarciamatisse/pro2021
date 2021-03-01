package _03ejercicios._06Contrarreloj;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ListaCorredores {
	private ArrayList<Corredor> lista;
	
	public ListaCorredores() {
		lista = new ArrayList<>();
	}
	
	public void anyadir(Corredor c) throws IllegalArgumentException {
		if(lista.contains(c)) {
			throw new IllegalArgumentException("El corredor ya está en la lista");
		}
		lista.add(c);
	}
	
	public void insertarOrdenado(Corredor c) {
		//Localizar la posicion que corresponde a c
		boolean enc = false;
		int posicion = 0;
		for(int i = 0; i < lista.size() && !enc; i++) {
			if(lista.get(i).getDuracion() >= c.getDuracion()) {
				posicion = i;
				enc = true;
			}
		}
		if(enc) {
			lista.add(posicion,c);
		} else {
			lista.add(c);
		}
	}
	
	public Corredor quitar (int dorsal) throws NoSuchElementException {
		boolean enc = false;
		int posicion = 0;
		
		for(int i = 0; i < lista.size() && !enc; i++) {
			if(lista.get(i).getDorsal() == dorsal) {
				enc = true;
				posicion = i;
			}
		}
		if(!enc) {
			throw new NoSuchElementException("El corredor no existe");
		}
		
		//Eliminamos al corredor de la lista y lo devolvemos
		Corredor c = lista.remove(posicion);
		return c;
		
	}
	
	@Override 
	public String toString() {
		String result = "";
		int i = 1;
		for(Corredor c: lista) {
			result += "Posicion " + i + ":\n" + c.toString() + "\n";
			i++;
		}
		return result;
	}
	
	
	
	

}
