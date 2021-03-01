package _03ejercicios;

public class _04Switch {
	public static void main(String[] args) {
		System.out.println(numeroDiaSemana("LUNES"));
	}

	public static String nombreMes(int mes) {
		String nombre = "";
		switch (mes) {
		case 1:
			nombre = "enero";
			break;
		case 2:
			nombre = "febrero";
			break;
		case 3:
			nombre = "marzo";
			break;
		case 4:
			nombre = "abril";
			break;
		case 5:
			nombre = "mayo";
			break;
		case 6:
			nombre = "junio";
			break;
		case 7:
			nombre = "julio";
			break;
		case 8:
			nombre = "agosto";
			break;
		case 9:
			nombre = "septiembre";
			break;
		case 10:
			nombre = "octubre";
			break;
		case 11:
			nombre = "noviembre";
			break;
		case 12:
			nombre = "diciembre";
			break;

		}
		return nombre;
	}

	public static String estacionDelAnyo(int mes) {
		String estacion = "";
		switch (mes) {
		case 1:
		case 2:
		case 3:
			estacion = "invierno";
			break;
		case 4:
		case 5:
		case 6:
			estacion = "primavera";
			break;
		case 7:
		case 8:
		case 9:
			estacion = "verano";
			break;
		case 10:
		case 11:
		case 12:
			estacion = "otoño";
			break;

		}
		return estacion;
	}

	public static int numeroDiaSemana(String dia) {
		int num = 0;
		switch (dia.toLowerCase()) {
		case "lunes":
			num = 1;
			break;
		case "martes":
			num = 2;
			break;
		case "miercoles":
			num = 3;
			break;
		case "jueves":
			num = 4;
			break;
		case "viernes":
			num = 5;
			break;
		case "sabado":
			num = 6;
			break;
		case "domingo":
			num = 7;
			break;

		}
		return num;
	}

	public static String nombreDiaSemana(int dia) {
		String nombre = "";
		switch (dia) {
		case 1:
			nombre = "lunes";
			break;
		case 2:
			nombre = "martes";
			break;
		case 3:
			nombre = "miercoles";
			break;
		case 4:
			nombre = "jueves";
			break;
		case 5:
			nombre = "viernes";
			break;
		case 6:
			nombre = "sabado";
			break;
		case 7:
			nombre = "domingo";
			break;

		}
		return nombre;
	}

	public static int diasDelMes(int mes, int anyo) {
		int dias = 0;
		switch (mes) {
		case 2:
			if (anyo % 400 == 0 || anyo % 4 == 0 && anyo % 100 != 0) {
				dias = 29;
			} else {
				dias = 28;
			}
			break;
		case 4:
		case 7:
		case 9:
		case 11:
			dias = 30;
			break;

		default:
			dias = 31;
		}

		return dias;

	}

}
