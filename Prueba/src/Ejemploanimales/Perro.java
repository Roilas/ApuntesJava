package Ejemploanimales;

public class Perro extends Animal{
	
	
	private String Raza;
	
/******************************************************************************/
	public Perro(String nombre, String tipoAlimentacion, int edad, String raza) {
		super(nombre, tipoAlimentacion, edad);
		this.Raza = raza;
	}
	
	
/*******************************************************************************/


	@Override
	public String toString() {
		return "Animal [Nombre=" + getNombre() + ", TipoAlimentacion=" + getTipoAlimentacion() + ", Edad=" + getEdad() +", Raza = " + Raza + "]";
	}



	/**********************************************************************/

	
	public String getRaza() {
		return Raza;
	}




	public void setRaza(String raza) {
		Raza = raza;
	}



}
