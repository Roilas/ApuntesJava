package Polimorfismo;

public class Perro extends Animal{
	
	private String raza;
	
	/**************************************/

	public Perro(String nombre, int edad, String tipoAlimentacion, String raza) {
		super(nombre, edad, tipoAlimentacion);
		this.raza = raza;
	}

	
	/*****************************************************/

	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	/*************************************************/

	@Override
	public void Alimentarse() {
		System.out.println("Come carne");
		
	}


}
