
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creo una variable que va a tener el valor de la funcion sumaNumeros
		//va a tener el valor que devuelva la funcion
		//asi como definimos a abajo en los parametros de la funcion
		//que va a recibir 2 numeros.
		//le tengo que agregar 2 numeros a la funcion para que funciones
		// como ejemplo 5 y 8
		int suma = sumaNumeros(5, 8);
		
		System.out.println("El resultado de la suma es:"+ suma);
	
		
	}
	
	//Funcion que recibe parametros y devuelve un valor:
	// creo una funcion que va a sumar 2 numeros
	//modiicador de acceso, palabra reservada, tipodevariable, nombre de la funcion
	//dentro de los parentesis de la funcion le indico que va a recibir 2 valores
	public static int sumaNumeros(int num1, int num2) {
		//creo una variable para que sume ambos resultados
		int resultado = num1 + num2;
		//lo que va a devolver a la funcion va a ser la variable return
		return resultado;
	}

}
