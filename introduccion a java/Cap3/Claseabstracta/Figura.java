
public abstract class Figura {
	
	
	//Private String nombre;
	
	//metodo constructor
	//El constructor es el primer metodo que se ejecuta al crear 
	//un objeto de este tipo de clase, dentro del constructor
	//vamos a poder las inicializaciones de variables
	//o los datos que requiera la clase de este tipo
	
	public Figura(){
		
		System.out.println("El objeto se creo");
		
	}
	
	//recordemos que con el polimorfismo podemos sobre escribir metodos
	//osea que podemos tener mas de un metodo constructor
	//con diferentes parametro
	
	public Figura(String nom) {
		//this.nombre = nom;
		//this en español esto, this te va permitir acceder a atributos
		//this hace referencia a los metodos y atributos dentro de nuestra clase
		//Pero solo de la clase a la que esta en este momento
		System.out.println("El objeto con nombre"+nom+"Se creo");
	}
	
	
	
	
	
	//declaracion de metodos
	public abstract void area(); {
	
		System.out.println("abstraccion");
	}
	
}
