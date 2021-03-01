package _03ejercicios._02juegos;

public abstract class JuegoAlquilerVenta extends Juego{
	protected double precio;
	protected int copias;
	
	public JuegoAlquilerVenta(String titulo, String fabricante, int anyo, double precio, int copias) {
		super(titulo, fabricante, anyo);
		this.precio = precio;
		this.copias = copias;
	}
	
	
}
