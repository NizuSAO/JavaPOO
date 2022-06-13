package arreglosciclofor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//tipo[] nombreArreglo = new tipo[tamañoArreglo];
		int[] arregloEnteros = new int[10];
		
		//for para llenar arreglo con un ciclo for
		for(int z = 0; z < 10; z++) {
			arregloEnteros[z] = z + 1;
		}
		
		//FOR para que muestre el arreglo
		for(int i = 0; i < 10; i++) {
			System.out.println(arregloEnteros[i]);
		}
		
	}

}
