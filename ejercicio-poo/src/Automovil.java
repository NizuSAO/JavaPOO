
public class Automovil {

	
	//atributos o caracteristicas
	String marca;
	int modelo;
	int precio;
	
	boolean estado = false;
	
	//definicion de constructor
	public Automovil() {
		System.out.println("Se creo un zentorno");
	}
	
	
	
	//meotodos o acciones
	
	public void encender() {
		if(estado == true) {
			System.out.println("El automovil ya esta encendido");
			
		}else{
			System.out.println("El automovil se ha encendido");
			estado = true;		
		}
		
	}
	
	public void apagar() {
		if(estado = true) {
			System.out.println("El automovil se apago");
			estado = false;
		}else {
			System.out.println("El automovil ya esta apagado");
		}
	}
	
	public void avanzar() {
		if(estado == true) {
			System.out.println("El Automovil avanzo 200 km/H");
		}else {
			System.out.println("El automovil no puede avanzar esta apagado");
			
		}
		
	}
	
}
