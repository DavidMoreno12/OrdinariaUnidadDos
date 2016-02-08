package juanDavidMoreno.giti7083s.figuras;

/*
 * Juan David Moreno Hernández
 * giti7083-s
 * Clase que permite calcular el área del circulo
 * */

public class Circulo extends Figura {

	private Punto centro = null;
	private double radio = 0.0;
	
	public void area(){
		double rad = 3.1416*(getRadio()*getRadio());
		
		System.out.println("El radio es:"+rad);
	}
   
	public Punto getCentro() {
		return centro;
	}

	public double getRadio() {
		return radio;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
}
