package PruebaParticularSencillo;

public class Principal {
	
	public static void main (String []args) {
	
		//Aqui usando los metodos STATIC haremos alguna funcion, metodo... como lo llameis...
		//En un principio si quisiesemos que la clase "Numero" nos diese un numero al azar
		// tendriamos que crear un objeto numero, establecer un constructor antes y demas...
		//Y LUEGO decirle al objeto que haga la funcion: ejemplo NO VAMOS A HACER ESTO.
		/*
		 * 			Numero NumeroDeEjemplo = new Numero();
		 * 			NumeroDeEjemplo.TirarDado();
		 * 
		 */
		// Aqui al hacerlo por metodos STATIC no creamos un objeto "NumeroDeEjemplo" si no que
		//podemos llamar a las clase principal "Numero" y que lo haga directamente.
		
		
		//Aqui llamamos al SETTER de la clase "Numero" (VER LA OTRA FOTO) y cambiamos la variable.
		//La variable dice el numero maximo que puede salir (como el numero de caras de un dado)
	Numero.SetValorMaximo(10);
		//Aqui ejecutamos el metodo "TirarDado" de "Numero" y nos saca el numero en pantalla
		//(VER LA OTRA FOTO)
	Numero.TirarDado();

		

	}

}
