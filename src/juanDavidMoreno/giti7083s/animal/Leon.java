package juanDavidMoreno.giti7083s.animal;

/*
 * Juan David Moreno Hern�ndez
 * GITI7083-s
 * Subclase, que define m�todos de la clase padre
 * */

public class Leon extends Animal {
	

	//Constructor de la clase, ejecutan m�todos una vez que se instancia la clase
	public Leon() {
		super();
	
	}
	
    //M�todo sobre escrito de la clase padre.
    public void dibujar(){
    	System.out.println("Dibujando Le�n");
		
	}
    //M�todo sobre escrito de la clase padre.
	public void imprime(){
		System.out.println("El Le�n esta ...");
		
	}
	
	//se sobreescribe m�todo de la interface
		public void comunicarse(){
			
			System.out.println("Rugiendo...");
		}
}
