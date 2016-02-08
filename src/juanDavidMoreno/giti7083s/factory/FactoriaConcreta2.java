package juanDavidMoreno.giti7083s.factory;

public class FactoriaConcreta2 implements AbstractFactory {

	public void crearProductoA(){
		
		new ProductoA2();
		
	}
    
	public void crearProductoB(){
		
		new ProductoB2();
	}
	
}
