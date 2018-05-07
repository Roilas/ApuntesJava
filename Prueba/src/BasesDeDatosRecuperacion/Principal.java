package BasesDeDatosRecuperacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String []args) throws Exception{
		
		List<persona> ListaPersonas = new ArrayList<>();
		
		
		
		// Para que esto funcione hay que bajarse la libreria de MySQL java mave
		// luego añadirla al proyecto click derecho-> Build path
		
		// Esto es la constante mySQL java, SIEMPRE es igual

		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		
		
		
		
		
		// Esto pregunta para acceder a la base de datos, en este caso la base "dbtest"
		final String DB_URL = "jdbc:mysql://localhost:3306/dbtest";
		
		//Esto es usuario y contraseña
		final String USER = "root";
		final String PASS = "123456789";
		
		/*****************************************************************/
		
	
		// Se utiliza el select.* persona
		
		// obtendriamos todos los registros de la base de datos persona
		
		
		
		/**************************************************************************************/
		
		// Recogemos lso datos
		
		
Connection conexion = null;
		
		//Esto lee.
		String sql = "SELECT * FROM persona";
		
	
		
		try {
			Class.forName(JDBC_DRIVER); // Registra el driver
			
			//Creamos un objeto conexion y lo conectamos a nuestra base de dado "dbtest" establecido arriba aqui es "DB_URL"
			//Ademas introducimos el usuario y contraseña tambien establecidos arriba
			conexion = DriverManager.getConnection(DB_URL,USER,PASS);
			
			// Aqui añadimos un statement (declaracion) en la que metemos un linea de texto "sql"
			//Arriba eta establecido como esa linea mete el comando para leer la tabla.
			PreparedStatement st = conexion.prepareStatement(sql);
			
			// Para añadir los resultados creamos la clase "Persona" porque los datos de la base necesitan una equivalencia
			
			ResultSet Resultado = st.executeQuery();
			
			while(Resultado.next()) {
				persona p = new persona();
				
				// Esto es una manera
				int x1 = Resultado.getInt("id");
				p.setId(x1);
				String x2 = Resultado.getString("nombre");
				p.setNombre(x2);
				
				// Y esto otra
				
				//	p.setId(Resultado.getInt("id"));
				//	p.setNombre(Resultado.getString("nombre"));
				
				ListaPersonas.add(p);
				
				
				
			}
			
			Resultado.close();
			st.close();
			/*************************************************************/
			
		}catch(Exception e) {
			
			System.out.println("Excepcion: " + e.getMessage());
			
			//if (conexion != null && !conexion.isClosed() ) {

			
		}finally {
			
			System.out.println(ListaPersonas);
			
			if(conexion != null) {
				if(!conexion.isClosed()) {
					
				}
			}
			
		}
		
		
		
		
		
	}
	
}
