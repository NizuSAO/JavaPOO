
public class Automovil {
	
	int precio = 0;
	String nombre = "";
	int numPasajeros = 0;
	
	
	public Automovil(int pre, String nom) {
		this.precio = pre;
		this.nombre = nom;
		
		System.out.println("se creo un automovil con precio:"+precio+"de la marca"+nombre);
	}
	
	public Automovil(int pre, String nom, int numP) {
		this.precio = pre;
		this.nombre = nom;
		this.numPasajeros = numP;
		
		System.out.println("se creo un automovil con precio:"+precio+"de la marca"+nombre+"y puede llevar:"+numPasajeros+"Pasajeros");
	}

}
