package _03ejercicios._02juegos;

public class JuegoAlquiler extends JuegoAlquilerVenta {
	protected int dias;

	public JuegoAlquiler(String titulo, String fabricante, int anyo, double precio, int copias, int dias) {
		super(titulo, fabricante, anyo, precio, copias);
		this.dias = dias;
	}
	

}
