package retonro_valor;

public class Transporte {
	
	int precio;
	String nombre="";

	/*Declaro que el precio del metodo constructor sea el mismo que el de la clase del constructor*/
	public Transporte(int precio, String nom) {
		System.out.println("Transporte creado");
		this.precio = precio;
		this.nombre = nom;
		
	/* Configuramos el metodo constructor*/
		
		/*Que me retorne el valor del metodo constructor*/
	}
	public int precio(){
		//Instrucciones de una funcion que devuelve un valor
		return this.precio;
	}
	
	public String nombre() {
		return this.nombre;
		
	}
	
}

	
