
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ciclos o estructuras repetitivas
		//ciclos while, do-while, for, foreach
		//while mientras
		
		int num = 0;
		
		
		while(num < 10) {// true o false
			//instrucciones repetir
			System.out.println("Hola mundo");
			//incremento
			num++;
		}
		
		// el while que es un ciclo, que dentro tiene un hola mundo,
		//el programa me va a imprimir hola mundo siempre y cuando.
		// la variable numero sea menor a 10
		// si la variable se incrementa hasta ser mayor que 10 se deja de ejecutar el while.
		
		//caracteristica principal de los ciclos
		// FINITUD -> finalizar
		
		do {
			//instrucciones solo se ejecutan 1 sola vez
			//aunque la condicion del while sea false
			System.out.println("hola");
		}while(false);
		
		//for - para
		//for(condicion de entrada; condiciondesalida, incrementodecremento)

		for(int number = 0; number < 10; number++) {
			
			//instrucciones
			System.out.println("Hola world");
		}
	}

}
