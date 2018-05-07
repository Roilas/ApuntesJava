package Interfaces;

public class Principal {
	
	public static void main (String [] args) {
		
		PajaroDeDibujos Piolin = new PajaroDeDibujos();
		Piolin.Vuela();
		Piolin.Conduce();
		Piolin.Habla();
		
		RatonDeDibujos Micky = new RatonDeDibujos();
		Micky.Roe(); 
		Micky.Conduce();
		Micky.Habla();
		
		/******************************************************/
		
		IConversador Woodywoodpeker = new PajaroDeDibujos();
		Woodywoodpeker.Habla();
		
		
	}

}
