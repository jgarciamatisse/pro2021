package _02ejemplos._04contadorobjetos;

public class TestAlumno {
	public static void main(String[] args) {
		Alumno a1 = new Alumno(1,"a");
		Alumno a2 = new Alumno(2,"b");
		Alumno a3 = new Alumno(3,"c");
		Alumno a4 = new Alumno(4,"d");
		Alumno a5 = new Alumno(5,"e");
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		
		//La clase Alumno no permite que se cree un sexto alumno
		Alumno a6 = new Alumno(6,"f");
		System.out.println(a6);
		
	}

}
