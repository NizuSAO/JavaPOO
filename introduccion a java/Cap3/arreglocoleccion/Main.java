import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Colecciones
		//Arraylist
		/*
		 * va a guardar la informacion mediante una lista
		 * osea para añadir un valor no necesitamos definir una posicion
		 * el numero que va dentro de los parentesis del arraylist
		//es el tamaño del arreglo, para delimitar el tamaño del arreglo
		//ejemplo 10, el tamaño del arreglo va a ser de 10 posiciones
		 */
		ArrayList datos = new ArrayList();
		
			//insertar datos
		datos.add(5);
		datos.add(10);
		datos.add(8);
		
		
		//llenar array listo mediante el ciclo for
		//va añadir enteros desde el 1 hasta el 10
		for(int i = 0; i < 10; i++) {
			datos.add(i + 1);
			System.out.println(datos);
		}
		//dentro del get ponemos la posicion que queremos que muestre
		//System.out.println(datos.get(1);
		//Nos va a devolver el tamaño del arreglo
		//System.out.println(datos.size));
		
		//Stack - pila
		//ingresa elementos sobre una estructura y los va apilando uno
		//encima del otro
		//Push - insertar elementos en la parte posterior de la pilas
		//Pop - Eliminar elementos
		
		Stack mipila = new Stack();
		
		mipila.push("Gile");
		mipila.push("carmen");
		//el ultimo elemento ingresado va a ser el primero
		// porque se van apilando como platos
		mipila.push("Rosaria");
		
		//definimos una variable la igualamos con el objeto y el metodo pop
		//pop nos va a eliminar el ultimo valor que ingresamos 
		//en este caso Rosaria.
		String elemento;
		elemento = (String)mipila.pop();
		
		System.out.println(mipila);
		
		//Queue - cola
		//es una lista, pero en este caso va a ser al contrario de pila
		//como la pila de platos solo que esta vez quitamos el primer plato
		//y en pila quitabamos el ultimo plato
		//osea se apilan a la inversa
		//add para insertar elementos
		//poll para eliminar el primer elemento de la pila
		//peek . consulta para saber cual es el primer elemento
		
		// Queue es una interface no una clase por eso no se puede instanciar
		
		Queue cola = new LinkedList();
		
		cola.add(5);
		cola.add(10);
		cola.add(15);
		
		//eliminamos el primer elemento de la lista que es 5
		System.out.println(cola.poll());
		//imprimimos la lista
		System.out.println(cola);
		
		
		
		//HashTable
		//valores y llaves, como una tabla de base de datos
		
		//al  no definir las variables, puedo añadir cualquier tipo
		//de llave a la lista
		Hashtable tabla = new Hashtable();
		
		//defino un hastable que solo va a contener enteros y cadenas
		//Hashtable<Integer, String> tabla2 = new Hashtable<>();
	
		//mediante el metodo put agrego valor a la lista
		// le agrego una llave y el valor
		// y mediante la llave yo accedo al valor
		tabla.put(1,"Apple");
		tabla.put(2, "Sony");
		tabla.put(3,"Huawei");
		tabla.put("BW", 400);
		
		//accedo a Sony por medio de la llave 2
		System.out.println(tabla.get(2));
		System.out.println(tabla.get("BW"));
	}

}
