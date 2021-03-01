package _03ejercicios;

import java.util.Random;

public class _08CaraOCruz {
	public static void main(String[] args) {
		Random r = new Random();
		int lanzamientos = 0, caras = 0, cruces = 0;
		double porcCaras = 0, porcCruces = 0;
		do {
			boolean esCara = r.nextBoolean();
			lanzamientos ++;
			
			if(esCara) caras++;
			else cruces++;
			
			porcCaras = ((double)caras/lanzamientos) * 100;
			porcCruces = 100 - porcCaras;
			
			System.out.format("Caras: %6d - Cruces: %6d - Porc.caras: %6.2f - Porc.cruces: %6.2f%n",
					caras,cruces,porcCaras,porcCruces);
			
		} while(Math.abs(porcCaras - porcCruces) > 0.001);
		
	}
}
