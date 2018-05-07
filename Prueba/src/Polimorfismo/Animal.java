package Polimorfismo;

public abstract class Animal {
	
	String Nombre;
	private int edad;
	String TipoAlimentacion;
	
	
	/**************************************************************************/
	
	
	public Animal(String nombre, int edad, String tipoAlimentacion) {
		this.Nombre = nombre;
		this.edad = edad;
		this.TipoAlimentacion = tipoAlimentacion;
	}
	
	public Animal() {
		super();
	}

	/*******************************************************************************/


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getTipoAlimentacion() {
		return TipoAlimentacion;
	}

	public void setTipoAlimentacion(String tipoAlimentacion) {
		TipoAlimentacion = tipoAlimentacion;
	}

	/*****************************************************/
	
	public abstract void Alimentarse();
	
	
	

}
