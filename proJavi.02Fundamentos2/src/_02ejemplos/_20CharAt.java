package _02ejemplos;

public class _20CharAt {
	public static void main(String[] args) {
		String frase = "La casa de la esquina".toUpperCase();
		System.out.println("Segunda A: " + frase.indexOf('A',frase.indexOf('A')+1));
		
		int posA =-1;
		do {
			posA = frase.indexOf('A', posA + 1);

			if(posA != -1) {
				System.out.println("Hay una A en la posicion " + posA);
			}
		} while(posA != -1);
	}

}
