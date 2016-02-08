package juanDavidMoreno.giti7083s.acciones;

public class Mujer extends Humano {

	
	public Mujer() {
		Humano humano = new Humano();
		humano.alimentarse();
		humano.bailar();
		humano.desplazarse();
		humano.dormir();
	    System.out.println("es una mujer...");
	}
}
