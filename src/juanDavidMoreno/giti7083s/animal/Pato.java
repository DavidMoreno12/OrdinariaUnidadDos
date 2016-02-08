package juanDavidMoreno.giti7083s.animal;

/*
 * Juan David Moreno Hernández
 * GITI7083-s
 * Subclase, que define métodos de la clase padre
 * */

public class Pato extends Animal {
	
	//Constructor de la clase, ejecutan métodos una vez que se instancia la clase
	 public Pato() {
		super();		
	}
	 
	//Método sobre escrito de la clase padre.
    public void dibujar(){
    	
    	System.out.println("el pato se esta dibujando");
		
	}
    //Método sobre escrito de la clase padre.
	public void imprime(){
		
		System.out.println("el pato esta nadando...");
		
	}
	//se sobreescribe método de la interface
		public void comunicarse(){
			
			System.out.println("El pato granza...");
		}
}
