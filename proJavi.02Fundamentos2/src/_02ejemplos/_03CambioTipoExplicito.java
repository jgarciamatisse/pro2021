package _02ejemplos;

public class _03CambioTipoExplicito {
	public static void main(String[] args) {
		double d = 20.9;
		//int i = d; //Cambio implicito da error
		int i = (int) d; //Cambio explícito. Guarda en i el 
					     //resultado de convertir d en un
		                 //entero
		System.out.println(i);
	}
}
