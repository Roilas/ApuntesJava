package TryCatch;

public class Principal {
	
	String Nombre;
	
	private void Proceso1() {
		int a = 7, b = 0;
		double division = a/b;
		System.out.println(division);
	}
	
	public void Metodo1() {
		try {
			Metodo2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Metodo2() throws Exception {
		Metodo3();
	}
	
	
	//IMPORTANTE: Al poner a un metodo "throws Exception" Lanzara los errores que pueda tener a el metodo superior
	public void Metodo3() throws Exception{
		try {
			System.out.println("El infinito: " + (1/0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el metodo 3, datos de texto");
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void main (String [] args) {
		
		/*
		 * TRY CATCH: Establece unos argumentos en "Try" y si no se puede ejecutar se ejecutara el "catch".
		 * Luego siempre se ejecutara el "Finally"
		 */
		
		
		
	try {
		Principal us = new Principal();
			us.Proceso1();
	
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	finally{
		System.out.println("Tarea finalizada");
	}
		
	

		
		
	}

}
