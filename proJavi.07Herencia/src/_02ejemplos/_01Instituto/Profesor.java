package _02ejemplos._01Instituto;

public class Profesor extends Persona{
	
	
	private String especialidad;
	
	public Profesor(String dni, String nombre ,String especialidad) {
		//La primera instrucción tiene que ser una llamada al constructor
		//de su clase padre.
		super(dni,nombre);

		this.especialidad = especialidad;
	}
	
	public Profesor(String dni, String nombre) {
		//Si un constructor llama a otro, ya no hay que llamar a super()
		this(dni, nombre, "SIN ESPECIALIDAD"); 
	}

	

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		
			this.especialidad = especialidad;
	}
	
	@Override
	public String toString() {
		return super.toString() +  " - " + especialidad;
	}
	
	
	

}
