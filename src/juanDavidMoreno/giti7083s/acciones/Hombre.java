package juanDavidMoreno.giti7083s.acciones;

public class Hombre extends Humano {
	
	public Hombre() {
		Humano humano = new Humano();
		humano.alimentarse();
		humano.bailar();
		humano.desplazarse();
		humano.dormir();
		System.out.println("Es un Hombre...");
	}

}
