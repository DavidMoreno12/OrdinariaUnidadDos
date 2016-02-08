package juanDavidMoreno.giti7083s.interfaceFigura;

import java.util.Scanner;

public class TestInterface {
	

	public void test(){
		Figura figura;
		Scanner scanner = new Scanner(System.in);
		System.out.println("teclea la figura que deseas: ");
		int seleciona = scanner.nextInt();
		
		switch(seleciona){
		case 1:
			figura = new Cuadrado();
			break;
		case 2:
			figura = new Circulo();
			break;
		case 3:
			figura = new Triangulo();
			break;
		default:
			break;
		}
		
	}
	
	public static void main(String[] args) {
		new TestInterface().test();
	}
	
	
}
