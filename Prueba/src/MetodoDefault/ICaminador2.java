package MetodoDefault;

public interface ICaminador2{
	
	
	default public void Prensentarse(String IntroduceNombre) {
		System.out.println("Hola, mi nombre es " + IntroduceNombre);
	}

}
