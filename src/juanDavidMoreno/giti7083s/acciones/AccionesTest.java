package juanDavidMoreno.giti7083s.acciones;

import java.util.Scanner;



public class AccionesTest {
	
	public void test(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Selecione un número para Conocer acciones: ");
		int seleciona = scanner.nextInt();
		
		switch(seleciona){
		case 1:
			new Gato();
			break;
		case 2:
			new Perro();
			break;
		case 3:
		    new Hombre();
			break;
		case 4:
			new Mujer();
			break;
		default:
			System.out.println("No hay acciones para mostrar");
			break;
		}
		
	}

	public static void main(String[] args) {
		new AccionesTest().test();
	}

}
