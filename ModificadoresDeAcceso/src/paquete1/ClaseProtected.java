package paquete1;

public class ClaseProtected {	//Solo clases que hereden, pueden acceder a los metodos y atributos de ClaseProtected, nunca de clases en misma jerarquia o superiores
	private int edad;

	protected int getEdad() {
		return this.edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}
}
