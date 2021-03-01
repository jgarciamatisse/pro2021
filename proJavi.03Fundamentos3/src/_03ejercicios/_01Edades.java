package _03ejercicios;

public class _01Edades {
	public static void main(String[] args) {
		int m = 19, j = 20, p = 18, v = 29;

		// a: Miguel menor de edad;
		boolean a = m < 18;
		System.out.println("a: " + a);

		// b: Miguel es mayor que Julio
		boolean b = m > j;
		System.out.println("b: " + b);

		// c: Miguel es el más viejo.
		boolean c = m > j && m > p && m > v;
		System.out.println("c: " + c);

		// d: Miguel no es el más joven.
		boolean d = m >= j || m >= p || m >= v;
		d = !(m < j && m < p && m < v);
		System.out.println("d: " + d);

		// e: Miguel y Julio son menores de edad
		boolean e = m < 18 && j < 18;
		System.out.println("e: " + e);

		// g: miguel y julio son los más jovenes
		boolean g = m < p && m < v && j < p && j < v;
		System.out.println("g: " + g);

		// j: entre miguel y juliuo más edad que pablo y vicente
		boolean apartadoJ = m + j > p + v;
		System.out.println("j: " + apartadoJ);
		
		// o: al menos dos de ellos tienen la misma edad
		boolean o = m == j || m == p || m == v || 
				    j == p || j == v || 
				    p == v;
		System.out.println("o " + o);
	}

}
