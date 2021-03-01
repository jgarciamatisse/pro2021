package _02ejemplos._02cuentas;

public class Cuenta {
	private String usuario;
	private String contrasenya;
	
	//Constructor
	public Cuenta (String u, String c) {
		this.usuario = u;
		this.contrasenya = c;
	}
	
	public String toString() {
		return usuario + " - " +  contrasenya.replaceAll(".","*");
	}
	
	public void setContrasenya(String antigua, String nueva) {
		if(this.contrasenya.equals(antigua)) {
			this.contrasenya = nueva;
		}
	}
	
	

}
