package _02ejemplos._02animales;

import java.util.Iterator;

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
	}

}
