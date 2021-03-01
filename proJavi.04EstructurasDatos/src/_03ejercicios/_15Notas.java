package _03ejercicios;

public class _15Notas {
	public static void main(String[] args) {
		int [][] notas = {
				{10,5,3,4,8},
				{8,7,6,6,2},
				{9,9,9,9,9},
				{1,1,1,1,1}
		};
		String[] alu = {"Juan","Luis","Ana","Lucía"};
		String[] asig = {"ED","LMI","FOL","PRO","BD"};
		imprimirPorAlumno(notas, alu, asig);
	}
	
	public static void imprimirPorAlumno (int[][] notas,String[] alu, String[] asig) {
		for (int i = 0; i < notas.length; i++) {
			System.out.println(alu[i] + ": ");
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("   - " + asig[j] +  ": " + notas[i][j]);
			}
		}
		
	}
	public static void imprimirPorAsignatura (int[][] notas) {
		for (int j = 0; j < notas[0].length; j++) {
			System.out.println("Asignatura " + (j + 1) + ": ");
			for (int i = 0; i < notas.length; i++) {
				System.out.println("   - Alumno " + (i+1) + ": " + notas[i][j]);
			}
		}
		
	}
	
	public static void imprimirMediaAlumnos(int[][] notas) {
		for (int i = 0; i < notas.length; i++) {
			//Calculamos la media de la fila
			int suma = 0;
			for (int j = 0; j < notas[i].length; j++) {
				suma += notas[i][j];
			}
			System.out.println("Media del alumno " + (i+1) + ": " + (double)suma / notas[i].length );
		}
	}
	
	public static void imprimirMediaAsignaturas(int[][] notas) {
		for (int j = 0; j < notas[0].length; j++) {
			int suma = 0;
			for (int i = 0; i < notas.length; i++) {
				suma += notas[i][j];
			}
			System.out.println("Media de asignatura " + (j+1) + ": " + (double)suma / notas.length );
		}
	}
	
	public static void asignaturaMasFacil(int[][] notas) {
		double mediaMasGrande = -1;
		int asignaturaMasFacil = -1;
		for (int j = 0; j < notas[0].length; j++) {
			int suma = 0;
			for (int i = 0; i < notas.length; i++) {
				suma += notas[i][j];
			}
			//System.out.println("Media de asignatura" + (j+1) + ": " + (double)suma / notas.length );
			double media = (double)suma / notas.length;
			if(media > mediaMasGrande) {
				mediaMasGrande = media;
				asignaturaMasFacil = j;
			}
		}
		System.out.println("Asignatura más fácil: " + (asignaturaMasFacil + 1));
	}
	
	public static void alguienQueSuspendeTodo (int[][] notas) {
		//Buscamos alumno que haya suspedido todas
		boolean encAlumno = false;
		for(int i = 0; i < notas.length && !encAlumno; i++) {
			//Comprobamos si el alumno i ha suspendido todas
			boolean encAsignaturaAprobada = false;
			for (int j = 0; j < notas[i].length && !encAsignaturaAprobada; j++) {
				if(notas[i][j] >= 5) {
					encAsignaturaAprobada = true;
				}
			}
			
			if(!encAsignaturaAprobada) {
				encAlumno = true;
			}
		}
		if(encAlumno) System.out.println("Hay ALGUN ALUMNO QUE SUSPENDE TODAS");
		else System.out.println("NADIE SUSPENDE TODAS");
	}
	public static void asignaturaSuspendidaPorTodos (int[][] notas) {
		//Buscamos asignatura  que haya suspedido todo el mundo
		boolean encAsignatura = false;
		for(int j = 0; j < notas[0].length && !encAsignatura; j++) {
			//Comprobamos si la asignatura j la suspenden todos
			boolean encAlumnoAprobado = false;
			for (int i = 0; i < notas.length && !encAlumnoAprobado; i++) {
				if(notas[i][j] >= 5) {
					encAlumnoAprobado = true;
				}
			}
			
			if(!encAlumnoAprobado) {
				encAsignatura = true;
			}
		}
		if(encAsignatura) System.out.println("Hay asignatura suspendida por todos");
		else System.out.println("No hay asignatura suspendida por todos");
	}

}








