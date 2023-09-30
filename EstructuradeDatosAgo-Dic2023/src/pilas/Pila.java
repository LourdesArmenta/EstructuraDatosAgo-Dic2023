package pilas;

public class Pila <T> {
	//Atributo cabeza, que apunta al topo de la pila
	private Nodo<T> cabeza;
	//almacena el total de elementos de la pila
	private  int tamanio;
	//constructor por defecto
	public Pila() {
		cabeza = null;
		tamanio = 0;
	}
	//devuelve el tamaño de la pila
	public int getTamanio() {
		return tamanio;
	}
	//Verificar si la pila esta vacia
	public boolean esVacia() {
		return (cabeza==null);
	}
	//Apilar un nuevo elemento
	public void apilar(T valor) {
		//Crear un nuevo nodo
		Nodo<T> nuevo = new Nodo<T>();
		//Fijar el valor al dentro del nodo
		nuevo.setValor(valor);
		if(esVacia()) {
			//cabeza apunta al nuevo nodo
			cabeza = nuevo;
		}
		else {
			//se enlaza el campo siguiente al nuevo con la cabeza
			nuevo.setSiguiente(cabeza);
			//la nueva cabeza de la pila pasa a ser el nuevo
			cabeza = nuevo;
		}
		tamanio++;
	}
	public void retirar() {
		if(!esVacia()) {
			cabeza = cabeza.getSiguiente();
			tamanio--;
					
		}
	}
	public T cima() {
		if (!esVacia()) {
			return cabeza.getValor();
		}
		else
			return null;
	}
	

}
