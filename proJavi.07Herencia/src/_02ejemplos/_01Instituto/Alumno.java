package _02ejemplos._01Instituto;

public class Alumno extends Persona{
	
	private int numExpediente;
	private String grupo;
	
	public Alumno(String dni, String nombre ,int numExpediente, String grupo) {
		//La primera instrucción tiene que ser una llamada al constructor
		//de su clase padre.
		super(dni,nombre);
		this.numExpediente = numExpediente;
		this.grupo = grupo;
	}

	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + numExpediente + " - " + grupo;
	}
	
	
	

}
