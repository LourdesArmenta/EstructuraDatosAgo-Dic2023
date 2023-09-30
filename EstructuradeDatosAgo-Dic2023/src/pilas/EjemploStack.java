package pilas;
import java.util.Stack;


public class EjemploStack {

	public static void main(String[] args) {
		// Crea una nueva pila de enteros
		Stack<Integer> pila = new Stack<Integer>();
		//se apilan algunos dato
		pila.push(2);
		pila.push(5);
		pila.push(7);
		//Consultar cima
		System.out.println("El tope de la pila es:"+pila.peek());
		//Se desapila
		pila.pop();
		System.out.println("El tope de la pila es:"+pila.peek());
		pila.pop();
		System.out.println("El tope de la pila es:"+pila.peek());
		pila.pop();
		if (pila.empty())
			System.out.println("Pila Vacia");
		System.out.println("El tope de la pila es:"+pila.peek());

	}

}
