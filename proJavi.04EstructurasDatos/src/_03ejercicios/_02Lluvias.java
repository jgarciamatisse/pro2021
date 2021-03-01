package _03ejercicios;

public class _02Lluvias {
	public static void main(String[] args) {
		double[] lluvias = {0,2,3,3,7,15,12,3,1,9,0,0,0,0,1,
				            0,0,10,0,0,0,0,3,0,0,0,0,0,0,0,0};
		
		System.out.println("Lluvia total del mes: " + lluviaTotal(lluvias));
		System.out.println("Lluvia primera quincena: " 
				+ lluviaTotalPeriodo(lluvias, 0, 14));
	}
	public static double lluviaTotal (double[] p) {
		double suma = 0;
		for (int i = 0; i < p.length; i++) {
			suma += p[i];
		}
		return suma;
	}
	
	public static double lluviaMedia (double[] p) {
		double suma = 0;
		for (int i = 0; i < p.length; i++) {
			suma += p[i];
		}
		return suma /p.length;
	}
	public static double lluviaMedia2 (double[] p) {
		return lluviaTotal(p) /p.length;
	}
	
	public static double lluviaMaxima (double[] p) {
		double max = p[0];
		for (int i = 1; i < p.length; i++) {
			if(p[i] > max) {
				max = p[i];
			}
		}
		return max;
	}
	
	public static double lluviaMinima (double[] p) {
		double min = p[0];
		for (int i = 1; i < p.length; i++) {
			if(p[i] < min) {
				min = p[i];
			}
		}
		return min;
	}
	
	public static int diaMasLluvia (double[] p) {
		double max = p[0];
		int diaMax = 0;
		for (int i = 1; i < p.length; i++) {
			if(p[i] > max) {
				max = p[i];
				diaMax = i;
			}
		}
		return diaMax;
	}
	
	public static int diaMenosLluvia (double[] p) {
		double min = p[0];
		int diaMin = 0;
		for (int i = 1; i < p.length; i++) {
			if(p[i] < min) {
				min = p[i];
				diaMin = i;
			}
		}
		return diaMin;
	}
	
	public static int contarDiasLluviaX (double[] p, double x) {
		int cont = 0;
		for (int i = 0; i < p.length; i++) {
			if(p[i] == x) {
				cont ++;
			}
		}
		return cont;
	}
	
	public static double lluviaTotalPeriodo (double[] p, int ini, int fin) {
		double suma = 0;
		for (int i = ini; i <= fin; i++) {
			suma += p[i];
		}
		return suma;
	}
	
	public static int contarDiasLluviaCreciente(double[] p) {
		int cont = 0;
		for (int i = 0; i < p.length - 1; i++) {
			if(p[i] < p[i + 1]) {
				cont ++;
			}
		}
		return cont;
	}

}
