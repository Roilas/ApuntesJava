package Listas2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.Iterator;

public class Principal {

	public static void main (String []args) {
		
	
		/**************************************************/
		
		
		Persona Ser1 = new Persona(1,"Individuo1");
		Ser1.setId(1);
		Ser1.setNombre("Individuo1");
		
		Persona Ser2 = new Persona(2,"Individuo2");
		Ser2.setId(2);
		Ser2.setNombre("Individuo2");
		
		Persona Ser3 = new Persona(3,"Individuo2");
		Ser3.setId(3);
		Ser3.setNombre("Individuo3");
		
		/**********************************************************/
		
		List<Persona> ListaCenso = new ArrayList<Persona>();
		ListaCenso.add(Ser1);
		ListaCenso.add(Ser2);
		ListaCenso.add(Ser3);
		
		//for(Persona p:ListaCenso) {
		//	System.out.println(p.getNombre());
		//}

		/*
		
		Iterator<Persona> IteradorDelCenso = ListaCenso.iterator();
		while(IteradorDelCenso.hasNext()) {
			System.out.println("Analizando elemento... " + IteradorDelCenso.next().toString());
			//System.out.println("Analizando elemento... " + IteradorDelCenso.next());
	*/
		
		
		
		/*************************************************************************************/
		
		// BUSQUEDA DE ELEMENTOS
		
		/*************************************************************************************/
		
		//Mediante bucle for.

		// Buscamos un elemento de la lista y lo borramos en este caso que se llame "Individuo2"
		
		/*
		System.out.println("Comenzando la busqueda del objetivo...");
		for(Persona p:ListaCenso) {

			if(p.getNombre().contentEquals("Individuo2")) {
				System.out.println("Se ha encontrado un objeto con las condiciones");
				System.out.println("El objeto es: " + p.toString());
				ListaCenso.remove(p);
			}else {
				System.out.println("Este elemento NO cumple las condiciones");
				System.out.println("El objeto es: " + p.toString());
			}
		}
		
		// Se debe actualizar el Iterador de la lista tras hacer cambios para mantenerlo actualizado
		
		IteradorDelCenso = ListaCenso.iterator();
		
		while(IteradorDelCenso.hasNext()) {
			System.out.println("Analizando elemento... " + IteradorDelCenso.next().toString());
		}
		
		*/
		
		/***************************************************************************************/
		
		// ORDEN DE LOS ELEMENTOS EN LISTA
		
		/********************************************************************/
		
		/*
		
		Persona Ser4 = new Persona();
		Ser4.setId(3);
		Ser4.setNombre("Ana");
		
		ListaCenso.add(1,Ser4);
		
		Iterator<Persona> IteradorDelCenso = ListaCenso.iterator();
		while(IteradorDelCenso.hasNext()) {
			System.out.println("Analizando elemento... " + IteradorDelCenso.next().toString());
			//System.out.println("Analizando elemento... " + IteradorDelCenso.next());
		}
		
		
		*/
		
		
		/*
		System.out.println("¿Contiene a Individuo2 " + ListaCenso.contains(Ser2));
		System.out.println("¿En que posicion esta Individuo2 " + ListaCenso.indexOf(Ser2));
		System.out.println("¿Cuantos habitantes tiene el censo? " + ListaCenso.size());
		*/
		
		
		
		/*
		ListaCenso.remove(Ser2);
		System.out.println("Pero borramos al Individuo 2");
		System.out.println("¿Cuantos habitantes tiene el censo? " + ListaCenso.size());
		*/
		
		
		/*
		ListaCenso.clear();
		System.out.println("Ahora hemos borrado todo");
		System.out.println("¿Cuantos habitantes tiene el censo? " + ListaCenso.size());
		System.out.println("¿Esta vacia?" + ListaCenso.isEmpty());
		*/
		
		System.out.println(ListaCenso.subList(0, 2));
		
		// Con esto hacemos una "ListaTemporal" de Strings con 3 nombres directamente.
		
		List<String> ListaTemporal = new ArrayList<>(Arrays.asList("Celendonio","Alberto","Gregorio"));
		
		
		// Este es apra sumar varias listas pero aqui  no sirve ya que "ListaCenso" tiene elementos tipo
		// "Persona" y intentamos meter solo nombres "String"
		
		// System.out.println(ListaCenso.addAll(ListaTemporal));
		
		/**************************************************************/
		
		//CONVERTIR DE ARRAY A LIST Y VICEVERSA
		
		/**********************************************************/
		
		/*
		
		// ESTO NO SE DEBE USAR
		String[] s = {"a", "b", "c"};
		
		// Ya que al asar un array directamente luego no se puede modificar.
		List<String> ListaDeLetras = Arrays.asList(s);
		
		// Ordena en orden alfabetico.
		ListaDeLetras.sort(null);
		
		// Para añadir arrays primero deberemos hacer una lista nueva con ellos y luegos sumar las listas.
		
		*/
		
		
		/*
		 
		 
		 
_____ __ __ __ __ __
	 \	\  \  \  \  \
	  \  \  \  \  \  \
	   \  \  \  \  \  \
________\__\__\__\__\__\
       /  /  /  /  /  /
_____/__/__/__/__/__/
	
		 
		 */
		
		/*
		
		// Asi pasamos de una LIST a un ARRAY
		String[] s2 = (String[])ListaDeLetras.toArray();
		System.out.println(s2[0]);
		
		*/

		
		// List<String> ListaDeEjemplo = new LinkedList<>();
		
		// ordenar listas
		
		// Collections.sort(NombreDeLaLista);
		// Collections.reverse(NombreDelaLista);
		
		// para organzar algo que nos sean int habra que acudir a la interfa "Comparable" y "Comparator" 
		//en la clase
		
		
		List<Persona> ListaAOrdenar = new  ArrayList<>();
		
		
	ListaAOrdenar.add(new Persona(4,"Carlos"));
	ListaAOrdenar.add(new Persona(7,"Carlos"));	
	ListaAOrdenar.add(new Persona(2,"Maria"));
	ListaAOrdenar.add(new Persona(1,"Pepe"));
	ListaAOrdenar.add(new Persona(9,"Alenjandro"));
	ListaAOrdenar.add(new Persona(10,"Alejandro"));
	ListaAOrdenar.add(new Persona(8,"Juan"));	
	
	
	
	// Tenemos que crear una nueva clase en este caso "NombreComparator" para decirle como ordenarlo en este caso
	// los ordena segun el orden alfabetico de los nombres..
	
	Collections.sort(ListaAOrdenar, new NombreYEdadadComparator());
	
	for(Persona p: ListaAOrdenar) {
		System.out.println(p.getId() + "nombre" + p.getNombre());
	}
	
	// Otra forma de ordenar las listas sin crear una clase del comparador:
	
	//Collection.sort(ListaAOrdenar, new Comparator<Persona>(){
	
	/*
	Aqui definimos este new Comparator que es el quese usara en el comando 
	
	@Override
	public int compare(Persona per1, Persona per2){
		return per1.getName().compareTo(per2.getName());
	}
	
	
	
	
	*/
	
	//}
		
		// Collections.sort(ListaAOrdenar, (x,y) -> x.compareTo(y));;
		
		
		
		
	}
}
