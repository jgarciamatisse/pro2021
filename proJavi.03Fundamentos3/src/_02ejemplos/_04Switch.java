package _02ejemplos;

public class _04Switch {
	public static void main(String[] args) {
		System.out.println(nombreDiaSemana(3));
		System.out.println(nombreDiaSemana(10));
		System.out.println(nombreDiaSemana2(10));
		System.out.println(numeroDiaSemana("domingo"));

	}

	public static String nombreDiaSemana(int dia) {
		String nombreDia;
		switch (dia) {
		case 1:
			nombreDia = "lunes";
			break;
		case 2:
			nombreDia = "martes";
			break;
		case 3:
			nombreDia = "miercoles";
			break;
		case 4:
			nombreDia = "jueves";
			break;
		case 5:
			nombreDia = "viernes";
			break;
		case 6:
			nombreDia = "sabado";
			break;
		case 7:
			nombreDia = "domingo";
			break;
		default:
			nombreDia = "dia incorrecto";

		}
		return nombreDia;
	}

	public static String nombreDiaSemana2(int dia) {
		String nombreDia;
		switch (dia) {
		case 1:
			nombreDia = "lunes";
			break;
		case 2:
			nombreDia = "martes";
			break;
		case 3:
			nombreDia = "miercoles";
			break;
		case 4:
			nombreDia = "jueves";
			break;
		case 5:
			nombreDia = "viernes";
			break;
		case 6:
			nombreDia = "sabado";
			break;
		default:
			nombreDia = "domingo";
			break;
		}
		return nombreDia;
	}

	public static void mostrarNombreEstacion(int mes) {
		switch (mes) {
		case 1:
			System.out.println("invierno");
			break;
		case 2:
			System.out.println("invierno");
			break;
		case 3:
			System.out.println("invierno");
			break;
		case 4:
			System.out.println("primavera");
			break;
		case 5:
			System.out.println("primavera");
			break;
		case 6:
			System.out.println("primavera");
			break;
		case 7:
			System.out.println("verano");
			break;
		case 8:
			System.out.println("verano");
			break;
		case 9:
			System.out.println("verano");
			break;
		case 10:
			System.out.println("otoño");
			break;
		case 11:
			System.out.println("otoño");
			break;
		case 12:
			System.out.println("otoño");
			break;

		}
	}

	// No es obligatorio poner instrucciones asociadas al case
	public static void mostrarNombreEstacion2(int mes) {
		switch (mes) {
		case 1:
		case 2:
		case 3:
			System.out.println("invierno");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("primavera");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("verano");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("otoño");
			break;

		}
	}

	public static void mostrarTipolojamiento(int tipoReserva) {
		switch (tipoReserva) {
		case 1:
			System.out.println("Cena incluida");
		case 2:
			System.out.println("Desayuno incluido");
		case 3:
			System.out.println("Habitación doble incluido");
		}
	}

	public static int numeroDiaSemana(String nombreDia) {
		int numeroDia;
		switch (nombreDia.toLowerCase()) {
		
		case "lunes":
			numeroDia = 1;
			break;
		case "martes":
			numeroDia = 2;
			break;
		case "miercoles":
			numeroDia = 3;
			break;
		case "jueves":
			numeroDia = 4;
			break;
		case "viernes":
			numeroDia = 5;
			break;
		case "sabado":
			numeroDia = 6;
			break;
		default:
			numeroDia = 7;
			break;
		}
		return numeroDia;
	}
	
}
