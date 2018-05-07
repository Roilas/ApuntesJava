package SetsConjuntos;

public class Persona implements Comparable<Persona>{
	
	int edad;
	String Nombre;
	int id;
	
	/********************************************************/
	
	
	public Persona(int id, String nombre, int edad) {
		super();
		this.edad = edad;
		Nombre = nombre;
		this.id = id;
	}
	
	/***********************************************************/

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// ESTOS DOS el HasCode y el equals se establecen para comprobar si los elementos del set se consideran repetidos
	// Puede establecerse las variables que comparen ignorado otras.
	// Click derecho -> Source -> Generate has code() and equals();
	
	//Pero usando TreeSet deberan cogerse la interfaz "Comparable"
	// añadiendole la clase -> implementes Comparable<Persona>
	//arriba de esta clase y implementar el metodo
	// que pida que es CompareTo();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + edad;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (edad != other.edad)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	// Con esto lo ordenariamos por edad haciendo un TreeSet
	@Override
	public int compareTo(Persona per) {
		return this.edad - per.getEdad();
		
		// Si queremos ordenarolo por nombre pondriamos
		
		// return this.nombre.compareTo(per.get.Nombre());
		
	}
	
	/**********************************************************/
	
	
	
	
	
	
	

}
