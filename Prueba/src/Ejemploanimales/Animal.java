package Ejemploanimales;

public class Animal {

	private String Nombre;
	private String TipoAlimentacion;
	private int Edad;
	
	
	/********************************************************************/
	
	
	public Animal(String nombre, String tipoAlimentacion, int edad) {
		super();
		this.Nombre = nombre;
		this.TipoAlimentacion = tipoAlimentacion;
		this.Edad = edad;
		
		
	}
	/*****************************************************/
	@Override
	public String toString() {
		return "Animal [Nombre=" + Nombre + ", TipoAlimentacion=" + TipoAlimentacion + ", Edad=" + Edad + "]";
	}

	
	/*********************************************************************************/
	
	
	public String getNombre() {
		return Nombre;
	}
	

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	

	public String getTipoAlimentacion() {
		return TipoAlimentacion;
	}
	public void setTipoAlimentacion(String tipoAlimentacion) {
		TipoAlimentacion = tipoAlimentacion;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	
	/***********************************************************************/
	
	
	
}
