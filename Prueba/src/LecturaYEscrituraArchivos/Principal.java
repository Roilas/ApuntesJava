package LecturaYEscrituraArchivos;

import java.io.File;
import java.io.IOException;



public class Principal {
	
	public static void main(String[]args ) {
		File Archivo = new File("C:\\Users\\Biblioteca 313\\eclipse-workspace\fichero.txt");
		try {
			System.out.println("Creado fichero? " + Archivo.createNewFile());
		} catch (IOException e) {
		}
		
			System.out.println("Existe el fichero? " + Archivo.exists());
		
		
	}
	

	

}
	

