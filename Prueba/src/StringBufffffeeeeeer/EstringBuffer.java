package StringBufffffeeeeeer;

public class EstringBuffer {


	//Es como el StringBuilder para se usa para "sincronizar" en varios hilos. Usa lo mismos comandos.
	// El StringBuilder por eso es "Thread Safe"
	
	public static void main (String[]args) {
	
	StringBuffer TextoEnBuffer;
	
	StringBuffer PrimerContructorTexto = new StringBuffer();
	
	PrimerContructorTexto.append("Primer fragmento, ").append("segundo fragmento, ").append(" y el tercero...");
	System.out.println(PrimerContructorTexto);
	PrimerContructorTexto.append("Y le añado otro porque me da la gana");
	System.out.println(PrimerContructorTexto);
	
	
	}

}
