package pilas;

public class ClienteDelimitado {

	public static void main(String[] args) {
		Delimitadores objDel = new Delimitadores();
		String exp = "(a+b)/2";//VALIDA
		if (objDel.evaluacionDelimitadores(exp))
			System.out.println("Expresion VALIDA");
		else
			System.out.println("Expresion INVALIDA");
		exp = "(a+b/2";
		if (objDel.evaluacionDelimitadores(exp))
			System.out.println("Expresion VALIDA");
		else
			System.out.println("Expresion INVALIDA");
		exp = "while (m<(n[8]+0)) {"+
			  "  int p=7" +
			  "  /*comentarios*/" +
			  "} ";
		if (objDel.evaluacionDelimitadores(exp))
			System.out.println("Expresion VALIDA");
		else
			System.out.println("Expresion INVALIDA");
		exp = "while (m<(n[8)+0)) {"+ //INVALIDO
				  "  int p=7" +
				  "  /*comentarios*/" +
				  "} ";
		if (objDel.evaluacionDelimitadores(exp))
			System.out.println("Expresion VALIDA");
		else
			System.out.println("Expresion INVALIDA");
		exp = "while (m<(n[8]+0)) {{"+ // INVALIDO
				  "  int p=7" +
				  "  /*comentarios*/" +
				  "} ";
		if (objDel.evaluacionDelimitadores(exp))
			System.out.println("Expresion VALIDA");
		else
			System.out.println("Expresion INVALIDA");
		

		
		
		

	}

}
