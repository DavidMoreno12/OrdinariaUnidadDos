package juanDavidMoreno.giti7083s.acciones;

public class Humano implements AccionesHumanas, AccionesSeresVivos {

	@Override
	public void hablar() {
		System.out.println("Se comunica con palabras..");
		
	}

	@Override
	public void desplazarse() {
		System.out.println("Se desplaza caminando o en vehiculos...");
		
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentarse() {
		System.out.println("Se alimenta por la boca...");
		
	}

	@Override
	public void dormir() {
		System.out.println("duerme en una cama...");
		
	}

	@Override
	public void bailar() {
		System.out.println("Baila de todo");
		
	}

	@Override
	public void tocarInstrumentos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void estudiar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		
	}

}
