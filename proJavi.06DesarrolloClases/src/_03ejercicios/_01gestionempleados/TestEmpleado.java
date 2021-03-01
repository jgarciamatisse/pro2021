package _03ejercicios._01gestionempleados;

import java.util.Scanner;

public class TestEmpleado {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Empleado 1");
		System.out.println("Nombre: ");
		String nombre = tec.next();
		System.out.println("Dni: ");
		String dni = tec.next();
		System.out.println("Año ingreso: ");
		int anyo = tec.nextInt();
		System.out.println("Sueldo: ");
		double sueldo = tec.nextDouble();
		
		Empleado e1 = new Empleado(nombre, dni, anyo, sueldo);

		System.out.println("Empleado 2");
		System.out.println("Nombre: ");
		nombre = tec.next();
		System.out.println("Dni: ");
		dni = tec.next();
		System.out.println("Año ingreso: ");
		anyo = tec.nextInt();
		System.out.println("Sueldo: ");
		sueldo = tec.nextDouble();
		
		Empleado e2 = new Empleado(nombre, dni, anyo, sueldo);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("----------");
		
		//Incrementar sueldo al empleado que menos cobre
		if(e1.getSueldo() < e2.getSueldo()) {
			e1.incrementarSueldo(20);
		} else {
			e2.incrementarSueldo(20);
		}
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("----------");
		
		//Incrementar sueldo al más antiguo
		if(e1.antiguedad() > e2.antiguedad()) {
			e1.incrementarSueldo(10);
		} else {
			e2.incrementarSueldo(10);
		}
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("----------");
		
		//ifpf de los empleados
		//System.out.println(e1.calcularIrpf();
		System.out.println(Empleado.calcularIrpf(e1.getSueldo() / 12));
		System.out.println(Empleado.calcularIrpf(e2.getSueldo() / 12));
		
		
	}	
}
