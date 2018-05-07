package LasLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Iterator;
import java.util.LinkedList;

public class Principal {
	
	public static void main (String []args) {
		
		// Aqui creamos una lista enlazada, tiene las mismas funciones que la normal pero permite borrar
		// elementos del medio sin errores.
	
	List<Integer> ListaPrueba= new LinkedList<>();
	
	/*

	ListaPrueba.add(1);
	ListaPrueba.add(2);
	
	System.out.println("Tamaño: " + ListaPrueba.size());
	System.out.println(ListaPrueba);
	System.out.println("Ultimo elemento: " + ListaPrueba.get(ListaPrueba.size()-1));
	
	*/
	
	long InicioMedido = System.currentTimeMillis();
	System.out.println("Comenzando la lista...");
	for (int i = 0; i < 100_000; i++) {
		ListaPrueba.add(i);
	}
	System.out.println("Lista terminada");
	long FinMedido = System.currentTimeMillis();
	long Resultado = FinMedido - InicioMedido;
	System.out.println(Resultado);
	
System.out.println("");




	System.out.println("Comenzado borrado");
	InicioMedido = System.currentTimeMillis();
	for (int i = ListaPrueba.size(); i <= 0; i--) {
			ListaPrueba.remove(i);
		}
	
	FinMedido = System.currentTimeMillis();
	Resultado = FinMedido - InicioMedido;
	System.out.println("Lista terminada");
	System.out.println(Resultado);
	}

	
	

}
