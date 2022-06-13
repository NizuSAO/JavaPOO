
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		avion avi = new avion();
		
		//cuando al objeto le pongo punto puedo corroborar
		//que puedo usar los metodos de la clase avion
		avi.avanzar();
		
		//y efectivamente funciona
		/*
		 * Entonces que es la Herencia poder utilizar los metodos 
		 * y los atributos de una clase padre que nos va a permitir
		 * utilizar sus metodos y atributos, para nuestro fin
		 * y nos sirve para reutilizar codigo
		 */
		
		automovil mustaf = new automovil();
		mustaf.avanzar();
	}

}
