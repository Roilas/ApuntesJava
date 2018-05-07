package PruebaParticularSencillo;
public abstract class Numero {
	
	// Como vamos a trabajar con esta clase directamente sin crear ningun objeto pongo todas
	//las variables en STATIC
	private static int ValorMaximo;
	private static String ValorEnTexto;
	private static int Numero;
	
	// Ya que no creamos ningun objeto no necesitamos constructor. Si intentamos hacer
	//un constructor con click derecho->Source->Generate Constructor nos tira error
	//dice que no hace falta constructor porque todas son static.
	
	//IMPORTANTE: En los dos siguientes metodos tienen puesto "static" como en las variables de
	//arriba. Esto nos deja usarlos sin crear un objeto de clase "Numero" ni hacer un constructor.
	
	/**********************************************************/
//Este metodo es un SETTER solo cambia el "ValorMaximo" que establecimos arriba.
	public static void SetValorMaximo(int valorQueIntroducimos) {
		ValorMaximo = valorQueIntroducimos;
	}
	/*******************************************************/
	

	//Este metodo se usa para que nos escriba un valor al azar entre 0 y el ValorMaximo
	//en la pantalla
	public static void TirarDado() {
		//Esta es la formula que saca el numero al azar y lo mete en "Numero", no es importante.
		Numero = (int)(Math.random() * ValorMaximo);
		//Esto pasa a STRING el "Numero" (que ahora es INT)para que lo pueda escribir.
		ValorEnTexto = Integer.toString(Numero);
		//Ahora con el numero pasado a String(Texto) lo escribe en la pantalla.
		System.out.print(ValorEnTexto);
		
	}
	
	


	

}
