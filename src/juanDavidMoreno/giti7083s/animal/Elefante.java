package juanDavidMoreno.giti7083s.animal;

public class Elefante extends Animal {
	//Constructor de la clase, ejecutan métodos una vez que se instancia la clase
	public Elefante() {
		
	}
    
	 //Método sobre escrito de la clase padre.
    public void dibujar(){
    	System.out.println("Dibujando Elefante");
		
	}
    //Método sobre escrito de la clase padre.
	public void imprime(){
		System.out.println("El Elefante esta ...");
		
	}
	
	//se sobreescribe método de la interface
		public void comunicarse(){
			
			System.out.println("barritando...");
		}
}
