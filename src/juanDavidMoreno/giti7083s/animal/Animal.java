package juanDavidMoreno.giti7083s.animal;

import java.util.Scanner;

/*
 * Autor: Juan David Moreno Hern�ndez
 * Grupo: GITI7083-s
 * Clase padre de donde hereden las clases Gato y Perro
 * */

public class Animal implements IAnimal {
    //atributo publico de la clase padre
	public String nombre;
	
	public void dibujar(){
		
	}
	public void imprime(){
		
	}
	//Constructor de la clase
	public Animal() {
		super();
	}
    //metodo definido como funci�n 
	public void tipoAnimal(){
		
	}
	
	//Accesores de las clases 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
