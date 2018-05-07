package Ejemplospoo2;

// Esto importa la clase "coche" desde otro paquete
import Ejemplospoo.coche;

public class cocheF1 extends coche{
	
	private String difusor;
	
	/***********************************************/
	
	// Esto es el constructor de cocheF1:
	//En el decimos que al crear un objeto de clase cocheF1 hay que establecer la variable 
	//difusor string siguiendo el ejemplo:
	//
	//  cocheF1 miCocheF1 = new cocheF1("Estandar");
	//
	//  Aqui establecemos el difusor como "Estandar"
	//
	
	public cocheF1(String p_difusor) {
		difusor = p_difusor;
		}
	
	/****************************************************/
	public void setMotor(String motor) {
		this.Motor = motor;
	}
	
}
	

