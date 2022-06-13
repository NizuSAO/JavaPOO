package funciones;

public class Main {
	
	/*Funcione es un bloque de codigo que se ejecuta dependidendo la situacion*/
	/*Las llaves de las funciones son lo que abre y cierra el bloque de codigo*/
	//Tipos de funciones:
	//ejecutan codigo
	//ejecutan codigo y devuelven un valor
	//reciben un valor
	//reciben valor y devuelven un valor
	
	public static void main(String[] args) {
		
		
		int res = 0;
		
		//Funcion main o funcion principal osea todo lo que ejecute el
		/*el programa va dentro de la funcion principal*/
		
		// TODO Auto-generated method stub
		
		System.out.println("ESTA ES LA PRINCIPAL");
		
		//llamada a otra funcion
		hola();
		//igualo mi varaible res al valor que me esta devolviendo la funcion
		res = chape();
		System.out.println(res);
	}
	
	/*La funcion tiene que ir acompañado por la palabra reservada public y void y el nombre de la funcion hola*/
	/*modificador de acceso: y el retorno de valor de la funcion, mas el nombre de la funcion*/
	
	/*Estructura de una funcion
	 * modificador TipoDevolver nombreFuncion(Valores Recibir){
	 * 
	 * instrucciones de la funcion
	 * 
	 * }
	 */
	//ejecutan codigo
	public static void hola(){
		//instrucciones
		int var = 0;
		System.out.println("hola:"+var);
		
		/* dentro de los parentesis de la funcion van los parametros*/
	}
	//Funciones que devuelven valor
	public static int chape() {
		return 5;
	}

}
