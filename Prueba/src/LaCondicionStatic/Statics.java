package LaCondicionStatic;

public class Statics {
	
	
	private static String nombre;
	private int edad;
	public static String nombreDeClase = "Clase gfsgfsg";
	
	 /*****************************************************/
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/*************************************************************/
	
	
public void mostrarDeinstancia() {
	System.out.println(this.nombre + ", " + edad);
}
public static void MostrarDeClase_o_estatico() {
	System.out.println(nombreDeClase);
}

}
