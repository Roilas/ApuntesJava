package Interfaces;

public class RatonDeDibujos extends Raton implements IConversador,IConductor
{
	
	@Override
	public void Conduce() {
		System.out.println("Raton Conduciendo...");
	}
	@Override
	public void Habla() {
		System.out.println("Raton hablando...");
	}
	
}
