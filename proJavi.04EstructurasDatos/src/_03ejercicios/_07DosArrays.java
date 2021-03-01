package _03ejercicios;

public class _07DosArrays {
	public static void main(String[] args) {
		
	}
	
	public static double[] sumaIguales(double[] a, double[] b) {
		
		double[] s = new double[a.length];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = a[i] + b[i];
		}
		
		return s;
	}
}
