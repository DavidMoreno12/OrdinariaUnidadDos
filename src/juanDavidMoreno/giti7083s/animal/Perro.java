package juanDavidMoreno.giti7083s.animal;

/*
 * Autor: Juan David Moreno Hernández
 * Grupo: GITI7083-s
 * Subclase que hereda de animal, clase definida
 * */

public class Perro extends Animal {
  
	//Constructor de la clase
	public Perro(){
		
		
	}
	
	//se sobreescribe método de la interface
	public void comunicarse(){
		System.out.println("El perro esta ladrando...");
	}
}
