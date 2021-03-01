package _03ejercicios;

public class _10PrimerImpar {
	public static void main(String[] args) {
		
	}
	
	public static int sumaTrasPrimerImpar1(int[] v) {
		//Buscamos la posicion del primer impar
		int pos = 0;
		int i = 0;
		boolean enc = false;
		while (i < v.length && !enc) {
			if (v[i] % 2 != 0) {
				enc = true;
				pos = i;
			} else {
				i++;
			}
		}
		//Sumamos los elementos tras el primer impar
		int suma = 0;
		if(enc) {
			for (int j = pos+1; j < v.length; j++) {
				suma += v[i];
			}
		}
		return suma;
		
	}
	public static int sumaTrasPrimerImpar2(int[] v) {
		//Localizamos primer impar
		int i = 0;
		while( i < v.length && v[i] % 2 == 0) {
			i++;
		}
			
		int suma = 0;
		for (int j = i + 1; j < v.length; j++) {
			suma += v[i];
		}
		
		return suma;
		
	}
	public static int sumaTrasPrimerImpar3(int[] v) {
		int suma = 0;
		boolean enc = false;
		
		for (int i = 0; i < v.length; i++) {

			if(enc) {
				suma += v[i];
			} else {
				if(v[i] % 2 != 0) {
					enc = true;
				}
			}
			
		}
		
		return suma;
	}

}
