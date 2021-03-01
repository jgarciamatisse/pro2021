package _03ejercicios;

public class _08Lluvias {
	public static void main(String[] args) {
		double[] lluvias = {0,2,3,3,7,15,12,3,1,9,0,0,0,0,1,
				            0,0,10,0,0,0,0,3,0,0,0,0,0,0,0,0};
		
		
	}
	public static int primerDiaLluviaX (double[] p, double x) {
		boolean enc = false;
		
		int i = 0;
		while (i < p.length && !enc /* enc == false */ ) {
			if(p[i] == x) {
				enc = true;
			} else {
				i++;
			}
		}
		
		if(enc) {
			return i;
		} else {
			return -1;
		}
		
	}

}
