package _03ejercicios._03figuras;

public class Circulo extends Figura {
	private int radio;

	public Circulo(int posX, int posY, String color, int radio) {
		super(posX, posY, color);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public double area(){
		return Math.PI * radio * radio;
	}

	public double perimetro() {
		return 2 * Math.PI * radio;
	}
	
	public boolean equals (Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(!(o instanceof Circulo)) return false;
		Circulo c = (Circulo) o;
		return this.posX == c.posX && this.posY == c.posY 
				&& this.color.equals(c.color) && this.radio == c.radio;
	}

}
