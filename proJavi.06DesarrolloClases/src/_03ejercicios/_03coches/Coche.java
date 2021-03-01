package _03ejercicios._03coches;

public class Coche {
	private boolean enMarcha;
	private double velocidadMaxima;
	private double velocidadActual;
	private int rpmMaxima;
	private int rpmActual;
	private int marcha;
	
	
	public Coche(){
		this(180,65000);
//		this.enMarcha = false;
//		this.velocidadMaxima = 180;
//		this.velocidadActual = 0;
//		this.rpmMaxima = 65000;
//		this.rpmActual = 0;
//		this.marcha = 0;
	}
	public Coche(double velocidadMaxima, int rpmMaxima){
		this.enMarcha = false;
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadActual = 0;
		this.rpmMaxima = rpmMaxima;
		this.rpmActual = 0;
		this.marcha = 0;
	}
	
	public boolean isEnMarcha() {
		return enMarcha;
	}
	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public double getVelocidadActual() {
		return velocidadActual;
	}
	public int getRpmMaxima() {
		return rpmMaxima;
	}
	public int getRpmActual() {
		return rpmActual;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setEnMarcha(boolean enMarcha) {
		this.enMarcha = enMarcha;
	}
	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public void setVelocidadActual(double velocidadActual) {
		if(velocidadActual < 0) velocidadActual = 0;
		else if(velocidadActual > velocidadMaxima) velocidadActual = velocidadMaxima;
		else this.velocidadActual = velocidadActual;
	}
	public void setRpmMaxima(int rpmMaxima) {
		this.rpmMaxima = rpmMaxima;
	}
	public void setRpmActual(int rpmActual) {
		//Lo mismo que en setVelocidadActual, pero usando max y min: 
		this.rpmActual = Math.min(Math.max(0,rpmActual), this.rpmMaxima);
	}
	public void setMarcha(int marcha) {
		this.marcha = Math.min(Math.max(0,marcha), 5);
	}
	@Override
	public String toString() {
		return (enMarcha ? "En marcha" : "Parado") + 
				" - V.Max: " + velocidadMaxima + 
				" - V. Actual: " + velocidadActual + 
				" - RPM. Max: " + rpmMaxima + 
				" - RPM Actual: " + rpmActual + 
				" - Marcha: " + marcha ;
	}
	
	public void arrancar(){
		if(!enMarcha){
			enMarcha = true;
		}
	}
	public void apagar(){
		if(enMarcha){
			enMarcha = false;
			velocidadActual = 0;
			rpmActual = 0;
			marcha = 0;
		}
	}
	public void acelerar(double v){
		if(enMarcha){
			setVelocidadActual(velocidadActual + v);
			setRpmActual((int)(rpmActual + v * 70));
		}
	}
	public void frenar(double v){
		if(enMarcha){
			setVelocidadActual(velocidadActual - v);
			setRpmActual((int)(rpmActual - v * 70));
			if(velocidadActual == 0) {
				rpmActual = 0;
				marcha = 0;
			}
		}
	}
	public void subirMarcha(){
		if(enMarcha && marcha < 5){
			marcha ++;
			setRpmActual((int)(rpmActual * 0.7));
		}
	}
	public void bajarMarcha(){
		if(enMarcha && marcha > 0){
			marcha --;
			setRpmActual((int)(rpmActual * 1.3));
		}
	}
	
	public double consumo() {
		double consumo = 0;
		if (marcha > 0) {
			consumo = (rpmActual / marcha) / 1000;
		}
		return consumo;
		
	}
	
	/**
	 * Calcula el tiempo (horas) necesario para recorrer
	 * cierta distancia a la velocidad actual del coche
	 * 
	 * @param km la distancia a recorrer
	 * @return las horas necesarias para recorrerla
	 */
	public double tiempoParaLlegar(double km) {
		return km / velocidadActual;		
	}

}
