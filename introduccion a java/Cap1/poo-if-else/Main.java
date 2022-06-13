
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		
		
		//if-else , es una sentencia o estructura de control
		/*Que nos va a ayudar a identificar el resultado correcto
		 * if= si, else= entonces,
		 * dentro del if va una condicion, si no se cumple esa condicion
		 * que se ejecute el else la condicion de abajo
		 */
		
		//Metodo 1
		// num > 10 = true
		//num < 10 = false
		
		if(num < 10) { //true or false , verdadero o falso
			
			//instrucciones
			System.out.println("El numero es menor a 10");
			
		}else {
			
			//instrucciones
			System.out.println ("El numero es mayor a 10");
		}
		
			//Metodo 2
			//Poniendo dentro del if false o true
		if(false) {
			System.out.println ("El numero es mayor a 10");
			System.out.println ("true");
		}else {
			System.out.println ("El numero es menor a 10");
			System.out.println ("false");
		}
	}
}
