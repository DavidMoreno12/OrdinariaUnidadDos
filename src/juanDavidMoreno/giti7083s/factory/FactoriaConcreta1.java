package juanDavidMoreno.giti7083s.factory;

public class FactoriaConcreta1 implements AbstractFactory {

	public void crearProductoA(){
		new ProductoA1();
	}
    
	public void crearProductoB(){
		
		new ProductoB1();
		
	}
}
