package poo;

public class Usuario {
	
	//atributos o caracteristicas
	String nombre;
	String apellido;
	String apodo;
	int edad;
	int altura;
	int peso;
	
	boolean estado = false;
	
	public Usuario() {
		System.out.println("Los usuarios entraron a la red, listos para duelo de discos");
	}
	
	//metodos o funciones
	public void lanzar(){
		if(estado == true) {
			System.out.println("Contendiente en guardia");
			
		}else{
			System.out.println("Disco lanzado");
			estado = true;		
		}
		
	}
	
	public void bloqueo() {
		
		if(estado == true) {
			System.out.println("Impacto de disco");
			
		}else{
			System.out.println("Ataque bloqueado");
			estado = true;		
		}
		
	}
	
	public void contra() {
		if(estado == true) {
			System.out.println("Kill");
			
		}else{
			System.out.println("Contrataque");
			estado = true;		
		}
		
	}
	public void Win() {
		if(estado == true) {
			System.out.println("Perdiste");
			
		}else{
			System.out.println("Ganador Usuario");
			estado = true;		
		}
		
	}
	
}
