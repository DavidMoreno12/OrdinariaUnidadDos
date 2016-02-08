package juanDavidMoreno.giti7083s.figuras;
/*
 * Autor : Juan David Moreno
 * Grupo: GITI7083- s
 * Clase padre de donde hereda circulo
 * 
 * */

import java.util.Scanner;

import juanDavidMoreno.giti7083s.animal.AnimalTest;
import juanDavidMoreno.giti7083s.animal.Elefante;
import juanDavidMoreno.giti7083s.animal.Gato;
import juanDavidMoreno.giti7083s.animal.Leon;
import juanDavidMoreno.giti7083s.animal.Pato;
import juanDavidMoreno.giti7083s.animal.Perro;

public class Figura {
	protected int puntoX;
	protected int puntoY;
	
	//metodo para calcular el perimetro retorna double
	public double calcularPerimetro(){
		return 0.0;
	}
	//metodo para calcular area, retorna double
	public double calcularArea(){
		return 0.0;
	}
	
	public void area(){
		
	}
	
	public void test(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("teclea el animal: \n1.- Circulo\n2.- Cuadrado");
		int seleciona = scanner.nextInt();
		
		switch(seleciona){
		case 1:
			Scanner scannerC = new Scanner(System.in);
			System.out.println("Introduce Radio: ");
			double dato = scanner.nextFloat();
			Circulo c= new Circulo();
			c.setRadio(dato);
			c.area();
			break;
		case 2:
			Scanner scannerCu = new Scanner(System.in);
			System.out.println("Introduce Lado: ");
			int lado = scanner.nextInt();
			Cuadrado cu= new Cuadrado();
			cu.setLado(lado);
			cu.area();
			break;
		default:
			System.out.println("No hay area a calcular");
			break;
		}
		
	}

	public static void main(String[] args) {
		new Figura().test();
	}
	
	
}
