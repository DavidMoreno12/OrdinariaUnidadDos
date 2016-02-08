package juanDavidMoreno.giti7083s.acciones;

import javax.xml.bind.SchemaOutputResolver;

public class Perro extends Animal {
	
	public Perro(){
		Animal ani = new Animal();
		ani.alimentarse();
		ani.desplazarse();
		ani.dormir();
		System.out.println("Es un perro...");
	}

}
