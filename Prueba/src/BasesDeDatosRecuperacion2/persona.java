package BasesDeDatosRecuperacion2;

public class persona {
	
	private int id;
	private String nombre;
	private String pass;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "persona [id=" + id + ", nombre=" + nombre + ", pass=" + pass + "]";
	}
	
	
	
	
	
	

}
