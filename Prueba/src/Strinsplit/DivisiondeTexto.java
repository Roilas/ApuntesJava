package Strinsplit;

public class DivisiondeTexto {
	
	
	public static void main (String []args) {
		
		String cadena3 = "Pedro;Paco;Juan;Luis";
		String[] extraccion3 = cadena3.split(";",3);	
		
		for(String elemento : extraccion3) {
			System.out.println(elemento);
		}
		
		
	}

}
