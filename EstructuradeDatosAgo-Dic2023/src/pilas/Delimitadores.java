package pilas;

/**
 * Esta clase evalua si una cadena  tiene correctamente
 * escritos los delimitadores:{,(,[,/* con sus correspondientes
 *  pares de cierre:},),] y *'/
 * @author : Maria Lourdes Armenta Lindoro
 * @version: 1.0
 * 
 */

public class Delimitadores {
	//Evalua si una cadena tiene los delimitadores correctos
	/**
	 * 
	 * @param cadena La cadena que se va a evaluar
	 * @return Devuelve true si la cadena es valida y false si la 
	 *         cadena es incorrecta
	 */
	
	public boolean evaluacionDelimitadores(String cadena) {
	   Pila<String> pcaracteres = new Pila<String>();
	
	   int i = 0;
	   boolean masElementosPorLeer = true;
	   while (i<cadena.length() && masElementosPorLeer)
	   {
		   char car = cadena.charAt(i);
		   String s = charToString(car);
		   i++;
		   switch (car) 
		   {
		    //En caso de Apilar
		    case '(':{
		       pcaracteres.apilar(charToString(')'));
		        break;
		    }
		    case '[':{
		       pcaracteres.apilar(charToString(']'));
		       break;
		    }
		    case '{':{
		       pcaracteres.apilar(charToString('}'));
		       break;
		    }
		    case '/':{
		       if (siguienteEsAsterisco(cadena,i)) {
		          pcaracteres.apilar(charToString('/'));
		       i++; 
		       }
		       break;
		    }
		  //Para Desapilar
		    case ')':
		    case ']':
		    case '}':
		    { 
		       //comparar que corresponda
		       String aux = pcaracteres.cima();
		       if (aux!=null)
		       {
		    
		       if(s.compareTo(aux)==0)
		       {
		          //hay correspondencia por lo tanto
		          //lo elimino
		          pcaracteres.retirar();
		       }
		       else
		       {
		          masElementosPorLeer = false;
		       }
		    }
		       else
		       {
		          masElementosPorLeer = false;
		       }
		    }
		    case '*':{
		       if (siguienteEsDiagonal(cadena,i)) {
		          pcaracteres.retirar();
		          i++; 
		       }
		     }
		    }
		  }
		 //Si la Pila aún tiene elementos es un Error
		 if (pcaracteres.esVacia() &&   masElementosPorLeer)
            return true;
		 else
		    return false;
	} //Termina método
	/**
	 * 
	 * @param cadena Es la cadena a evaluar
	 * @param posicion
	 * @return Devuelve true si el siguiente caracter de la cadena es *
	 *         y false siel siguiente caracter de la cadena es No es * 
	 */
   private static boolean siguienteEsAsterisco(String cadena, int posicion) {
	   char car = cadena.charAt(posicion);
	   if (car=='*')
	      return true;
	   else
	   return false;
	}
   /**
    * 
    * @param cadena Es la cadena a evaluar
    * @param posicion
    * @return Devuelve true si el siguiente caracter de la cadena es /
	*         y false si el siguiente caracter de la cadena es No es / 

    */
	private static boolean siguienteEsDiagonal(String cadena, int posicion) {
	   char car = cadena.charAt(posicion);
	   if (car=='/')
	      return true;
	   else
	      return false;
	}
	/**
	 * convierte un char a un objeto tipo String
	 */
	private static String charToString(char ch) {
	   return String.valueOf(ch);
	}
}