package BasesDeDatosRecuperacion2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BasesDeDatosRecuperacion.persona;

public class Principal {
	
	/*
	
	
	
	
	
	
			// Esto es la constante mySQL java, SIEMPRE es igual

			final String DriverSQLJava = "com.mysql.jdbc.Driver";
			
			
			// Esto pregunta para acceder a la base de datos, en este caso la base "dbtest"
			final String DireccionURLBaseDatos = "jdbc:mysql://localhost:3306/dbtest";
			
			//Esto es usuario y contraseña
			final String USER = "root";
			final String PASS = "123456789";
			
			
			Connection conexion = null;
					
					//Comando que queremos ejecutar
					
			String Comando = "SELECT * FROM persona";
			
			//La declaracion que usaremos
			
			PreparedStatement DeclaracionDefinitiva;
					
					
	/*********************************************************************************/
					
		// METODO QUE CONECTA CON LA BASE DE DATOS
					
	/*****************************************************************************/
	

	/*
	public PreparedStatement ConexionABaseDatos()  throws Exception{
		
		PreparedStatement Declaracion;
		try {
			Class.forName(DriverSQLJava); // Registra el driver
			
			//Creamos un objeto conexion y lo conectamos a nuestra base de dado "dbtest" establecido arriba aqui es "DB_URL"
			//Ademas introducimos el usuario y contraseña tambien establecidos arriba
			conexion = DriverManager.getConnection(DireccionURLBaseDatos,USER,PASS);
			
			// Aqui añadimos un statement (declaracion) en la que metemos un linea de texto "sql"
			//Arriba eta establecido como esa linea mete el comando para leer la tabla.
			
			Declaracion = conexion.prepareStatement(Comando);
			
			
			return Declaracion;

		}catch(Exception e) {
			
			System.out.println("Excepcion en la conexion: " + e.getMessage());
			return null;
		}
		
		
		
	}
	
	/*************************************************************************************/
	
	// METODO QUE LEE EL CONTENIDO DE LA BASE
	
	/*******************************************************************************************/
	
	/*
	 * 
	

	public List<persona> LecturaBaseDatos(PreparedStatement DeclaracionIntroducida){
		
		
		
		try {
			ResultSet Resultado = DeclaracionIntroducida.executeQuery();
			
			List<persona> ListaPersonasDentroDelMetodo = new ArrayList<>();
			
			while(Resultado.next()) {
				persona p = new persona();
				
				// Esto es una manera
				int x1 = Resultado.getInt("id");
				p.setId(x1);
				String x2 = Resultado.getString("nombre");
				p.setNombre(x2);
				
				ListaPersonasDentroDelMetodo.add(p);
			
			}
			Resultado.close();
			DeclaracionIntroducida.close();
			
			return ListaPersonasDentroDelMetodo;
			
			
			
		} catch (SQLException e) {
			System.out.println("Error en la lectura"  + e.getMessage());
			return null;
		}
		
		
		
	}
				
	
	/*************************************************************************/
	
	//MAIN
	
	/***************************************************************/
	
	/*
					
	public static void main(String []args) throws Exception{
		
		DeclaracionDefinitiva =  ConexionABaseDatos();
		
	}
	
	
	*/
	
}
