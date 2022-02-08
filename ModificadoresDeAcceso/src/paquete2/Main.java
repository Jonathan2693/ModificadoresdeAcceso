package paquete2;
import paquete1.*;

/*import paquete1.ClaseProtected;
import paquete1.ClaseDefault;*/	//Ya no se importa por clases individuales, porque con *ya esta referenciados

public class Main extends ClaseProtected{

	public void main(String[] args) {
		/*ClaseDefault cd = new ClaseDefault();*/
		ClasePrivada cp = new ClasePrivada();
		cp.setNombre("jonathan");
		System.out.println(cp.getNombre());
		Main principal = new Main();
		principal.setEdad(18);	//Ejemplo de protected, como main hereda de ClaseProtected, puede acceder a setEdad() aunque sea protegido
		System.out.println(principal.getEdad());
	}
}
