package juanDavidMoreno.giti7083s.pelota;

import java.util.Scanner;

import juanDavidMoreno.giti7083s.figuras.Circulo;
import juanDavidMoreno.giti7083s.figuras.Cuadrado;
import juanDavidMoreno.giti7083s.figuras.Figura;

public class PelotaTest {

	public void test(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("teclea tipo de rebote: ");
		int seleciona = scanner.nextInt();
		
		switch(seleciona){
		case 1:
			new PelotaFutbol().rebotar();
			break;
		case 2:
			new Llanta().rebotar();
			break;
		default:
			System.out.println("No hay tipo rebote");
			break;
		}
		
	}

	public static void main(String[] args) {
		new PelotaTest().test();
	}
}
