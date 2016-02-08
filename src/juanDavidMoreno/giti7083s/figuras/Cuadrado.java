package juanDavidMoreno.giti7083s.figuras;

public class Cuadrado extends Figura {
	private int lado;
	
	public void area(){
		
		System.out.println("Area del Cuadrado: "+getLado() * getLado());
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	
}
