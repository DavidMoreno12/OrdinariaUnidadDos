package juanDavidMoreno.giti7083s.animal;

import java.util.Scanner;

public class AnimalTest {
	
	public void test(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("teclea el animal: \n1.- Gato\n2.- Perro\n3.- Pato\n4.- León\n5.- Elefante");
		int seleciona = scanner.nextInt();
		
		switch(seleciona){
		case 1:
			new Gato().comunicarse();
			break;
		case 2:
			new Perro().comunicarse();
			break;
		case 3:
			Pato pato = new Pato();
			pato.dibujar();
			pato.imprime();
			pato.comunicarse();
			break;
		case 4:
			Leon leon = new Leon();
			leon.dibujar();
			leon.imprime();
			leon.comunicarse();
			break;
		case 5:
			Elefante elefante =new Elefante();
			elefante.dibujar(); 
			elefante.imprime(); 
			elefante.comunicarse();
			break;
		default:
			System.out.println("No hay animales que se puedan mostrar");
			break;
		}
		
	}

	public static void main(String[] args) {
		new AnimalTest().test();
	}
	
}
