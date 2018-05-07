package SetsConjuntos;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	// Los Sets o cojuntos son similares a las listas

	public static void main(String[] args) {

		Set<String> Lista = new HashSet<String>();

		// En los sets los objetos se ordenan automaticamente y no puede haber dos
		// iguales.

		Lista.add("d");
		Lista.add("a");
		Lista.add("b");
		Lista.add("c");
		Lista.add("c");

		System.out.println(Lista);

		// Manera para imprimir todo si contenido

		for (String x : Lista) {
			System.out.println(x);

		}

		// Aqui se hacen listas de "Persona" y luego se añaden personas a esa lista.

		Set<Persona> ConjuntoCenso = new HashSet<Persona>();

		// En vez de una HashSet podriamos hacerla TreeSet siendo que las TreeSet se
		// ordenan

		// Set<Persona> ConjuntoCenso = new TreeSet<Persona>(); -> Necesita la interfaz comparable en su clase
		//     													y el metodo CompareTo()
		
		//Tambien podemos hacer un LinkedHasSet
		// Set<Persona> ConjuntoCenso = new TreeSet<Persona>(); -> Necesita el HasCode() y equals()

		ConjuntoCenso.add(new Persona(1, "Juan", 23));
		ConjuntoCenso.add(new Persona(1, "Paca", 76));
		ConjuntoCenso.add(new Persona(1, "Marcos", 54));
		ConjuntoCenso.add(new Persona(1, "Luis", 16));

		// Para determinar en este caso si una persona esta repetida hay que establecer
		// que variables internas se
		// usan en la comparacion (Aqui por ejemplo el "id" de todas es igual pero las
		// personas no se consideran
		// repetidas)

		// Para establecerlas hay que poner en la clase "Persona" dos metodos
		// autogenerador (VER CLASE PERSONA).
		// El HasCode() y el Equals();

		// ESTOS DOS el HasCode y el equals se establecen para comprobar si los
		// elementos del set se consideran repetidos
		// Puede establecerse las variables que comparen ignorado otras.
		// Click derecho -> Source -> Generate has code() and equals();

		for (Persona per : ConjuntoCenso) {
			System.out.println("Años" + per.getEdad() + " Nombre: " + per.getNombre());

		}

	}

}
