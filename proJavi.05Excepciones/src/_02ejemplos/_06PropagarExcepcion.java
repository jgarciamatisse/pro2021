package _02ejemplos;

import java.util.Scanner;

public class _06PropagarExcepcion {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		try {
			System.out.println("Calculadora. Escribe operacion del tipo '8 + 5' ");
			String texto = tec.nextLine();

			int posPrimerBlanco = texto.indexOf(" ");
			int posUltimoBlanco = texto.lastIndexOf(" ");
			String sOp1 = texto.substring(0, posPrimerBlanco);
			String sOp2 = texto.substring(posUltimoBlanco + 1);
			String operacion = texto.substring(posPrimerBlanco + 1, posUltimoBlanco).trim();

			int op1 = Integer.parseInt(sOp1);
			int op2 = Integer.parseInt(sOp2);

			System.out.println(calcular(op1, operacion, op2));

		} catch (StringIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("La operacion tiene un formato incorrecto");
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por cero");
		}
	}

	public static int calcular(int op1, String operacion, int op2) throws ArithmeticException {
		int resultado = 0;
		switch (operacion) {
		case "+":
			resultado = op1 + op2;
			break;
		case "-":
			resultado = op1 - op2;
			break;
		case "*":
			resultado = op1 * op2;
			break;
		case "/":

			resultado = op1 / op2;  // La excepcion se propaga
			break;

		}
		return resultado;
	}

}
