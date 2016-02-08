package juanDavidMoreno.giti7083s.acciones;

public class Gato extends Animal {
	
	public Gato() {
		Animal animal = new Animal();
		animal.alimentarse();
		animal.desplazarse();
		animal.dormir();
		System.out.println("Es un Gato...");
	}

}
