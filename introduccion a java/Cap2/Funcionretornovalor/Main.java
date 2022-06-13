package retonro_valor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Instanciamos una clase con su clase, objeto y constructor*/
		Transporte Metrobus = new Transporte(25,"Kirito");
		
		int valor = 0;
		
		valor = Metrobus.precio();
		
		String name ="";
		
		name = Metrobus.nombre();
		
		System.out.println("La funcion devolvio el valor:" + valor + "bus " + name);
	}

}
