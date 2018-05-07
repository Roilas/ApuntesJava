package PruebaParticular;

public abstract class Numero {
	
	private static String ValorTextual;
	private static int Numero;
	private static int Diferencia;
	
	/**********************************************************/

	
	public static void TirarDado(int valorMaximo) {
		Numero = (int)(Math.random() * valorMaximo) + 1;
		ValorTextual = Integer.toString(Numero);
		System.out.print(ValorTextual);
		
	}
	
	public static void AleatorioCustom(int Min, int Max)
	{
		Diferencia = Max - Min;
		Numero = ((int)(Math.random() * Diferencia) + Min) + 1;
		ValorTextual = Integer.toString(Numero);
		System.out.print(ValorTextual);
		
	}
	
	


}
