package arreglos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arreglo es una coleccion de variables del mismo tipo
		//un arreglo nos va a permitir agrupar variables
		//es como si dentro de una misma variables pusieras 10 cajas
		
		//tipo[] nombreArreglo = new tipo[tamañoArreglo];
		
		//int entre corchetes, arreglos y en new int[10] este es el tamaño del arreglo
		int[] arregloEnteros = new int[10];
		
		//en arreglos el primer indice es 0
		//osea la posicion 1 es la posicion 0 y la posicion 10 contando del 0 es 9
		
		arregloEnteros[0] = 10;
		arregloEnteros[1] = 10;
		arregloEnteros[2] = 10;
		arregloEnteros[3] = 10;
		arregloEnteros[9] = 80;
		
		System.out.println(arregloEnteros[9]);
	}

}
