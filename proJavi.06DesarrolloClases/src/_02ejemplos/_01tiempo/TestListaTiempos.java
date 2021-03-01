package _02ejemplos._01tiempo;

import java.util.ArrayList;

public class TestListaTiempos {
	public static void main(String[] args) {
		ArrayList<Tiempo> horario = new ArrayList<>();
		
		horario.add(new Tiempo(7,55,0));
		horario.add(new Tiempo(8,50,0));
		horario.add(new Tiempo(9,45,0));
		horario.add(new Tiempo(10,40,0));
		
		Tiempo horaActual = new Tiempo(10,40,0);
		
		if(horario.contains(horaActual)) {
			System.out.println("Suena el timbre");
		} else {
			System.out.println("Estamos en clase");
		}
		
	}

}
