package _03ejercicios;

public class _13Subsecuencia {
	public static void main(String[] args) {
		int[] v1 = {3, 4, 5, 6, 7, 8, 4};
		System.out.println(posSubsecuenciaN(v1,4));
		
		//int[]  v2 = {1, 3, 5, 9, 7, 4};
		//System.out.println(posSubsecuenciaN(v2,3));
		
	}

	public static int posSubsecuencia(int[] v) {
		
		int i = 0;
		boolean enc = false;
		while(i < v.length - 2 && !enc) {
			if(v[i+1] == v[i] + 1 && v[i+2] == v[i] + 2) enc = true;
			else i++;
		}
		
		if(enc) return i;
		else return -1;
	}
	
	public static int posSubsecuenciaN (int[] v, int n) {
		//Devuelve en que posiint ncion del array comienza una secuencia de n
		//elementos seguidos
		int i = 1;
		boolean enc = false;
		int seguidos = 1;
		
		while(i < v.length && !enc) {
			if(v[i] == v[i-1] + 1) {
				seguidos ++;
				if (seguidos == n) {
					enc = true;
					
				} 
			} else {
				seguidos = 1;
			}
			i++;
		}
		
		if(enc) {
			return i - n ;
		} else {
			return -1;
		}
		
	}
}
