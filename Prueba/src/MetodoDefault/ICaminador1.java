package MetodoDefault;

public interface ICaminador1 {
	
	default public void Caminar() //throws InterruptedException
	{
		System.out.println("Caminando...");
		//Thread.sleep(1000);
		System.out.println("...");
		//Thread.sleep(1000);
		System.out.println("...");
		//Thread.sleep(1000);
		System.out.println("Ya has caminado");
	}
	
	default public void Hablar() {
		System.out.println("Estamos hablando desde ICaminador1");
	}
	

}
