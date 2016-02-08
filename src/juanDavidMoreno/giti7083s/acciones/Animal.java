package juanDavidMoreno.giti7083s.acciones;

public class Animal implements AccionesSeresVivos {

	@Override
	public void hablar() {
		System.out.println("No habla...");
		
	}

	@Override
	public void desplazarse() {
		System.out.println("Camina en 4 patas...");
		
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentarse() {
		System.out.println("se alimenta por el ocico..");
		
	}

	@Override
	public void dormir() {
		System.out.println("Duerme como animal...");
		
	}

}
