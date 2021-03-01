package _03ejercicios;

public class _09Tocayos {
	public static void main(String[] args) {
		String[] grupo1 = {"miguel","josé","ana","maría"};
		String[] grupo2 = {"ana", "josé", "luján", "juan", "josé", "pepa", "ángela", "sofía", "andrés", "bartolo"};
				
		for (int i = 0; i < grupo1.length; i++) {
			
			//Comprobar si grupo1[i] está en grupo 2
			boolean enc = false;
			int j = 0;
			while (j < grupo2.length && !enc) {
				if(grupo1[i].equals(grupo2[j])) {
					enc = true;
					System.out.println(grupo1[i] + " tiene un tocayo en el grupo 2");
				} else {
					j++;
				}
			}
			
			//Con for
//			for (int j = 0; j < grupo2.length && !enc; j++) {
//				if(grupo1[i].equals(grupo2[j])) {
//					enc = true;
//					System.out.println(grupo1[i] + " tiene un tocayo en el grupo 2");
//				} 
//			}
			
		}
	}

}
