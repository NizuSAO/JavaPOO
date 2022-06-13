package encapsulacion;

public class Automovil {

	//Atrbutos
	private int precio;
	private String marca;
	
	//Constructor
	public Automovil() {
		System.out.println("Me he creado");
	}
	/*Encapsulacion es que una clase encapsula todos sus atributos, osea privados*/
	/*Solo se pueden acceder a esta clase a traves de metodos*/
	
	/*Metodos Getters y Setter */
	/*Getter un metodo que va a devolver un valor*/
	/*Un setter le va a asignar un valor*/
	
	/*Los Getters si van a retornar un valor*/
	public int getPrecio() {
		return this.precio;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	//metodos set
	/*Los metodos setters no van a retorna ningun valor por eso va void*/
	public void setPrecio(int p) {
		this.precio = p;
	}
	
	public void setMarca(String m) {
		this.marca = m;
	}
}
