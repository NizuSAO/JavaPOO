package encapsulacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automovil Auto = new Automovil();
		
		Auto.setMarca("Ferrari");
		System.out.println("El auto es de marca" + Auto.getMarca());
		
		Auto.setPrecio(1000000);
		System.out.println("El precio del auto es:" + Auto.getPrecio());
		
		/*Encapsulamiento es Privatizar los atributos*/
		/*Y acceder a los atributos mediante metodos getters y setters*/
	}

}
