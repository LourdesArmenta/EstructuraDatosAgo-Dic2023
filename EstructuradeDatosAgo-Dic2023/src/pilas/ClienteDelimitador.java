package pilas;

public class ClienteDelimitador {

	public static void main(String[] args) {
		Delimitadores del = new Delimitadores();
		//String cadena = "while (m<(n[8]+0)) {"+
		//	             " int p=7;"+
		//	             " /*comentarios*/"+
		//	             "} "; 
	    //
		//String cadena = "while (m<(n[8]+0)) {"+
	    //         " int p=7;"+
	    //        " /*comentarios*/"+
	    //       " ";
		//String cadena = "while (m<(n[8)+0)) {"+
	    //         " int p=7;"+
	    //         " /*comentarios*/"+
	    //         "} ";
		String cadena = "(m<(n[8]+0)) ";


		if (del.evaluacionDelimitadores(cadena))
			System.out.println("Evaluación válida");
		else
			System.out.println("Evaluación Inválida");
			
		
		

	}

}
