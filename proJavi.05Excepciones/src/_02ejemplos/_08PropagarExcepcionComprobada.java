package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _08PropagarExcepcionComprobada {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		boolean continuar = true;

		do {
			try {
				System.out.println("Nombre del fichero: ");
				String nomFich = tec.nextLine();

				int suma = sumarFichero(nomFich);
				continuar = false;

				System.out.println("Suma: " + suma);
			
			} catch (FileNotFoundException e) {
				System.out.println("El fichero indicado no existe. Vuelve a intentarlo");
			}
		} while (continuar /* ok == false */);

	}

	public static int sumarFichero(String nomFich) throws FileNotFoundException {
		int suma = 0;
		Scanner f = null;
		try {
			f = new Scanner(new File(nomFich));

			while (f.hasNext()) {
				int edad = f.nextInt();
				suma += edad;
			}

			// } catch (FileNotFoundException e) {

		} finally {
			if (f != null)
				f.close();
		}

		return suma;
	}

}
