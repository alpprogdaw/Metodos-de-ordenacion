
public class Main {

	public static void main(String[] args) {
		// crear el objeto MiVector
		MiVector v = new MiVector(5);
		v.inicializarVector();
		v.mostarVector();
		
//		v.seleccionDirecta();
//		v.mostarVector();
//		
//		v.inserccionDirecta();
//		v.mostarVector();
		
		v.intercambioDirecto();
		v.mostarVector();
			
	}
}
