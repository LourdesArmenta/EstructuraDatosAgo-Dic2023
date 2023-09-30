package colas;

public class Cola<T> {
	//Atributo cabeza, que apunta al primer elemento de la cola
	private Nodo<T> cabeza;
	//Atributo cola, que apunta al ultimo elemento de la cola
	private Nodo<T> cola;
	//Almacena el total de elementos de la cola
	private int tamanio;
	//Constructor por defecto
	public Cola() {
		cabeza=null;
		cola = null;
		tamanio = 0;
	}
	//verificar si la cola esta vacia
	public boolean esVacia() {
		return (cabeza == null);
	}
	//Encolar un elmento nuevo
	public void encolar(T valor) {
		//crear un nuevo Nodo
		Nodo<T> nuevo = new Nodo<T>();
		nuevo.setValor(valor);
		if (esVacia()) {
			//cabeza y cola apuntan a nuevo
			cabeza = nuevo;
			cola = nuevo;
			
		}else {
			//se enlaza el campo siguiente de cola con el
			//nuevo elemento
			cola.setSiguiente(nuevo);
			//la nueva cola pasa a ser el nuevo
			cola = nuevo;
		}
		//Incrementa el tamanio porque hay un nuevo elemento
		tamanio++;	
		
	}
	//Elimima el primer elemento de la cola
	public void desencolar() {
		//si no es vacia
		if(!esVacia()) {
			//verificar si hay un solo elemento en la cola
			if(cabeza==cola) {
				cabeza = null;
				cola = null;
				
			}
			else {
				//se elimima el primer elemento de la cola
				//desplazando ls cabeza al siguiente nodo
				cabeza = cabeza.getSiguiente();
			}
			//Se disminuye el tamanio
			tamanio --;
		}
	}
	//devolver el primer elmento de la cola
	public T frente() {
		if (!esVacia()) 
			return cabeza.getValor();
		else
			return null;
		
	}

}
