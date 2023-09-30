package colas;

public class ClienteMain {

	public static void main(String[] args) {
		//Crear una nueva cola de enteros
		Cola<Integer> cola = new Cola<Integer>();
		//se encolan algunos elementos
		cola.encolar(12);
		cola.encolar(13);
		cola.encolar(14);
		cola.encolar(15);
		cola.encolar(18);
		//Imprimir el primer elemento de la cola
		System.out.println("El primer elemento de la cola = "+
		             cola.frente());
		cola.desencolar();
		//Imprimir el primer elemento de la cola
		System.out.println("El primer elemento de la cola = "+
		             cola.frente());
		cola.desencolar();
		//Imprimir el primer elemento de la cola
		System.out.println("El primer elemento de la cola = "+
		             cola.frente());
		cola.desencolar();
		//Imprimir el primer elemento de la cola
		System.out.println("El primer elemento de la cola = "+
		             cola.frente());
		cola.desencolar();
		//Imprimir el primer elemento de la cola
		System.out.println("El primer elemento de la cola = "+
		             cola.frente());
		
		
		

	}

}
