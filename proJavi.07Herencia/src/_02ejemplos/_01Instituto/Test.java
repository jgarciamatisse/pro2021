package _02ejemplos._01Instituto;

public class Test {
	public static void main(String[] args) {
		Persona p = new Persona("1111111A","Luis");
		
		System.out.println(p);
		
		Alumno a = new Alumno ("222222B","Angel",532,"1DAM");
		System.out.println(a);
		System.out.println("El alumno " + a.getNombre() + " esta en " + a.getGrupo());
	}

}
