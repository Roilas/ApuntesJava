package Listas2;

public class Persona {
	
	private int id;
	private String Nombre;
	
	/***********************************************************************/
	
	public Persona(int id, String nombre) {
		super();
		this.id = id;
		Nombre = nombre;
	}
	
	/*********************************************************/
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	@Override
	
	/*****************************************************************************/
	
	public String toString() {
		return "Persona [id=" + id + ", Nombre=" + Nombre + "]";
	}

	
	
	
	

}
