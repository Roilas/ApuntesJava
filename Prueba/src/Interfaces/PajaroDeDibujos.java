package Interfaces;

public class PajaroDeDibujos extends Ave implements IConversador,IConductor



{
	
	@Override
	public void Habla() {
		System.out.println("Hablando como un pajaro...");
	}
	
	@Override
	public void Conduce() {
		System.out.println("Pajaro Conduciendo...");
	}

}
