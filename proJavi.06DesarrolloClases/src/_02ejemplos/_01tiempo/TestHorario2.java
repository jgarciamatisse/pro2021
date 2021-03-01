package _02ejemplos._01tiempo;

public class TestHorario2 {
	public static void main(String[] args) {
		Tiempo inicio = new Tiempo(7,55,0);
		
		
		Horario hEso = new Horario("Primer ciclo ESO");
		Horario hCCFF = new Horario("Ciclos Formativos");
		
		hEso.anyadirSesion(inicio);
		hEso.anyadirSesion(new Tiempo(8,50,0));
		
		hCCFF.anyadirSesion(inicio);
		hCCFF.anyadirSesion(new Tiempo(8,50,0));
		
		//hEso y hCCFF comparten la primera hora o cada uno 
		// tiene la suya independiente????
		inicio.setMinuto(50);
		
		System.out.println(hEso);
		System.out.println(hCCFF);
	}

}
