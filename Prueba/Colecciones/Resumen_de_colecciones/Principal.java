package Resumen_de_colecciones;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Principal {
	
		public static void main (String[]args) {
			
			/* Las coleccion agrupan informacion de clases (listas, mapas, ect...) pudiendo ser
			 * incluso de clases creadas (Ejemplo: "Persona"). Cada tipo de coleccion diferente
			 * tiene una estructura, comandos y funciones diferentes.
			 * 
			 */
			
			/************************************************************************/
			
			//LISTAS
			
			/**************************************************************************/
			
			// las listas como su propio nombre indica son solo un listado de valores.
		
			// COMO SE HACEN LISTAS Y TIPOS DE LISTA
			
			// List <String> NombreLista = New    \-> List<>();
			//									  \-> LinkedList<>();
			//									  \-> ArrayList<>();
			
			/**********************************************************************/
			
			// COMANDOS DE LAS LISTAS
			
			/*************************************************************************/
			
			// Aqui haremos una List que meteremos "Strings", sera "ListaDeLaCompra" y meteremos alimentos
			
			List <String> ListaDeLaCompra = new LinkedList<String>();
			
			// Ahora meteremos ingredientes;
			ListaDeLaCompra.add("Tomates");
			ListaDeLaCompra.add("Leche");
			ListaDeLaCompra.add("Carne");
			
			// Tambien podemos añadir elementos en un orden concreto
			
			ListaDeLaCompra.add(2, "Zanahorias");
			
			// Este comando devuelve en "int" el tamaño de la lista.
			
			int TamanoDeListaDeLaCompra = ListaDeLaCompra.size();
			
			// Esto remueve el componente en la posicion dada.
			
			ListaDeLaCompra.remove(2);
			
			// Esto limpia la lista por completo.
			
			// ListaDeLaCompra.clear();
			
			/*********************************************************************/
			
			// BUCLES EN LAS LISTAS
			
			/**************************************************************************/
			
			// Opcion 1:
			
			System.out.println("LISTAS: Metodo 1 de impresion");
			
			for(String x:ListaDeLaCompra) {
				System.out.println(x);
			}
			
			// Opcion 2: ---> (MEDIANTE ITINERADOR)
			
			System.out.println("LISTAS: Metodo 2 de impresion(MEDIANTE ITERATOR)");
			
			Iterator<String> IteradorDeListaDeLaCompra = ListaDeLaCompra.iterator();
			while(IteradorDeListaDeLaCompra.hasNext()) {
				System.out.println("Analizando elemento... " + IteradorDeListaDeLaCompra.next());
			}
			
			//NOTA: En este caso como son "String" los imprime facil, si no tendrias que decirle que lo pase a string
			// teradorDeListaDeLaCompra.next().toString()
			
			/***********************************************************************************/
			
			// BUSQUEDA EN LAS LISTAS
			
			/****************************************************************************************/
			
			
			System.out.println("LISTAS: Realizando la busqueda de: Tomates");
			for(String x:ListaDeLaCompra) {

				if(x.contentEquals("Tomates")) {
					System.out.println("Se ha encontrado un objeto con las condiciones");
				}
			}
			
			/*********************************************************************************/
			
			// TABLA DE CUALIDADES DE MAPAS Y SETS
			
			/***************************************************************************************/
			
			/* Los mapas y set tienen estructura diferentes pero poseen las mismas subfamilias que dan las
			 * mismas cualidades. (Hash, Tree y LinkedHash)
			*/
			/*
			
			
			// TABLA EN ELEMENTOS SENCILLOS
			
			HASH SET
					Elementos normales:
										-Ordena.
										-No admite duplicados.
					Elementos complejos:
										-No Ordena
										-Duplicados: CONFIGURABLE (Requiere metodos HasCode())
			HASH Map
					Elementos normales:
										-Ordena.
										-No admite duplicados.
					Elementos Complejos:
										-No ordena
										-Duplicados: CONFIGURABLE (Requiere metodos HasCode())
										
			Tree SET
					Elementos normales:
										-Ordena.
										-No admite duplicados.
					Elementos complejos:
										-Ordenar: CONFIGURABLE	(Requiere importar interfaz comparable y configurar
																	el metodo);
										-Duplicados: CONFIGURABLE (Requiere metodos HasCode())
			Tree Map
					Elementos normales:
										-Ordena.
										-No admite duplicados.
					Elementos Complejos:
										-Ordenar: CONFIGURABLE	(Requiere importar interfaz comparable y configurar
																	el metodo);
										-Duplicados: CONFIGURABLE (Requiere metodos HasCode())
										
			Linkedhash SET
					Elementos normales:
										-NO ordena
										-No admite duplicados.
					Elementos complejos:
										-No Ordena
										-Duplicados: CONFIGURABLE (Requiere metodos HasCode())
			LinkedHash Map
					Elementos normales:
										-No ordena.
										-No admite duplicados.
					Elementos Complejos:
										-No ordena.
										-Duplicados: CONFIGURABLE (Requiere metodos HasCode())
										
					
			
			
			
			
			
			
			
			
			
			
			
			
			
			*/
			
		}

	


}
