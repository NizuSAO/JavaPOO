package poo;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Inicio del programa");

		Usuario boy = new Usuario();
		
		Usuario girl = new Usuario();
		
		boy.lanzar();
		girl.bloqueo();
		girl.lanzar();
		boy.lanzar();
		boy.bloqueo();
		girl.contra();
		boy.win();
	}
	//Que es un objeto
	/*Un abstracccion de la realidad*/
	
	//Que es una clase
	/* la abstraccion de ese objeto en un lenguaje de programacion, tambien es como un molde donde crearas mas objetos*/
	

}
