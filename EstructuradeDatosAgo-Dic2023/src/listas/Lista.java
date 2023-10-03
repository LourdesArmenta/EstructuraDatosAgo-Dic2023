/**
 * 
 */
package listas;

/**
 * @author lourdesarmenta
 *
 */
public class Lista<T> {
	//Primer element o de la lista
	private Nodo<T> cabeza;
	//Total de elementos de la lista
	private int tamanio;
	//Constructor por defecto
	public Lista() {
		cabeza = null;
		tamanio = 0;
	}
	public int getTamanio() {
		return tamanio;
	}
	/*
	 * Consulta si la lista esta vacia
	 * @return true cuando esta vacia, false cuando no
	 */
	public boolean esVacia() {
		if (cabeza == null)
			return true;
		else
			return false;	
	}
	/**
	 * Agrega un nuevo nodo al final de la lista
	 * @param valor valor del elemento a agregar
	 */
	public void agregar(T valor) {
		Nodo<T> nuevo = new Nodo<T>();
		nuevo.setValor(valor);
		if(esVacia()) {
			cabeza = nuevo;
		}
		else {
			//Agregar al final de la lista
			Nodo<T> aux =cabeza;
			while (aux.getSiguiente() !=null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
		}
		tamanio++;
		
		
	}
	public void insertar(T valor, int pos)  throws PosicionIlegalException{
		if (pos>=0 && pos<=tamanio) {
			Nodo<T> nuevo = new Nodo<T>();
			nuevo.setValor(valor);
			if (pos == 0) {
				nuevo.setSiguiente(cabeza);
				cabeza = nuevo;
			} else {
				
			}
			
			
			
		}
		else {
			throw new PosicionIlegalException();
			
		}
	}
	
	
	

}
