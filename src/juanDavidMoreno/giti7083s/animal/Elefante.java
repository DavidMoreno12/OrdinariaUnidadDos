package juanDavidMoreno.giti7083s.animal;

public class Elefante extends Animal {
	//Constructor de la clase, ejecutan m�todos una vez que se instancia la clase
	public Elefante() {
		
	}
    
	 //M�todo sobre escrito de la clase padre.
    public void dibujar(){
    	System.out.println("Dibujando Elefante");
		
	}
    //M�todo sobre escrito de la clase padre.
	public void imprime(){
		System.out.println("El Elefante esta ...");
		
	}
	
	//se sobreescribe m�todo de la interface
		public void comunicarse(){
			
			System.out.println("barritando...");
		}
}
