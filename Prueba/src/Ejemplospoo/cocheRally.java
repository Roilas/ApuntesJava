package Ejemplospoo;


//Para heredar las variables de coche es necesario poner "extends coche"
public class cocheRally extends coche{
	
	/*****************************************************/
	
	//public CocheRally() {
	//	this.color = "rojo";
	//	this.marca = "ford";
	//	this.motor = "XXL ds";
	//}
	
	
	String Aleron;
	
	/************************************************/

	public String getAleron() {
		return Aleron;
	}
	
	public int getRuedas() {
		return Ruedas;
		
	}
	
	/*******************************************************/
	
	//Aleron, asiento copiloto y motor
	
	public void setAleron(String TipoAleron) {
		this.Aleron = TipoAleron;
	}

}

