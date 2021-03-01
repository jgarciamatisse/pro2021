package _03ejercicios;

public class _12Capicua {
	public static void main(String[] args) {
		
	}
	public static boolean esCapicua (String[] v) {
		int i = 0;
		boolean enc = false;
		
		while (i < v.length/2 && !enc) {
			if(!v[i].equals(v[v.length-1-i])) {
				enc = true;
			} else {
				i++;
			}
		}
		
		if(enc) return false; //No es capicua
		else return true; // si lo es
		//return !enc;
	}
	
	public static boolean esCapicua2 (String[] v) {
		int  i = 0, j = v.length - 1; 
		boolean esCapicua = true;
		while( i < j && esCapicua) {
			if(!v[i].equals(v[j])) {
				esCapicua = false;
			} else {
				i++;
				j--;
			}
		}
		return esCapicua;
	}
		
	

}
