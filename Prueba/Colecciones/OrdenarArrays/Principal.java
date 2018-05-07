package OrdenarArrays;

import java.util.Arrays;

public class Principal {
	
	public static void main (String []args) {
		
		int [] ArrayNumeros = {1,5,7,2,8};
		
		// Con esta linea ordenamos el array
		Arrays.sort(ArrayNumeros);
		
		// Busqueda en arrays
		// Nos devolvera la posicion del numero que busquemos
		
		// En este caso buscamos el numero 5 en el array anterior
		
		int PosicionDeLaBusqueda = Arrays.binarySearch(ArrayNumeros, 5);
		System.out.println("La posicion del numero 5 es la: " + PosicionDeLaBusqueda);
		
	}

}
