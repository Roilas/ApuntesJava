package HasshMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Principal {
	

	public static void main (String []args) {
	
		//Podemos hacer:
		
		//HashMap diccionario = new HashMap();
		
		//Pero lo normal es hacerlo asi:
		
		Map<String, String> diccionario = new HashMap<>();
		diccionario.put("c", null);
		diccionario.put("a","aaa");
		diccionario.put("b", "bbb");
		diccionario.put("b", "bbb2"); //En este claso se repite la clave "b" reemplaza la antigua
		diccionario.put(null, "d");
		diccionario.put(null, null);
		
		System.out.println(diccionario);
		
		// Para buscar un valor
		
		String contenido = diccionario.get("a").toString();
		//String contenido2 = String.valueOf(diccionario.get("a"));
		System.out.println(contenido);
		
		// en este caso busca la entrada "a" y muestras su valor.
		
		/***************************************/
		
		//CONTAINS
		
		/********************************/
		
		boolean existe = diccionario.containsKey("a");
		System.out.println("¿Existe la clave a?" + existe);
		existe = diccionario.containsValue("bb2");
		System.out.println("¿Existe el valor bb2?" + existe);
		
		/********************************************/
		
		
		
		//diccionario.clear();
		
		
		/*
		System.out.println("¿Is empty?" + diccionario.isEmpty());
		System.out.println("Su tamaño es: " + diccionario.size());
		
		*/
		
		/**************************************************/
		
		// diccionario.remove("b");
		
		System.out.println("");
		
		// Recorremos el conjunto de claves
		
		// Forma 3
		
		/*
		for (String ent: diccionario.keySet() ) {
			System.out.println("Clave: "  + ent + " Contenido de la clave: " + diccionario.get(ent));
		}
		
		*/
		
		//Forma 4
		
		/*
		for(Entry<String,String> ent: diccionario.entrySet() ) {
			System.out.println("Clave: " + ent.getKey() + "Contenido: " + ent.getValue());
		}
		*/
		
		// Forma 5
		
		
		/*
		java.util.Iterator<String> it = diccionario.keySet().iterator();
		
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println("Clave: " + key + " Contenido:" + diccionario.get(key));
		}
		*/
		
		/*
		 * 	VER TODO EL MAPA CON ITERATOR
		 * 
		 * 	Iterator it 0 casas.keySet().iterator();
		 * 	while (it.hasNext()){
		 * 	Casa key = (Casa)it.next();
		 * System.out.println("Clave:" + key + " Valor: " + casas.get(key));
		 * }
		 *  PASAMOS DE UN TIPO DE MAP A OTRO (EN VERDAD CREAMOS UNO NUEVO) A UN TREEMAP CON LO CUAL QUEDA ORGANIZADO
		 *   MapCasa<Casa,String> sortedCasas = new TreeMap<Casa,String>(casas);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		

		
		
	}

}
