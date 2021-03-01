package _03ejercicios._01gestionempleados;

import java.util.Calendar;

public class Empleado implements Comparable<Empleado> {
	private String nombre;
	private String dni;
	private int anyoIngreso;
	private double sueldo;

	// Getter
	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public int getAnyoIngreso() {
		return anyoIngreso;
	}

	public double getSueldo() {
		return sueldo;
	}

	// Setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setAnyoIngreso(int anyoIngreso) {
		if (anyoIngreso < 0) {
			throw new IllegalArgumentException("El año no puede ser negativo");
		}
		this.anyoIngreso = anyoIngreso;
	}

	public void setSueldo(double sueldo) {
		if (sueldo < 0) {
			throw new IllegalArgumentException("El sueldo no puede ser negativo");
		}
		this.sueldo = sueldo;
	}

	// Constructor
	public Empleado(String nombre, String dni, int anyoIngreso, double sueldo) {
		this.nombre = nombre;
		this.dni = dni;
		setAnyoIngreso(anyoIngreso);
		setSueldo(sueldo);
	}

	// Antigüedad
	public int antiguedad() {
		int actual = Calendar.getInstance().get(Calendar.YEAR);

		int antiguedad = actual - anyoIngreso;
		if (antiguedad < 0)
			antiguedad = 0;
		return antiguedad;

		// return Math.max(0, Calendar.getInstance().get(Calendar.YEAR) - anyoIngreso);
	}

	// Incrementar sueldo
	public void incrementarSueldo(double porcentaje) {
		this.sueldo = this.sueldo + this.sueldo * porcentaje / 100;
	}

	// toString
	public String toString() {
		return "Nombre: " + nombre + "\nDNI: " + dni + "\nAño ingreso: " + anyoIngreso + "\nSueldo bruto anual: "
				+ sueldo + " €";
	}

	// equals
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Empleado))
				return false;

//			if(this.dni.equals(((Empleado) o).dni)) {
//				return true;800
//			} else {
//				return false;
//			}
		return this.dni.equals(((Empleado) o).dni);
	}

	@Override
	public int compareTo(Empleado e) {
		return this.dni.compareTo(e.dni);

//			if(this.dni.compareTo(e.dni) < 0 ) return -1;
//			else if(this.dni.compareTo(e.dni) > 0 ) return 1;
//			else return 0;
	}
	
	
	public static double calcularIrpf(double salarioMensual) {
		double irpf;
		if(salarioMensual < 800) irpf = 3;
		else if(salarioMensual < 1000) irpf = 10;
		else if(salarioMensual < 1500) irpf = 15;
		else if(salarioMensual < 2100) irpf = 20;
		else irpf = 30;
		return irpf;
	}
}
