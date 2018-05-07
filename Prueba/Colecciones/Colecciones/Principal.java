package Colecciones;
import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class Principal {

	public static void main (String []args) {
		
		/*
		// Esto no crea un objeto de clase List porque List es una interfaz. Lo hacemos de ArrayList
		// llamadado "ListaPrueba".
		
		List<String> ListaPrueba = new ArrayList<String>();
		
		// List ListaPrueba = new ArrayList();
		// Asi como los [] se utilizan para definir un array
		// Los <> se utilizan para definir Listas
		
		ListaPrueba.add("Cosa que es la 1");
		ListaPrueba.add("Pongo aqui la cosa 2");
		ListaPrueba.add("¿¿¿¿4???");
		
		
		
		
		// Esto es un bucle que imprime cada elemento de la lista.
		// for(String s:ListaPrueba) {
		//	System.out.println(s);
		//}
		
		Iterator<String> IteradorDeLaLista = ListaPrueba.iterator();
		while(IteradorDeLaLista.hasNext()) {
			System.out.println("Analizando elemento... " + IteradorDeLaLista.next());
		}
		
		*/
		/**************************************************/
		
		Persona Ser1 = new Persona();
		Ser1.setId(1);
		Ser1.setNombre("Individuo1");
		
		Persona Ser2 = new Persona();
		Ser2.setId(2);
		Ser2.setNombre("Individuo2");
		
		Persona Ser3 = new Persona();
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

		Iterator<Persona> IteradorDelCenso = ListaCenso.iterator();
		while(IteradorDelCenso.hasNext()) {
			System.out.println("Analizando elemento... " + IteradorDelCenso.next().toString());
			//System.out.println("Analizando elemento... " + IteradorDelCenso.next());
		}
		/*************************************************************************************/
		
		// BUSQUEDA DE ELEMENTOS
		
		/*************************************************************************************/
		
		//Mediante bucle for.

		// Buscamos un elemento de la lista y lo borramos en este caso que se llame "Individuo2"
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
		
	}
}
