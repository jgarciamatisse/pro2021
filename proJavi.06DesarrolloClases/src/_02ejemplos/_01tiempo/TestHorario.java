package _02ejemplos._01tiempo;

public class TestHorario {
	public static void main(String[] args) {
		Horario hEso = new Horario("Primer ciclo ESO");
		
		hEso.anyadirSesion(new Tiempo(9,45,0));
		hEso.anyadirSesion(new Tiempo(7,55,0));
		hEso.anyadirSesion(new Tiempo(8,50,0));
		hEso.anyadirSesion(new Tiempo(11,10,0));
		hEso.anyadirSesion(new Tiempo(12,05,0));
		hEso.anyadirSesion(new Tiempo(13,0,0));
		
		System.out.println(hEso);
		
		//Eliminar las 8:50
		hEso.eliminarSesion(new Tiempo(8,50,0));
		System.out.println("----------");
		System.out.println(hEso);
		
		//Eliminar la ultima sesion
		hEso.eliminarSesion(hEso.numSesiones());
		System.out.println("----------");
		System.out.println(hEso);
		
		//Otra forma
		hEso.getSesiones().remove(0);
		System.out.println("----------");
		System.out.println(hEso);
	}

}
