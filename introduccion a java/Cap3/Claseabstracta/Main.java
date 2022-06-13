
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//las clases abstractas no se pueden instanciar
		//las clases abstractas nos van a servir para declarar metodos y atributos
		//y estos puedan ser utilizados en las clases que heredan
		
		
		//suponete el metodo area y lo puedo usar en circulo y cuadrado
		
		//Como la clase abstracta no se puede instanciar instancio
		//la clase con el metodo constructor de una clase hija
		Figura fig = new Cuadrado();
		
		
		
		//Figura fig2;
		//aca no instanciamos la clase solo le decimos al programa
		//que nos guarde un espacio de memoria sin inicializar la clase
		
		//la sentencia new, lo unico que hace es a crear objetos llamando
		//al constructor de una clase, 
		//y recordar siempre definir bien los parametros del metodo constructor
		//que quieren que se ejecute
		
		fig.area();
		
		/*POLIMORFISMO
		 * SUPONGAMOS QUE HEREDAMOS UN METODO DE UNA CLASE
		 * Y LO SOBRE ESCRIBIMOS, EL HECHO DE HEREDAR UN METODO Y
		 * MODIFICARLO O DARLE OTRO PROPOSITO ES POLIMORFISMO
		 * ES EL MISMO METODO PERO CON DIFERENTES CARACTERISTICAS
		 * 
		 * Click derecho en la clase, vamos hasta Source y
		 * hasta el apartado Override/implement Methods
		 * vamos a sobre escribir o implementar metodos.
		 * 
		 * Override le va indicar al compilador que el metodo se esta sobreescribiendo
		 * 
		 * 
		 * Seleccionamos el metodo, y listo simplemente lo modificamos
		 * 
		 * 
		 * recorda que para ejecutar el metodo de la clase que sobreescribiste
		 * en la instancia de la clase recorda poner el metodo constructor correspondiente
		 * a la clase y al metodo
		 */

	}

}
