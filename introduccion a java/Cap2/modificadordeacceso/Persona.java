package modificadoresdeacceso;

public class Persona {
	
	//constructor
	public Persona() {
		
		System.out.println("Bienvenido a Sword art online");
		
	}

	//Atributos
	/*A los atributos tambien se le pueden poner modificaciores de acceso*/
	/* un modificador nos va a permitir o restringir el acceso a ciertos atributos de una clase*/
	public String name ="Kirito";
	public int edad = 18;
	
	//metodos
	public void age() {
		System.out.println("Bienvenido:"+ name);
	}

}
