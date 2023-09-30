package pilas;

public class ClienteMain {

	public static void main(String[] args) {
		//Crear una nueva pila de Enteros
		Pila<Integer> pila2 = new Pila<Integer>();
		//apilar elementos
		pila2.apilar(2);
		pila2.apilar(5);
		pila2.apilar(7);
		System.out.println("El tope de la pila es "+pila2.cima());
		//Desapilo
		pila2.retirar();
		System.out.println("El tope de la pila es "+pila2.cima());
		pila2.retirar();
		System.out.println("El tope de la pila es "+pila2.cima());
		pila2.retirar();
		System.out.println("El tope de la pila es "+pila2.cima());

	}

}
