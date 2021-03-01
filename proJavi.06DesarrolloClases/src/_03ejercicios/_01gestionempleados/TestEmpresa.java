package _03ejercicios._01gestionempleados;

public class TestEmpresa {
	public static void main(String[] args) {
		Empresa e = new Empresa("Matisse DAM");
		
		//Contratar varios empleados
		e.contratar(new Empleado("Luis","111111111A",2000,1000));
		e.contratar(new Empleado("Ana","222222222B",2001,1100));
		e.contratar(new Empleado("Angel","333333333C",2002,1200));
		
		Empleado emp = new Empleado("Paula","444444444D",2003,1000);
		e.contratar(emp);
		
		System.out.println(e);
		
		//Subir 10% a quienes cumplen trienio
		e.subirTrienio(10);
		System.out.println("*********************");
		System.out.println(e);
		
		
		
		//Despedir
		// dado un empleado
		e.despedir(emp);
		// dado un dni
		e.despedir("111111111A");
		System.out.println("*********************");
		System.out.println(e);
		
		
	}

}
