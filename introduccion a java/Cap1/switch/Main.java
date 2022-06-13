
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Switch - case
		//Estructura de control que permite definir varios casos de seleccion
		// dentro del  parametro switch va una variable o sentencia a valorar
		// y dentro de la funcion switch van a ir los casos
		
		
		int var = 0;
		String cadena = "D";
		
		
		switch(var) {
		case 0:
			//instrucciones dependiendo del caso
			System.out.println("la variable esta vacia");
		break;
		
		case 1:
			//instrucciones dependiendo del caso
			System.out.println("La variable tiene un 1");
		break;
		
		case 2:
			//instrucciones dependiendo del caso
			System.out.println("La variable tiene un 2");
		break;
		
		}
		
		//switch con variable tipo string
		
		switch(cadena) {
		case "A":
			//instrucciones dependiendo del caso
			System.out.println("la variable contiene A");
		break;
		
		case "B":
			//instrucciones dependiendo del caso
			System.out.println("La variable contiene B");
		break;
		
		case "C":
			//instrucciones dependiendo del caso
			System.out.println("La variable contiene C");
		break;
		
		//existe un case que es default,
		// que funciona si cualquiera de los anteriores casos no funcionara
		
		default:
			System.out.println("La variable es diferente de A, B o C");
			break;
		}
	}

}
