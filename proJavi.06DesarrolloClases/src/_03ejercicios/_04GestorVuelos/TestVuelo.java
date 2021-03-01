package _03ejercicios._04GestorVuelos;

import java.util.Scanner;

import _02ejemplos._01tiempo.Tiempo;

public class TestVuelo {
	public static void main(String[] args) {
		Vuelo v = new Vuelo("IB101","Valencia","Paris",new Tiempo(19,5,0), new Tiempo(21,0,0),10);
		//System.out.println(v);
		
		//Añadir algunos pasajeros
		v.reservarAsiento("Miguel", "111111111A");
		v.reservarAsiento("Luis", "444444444A");
		v.reservarAsiento("Raul", "333333333A");
		v.reservarAsiento("Esther", "222222222a");
		v.reservarAsiento("Ana", "555555555A");
		
		System.out.println(v);
		
		//Añadir pasajeros con preferencia
		v.reservarAsiento("Angel", "666666666A",'V');
		v.reservarAsiento("Rosa", "777777777A",'P');
		
		System.out.println("------------");
		System.out.println(v);
		
		//Cancelar reserva
		Scanner tec = new Scanner(System.in);
		System.out.println("-------------");
		System.out.println("Que reserva quieres cancelar?: ");
		int asientoCancelar = tec.nextInt();
		
		v.cancelarReserva(asientoCancelar);
		System.out.println(v);
	}

}
