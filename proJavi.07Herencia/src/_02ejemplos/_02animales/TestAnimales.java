package _02ejemplos._02animales;

import java.util.ArrayList;

public class TestAnimales {
	public static void main(String[] args) {
		Perro p = new Perro("P");
		Gato g = new Gato("G");
		Lobo l = new Lobo("L");
		Tigre t = new Tigre("T");
		
		
		p.saludar();
		g.saludar();
		l.saludar();
		t.saludar();
		
		p.pedirComida();
		g.pedirComida();
		l.pedirComida();
		t.pedirComida();
		
		
		Animal[] misAnimales = {new Perro("P"),new Gato("G"),new Lobo("L"),new Tigre("T")};
		
		for (int i = 0; i < misAnimales.length; i++) {
			misAnimales[i].saludar();
			misAnimales[i].pedirComida();
		}
		
		//Posibilidad que proporciona el interface Mascota
		
		ArrayList<Mascota> misMascotas = new ArrayList<>();
		misMascotas.add(p);
		misMascotas.add(g);
		//misMascotas.add(l); <-- ERROR DETECTADO AL COMPILAR
		
		for(Mascota m: misMascotas) {
			m.llevarAPelu();
		}
		
		//Si el arraylist se definiera de <Animal>, entonces
		//habría que hacer un Casting para poder llamar al 
		//método llevarAPelu
		ArrayList<Animal> misMascotas2 = new ArrayList<>();
		misMascotas2.add(p);
		misMascotas2.add(g);
		//misMascotas2.add(l); <-- ERROR DETECTADO AL EJECUTAR
		
		for(Animal a: misMascotas2) {
			((Mascota)a).llevarAPelu();
		}
	}

}
