package BaseDeDatosPosgreAcceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Principal {

	public static void main(String []args) throws Exception{
		
		
		// Para que esto funcione hay que bajarse la libreria de MySQL java mave
		// luego añadirla al proyecto click derecho-> Build path
		
		// Esto es la constante mySQL java, SIEMPRE es igual

		//final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		
		final String JDBC_DRIVER = "org.postgresql.Driver";
		
		// Para acceder a postgree el comando seria
		
		// Esto pregunta para acceder a la base de datos, en este caso la base "dbtest"
		final String DB_URL = "jdbc:postgresql://localhost:5433/postgres";
		
		//Esto es usuario y contraseña
		final String USER = "postgres";
		final String PASS = "123456789";
		
		/*****************************************************************/
		
		/*
		
		Connection conexion = null;
		
		//Esto inserta otro valor que sera nombre "Mitocode" y pass "123"
		String sql = "INSERT INTO PERSONA(nombre,pass) " + "VALUES('VeteACagarmySQLyJAVA','123')";
		
		try {
			Class.forName(JDBC_DRIVER); // Registra el driver
			
			//Creamos un objeto conexion y lo conectamos a nuestra base de dado "dbtest" establecido arriba aqui es "DB_URL"
			//Ademas introducimos el usuario y contraseña tambien establecidos arriba
			conexion = DriverManager.getConnection(DB_URL,USER,PASS);
			
			// Aqui añadimos un statement (declaracion) en la que metemos un linea de texto "sql"
			//Arriba eta establecido como esa linea mete el comando para añadir un valor a la tabla.
			PreparedStatement st = conexion.prepareStatement(sql);
			st.executeUpdate();
			st.close();
			
			
			*/
		
		
		
		
		
		/**************************************************************************************/
		
		// Asi añadimos un dato a la base de datos.
		
		
Connection conexion = null;
		
		//Esto inserta otro valor que sera nombre "Mitocode" y pass "123"
		String sql = "INSERT INTO PERSONA(Nombre,Pass) " + "VALUES(?,?)";
		
		
		// En este comando se espera para introducir un valir en la consola para introducirlo
		Scanner sc = new Scanner(System.in);
		String nom = sc.next();
		
		try {
			Class.forName(JDBC_DRIVER); // Registra el driver
			
			//Creamos un objeto conexion y lo conectamos a nuestra base de dado "dbtest" establecido arriba aqui es "DB_URL"
			//Ademas introducimos el usuario y contraseña tambien establecidos arriba
			conexion = DriverManager.getConnection(DB_URL,USER,PASS);
			
			// Aqui añadimos un statement (declaracion) en la que metemos un linea de texto "sql"
			//Arriba eta establecido como esa linea mete el comando para añadir un valor a la tabla.
			PreparedStatement st = conexion.prepareStatement(sql);
			st.setString(1, nom);
			st.setString(2, "123");
			st.executeUpdate();
			st.close();
	
			/*************************************************************/
			
		}catch(Exception e) {
			
			System.out.println("Excepcion: " + e.getMessage());
			
			//if (conexion != null && !conexion.isClosed() ) {

			
		}finally {
			
			if(conexion != null) {
				if(!conexion.isClosed()) {
					
				}
			}
			
		}
		
		
		
		
		
	}
	
}
