package StringBuilderr;

public class StringBuildd2 {
	
	public static void main (String[]args) {
		//String Texto = "Wenas gente";
		//Texto += " que" + " pasa.";
		
		
		long tiempo_inicio = System.currentTimeMillis();
		
		StringBuilder PrimerContructorTexto = new StringBuilder();
		
System.out.println("Comienza la cuenta:");

		for (int i=0; i < 10_000_000; i++){
			PrimerContructorTexto.append(i);
			
		}
		

		
		System.out.println("Tarea finalizada");
		
		long tiempo_fin = System.currentTimeMillis();
		long diferencia = tiempo_fin - tiempo_inicio;
		System.out.println(diferencia);
		
		
		//System.out.println(Texto);
		

		//PrimerContructorTexto.append("Primer fragmento, ").append("segundo fragmento, ").append(" y el tercero...");
		//System.out.println(PrimerContructorTexto);
		//PrimerContructorTexto.append("Y le añado otro porque me da la gana");
		//System.out.println(PrimerContructorTexto);
	}

}
