package _02ejemplos._03atributosestaticos;

public class TestAlumno {
	public static void main(String[] args) {
		Alumno a1 = new Alumno();
		a1.setNia(1);
		a1.setNombre("Luis");
		a1.setTutor("Ester");
		
		Alumno a2 = new Alumno();
		a2.setNia(2);
		a2.setNombre("Angel");
		a2.setTutor("David");
		
		System.out.println(a1);
		System.out.println(a2);
		
		a1.setTutor("Mariano");
		
		System.out.println(a1);
		System.out.println(a2);
	}

}
