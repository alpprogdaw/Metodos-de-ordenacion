import java.util.Random;

public class MiVector {
	//atributos
	
	int [] vector;
	
	public MiVector() { //constuctor
		vector = new int[10];
	}
	public MiVector(int num) { //constuctor
		if (num <= 0) {
			vector = new int[10];
		}
		else {
			vector = new int[num];
		}
	}

	public int[] getVector() {
		return vector;
	}
	
	public void inicializarVector() {
		Random r = new Random();
		for (int i=0; i<vector.length;i++) {
			vector[i] = r.nextInt(10 - 1) + 1;
		}
	}
	
	public void mostarVector() {
		System.out.println();
		for (int i=0; i<vector.length;i++) {
			System.out.print(vector[i] + " ");
		}
	}
	/**
	 * Metodo de ordenacion por seleccion directa
	 */
	public void seleccionDirecta() {
		int minimo;
		int aux;
		for (int i=0;i<vector.length - 1;i++) {
			minimo = i;
			for (int j=i+1;j<vector.length;j++) {
				if (vector[j] < vector[minimo]) {
					minimo = j;
				}
			}
			aux = vector[minimo];
			vector[minimo] = vector[i];
			vector[i] = aux;
		}
	}
	
	public void inserccionDirecta() {
		int aux;
		int j;
		for (int i=0;i<vector.length;i++) {
			aux = vector[i];
			j=i-1;
			while ((j >= 0) && (aux < vector[j])) {
				vector[j+1] = vector[j];
				j--;
			}
			vector[j+1] = aux;
		}
	}
	
	public void intercambioDirecto() {
		int aux;
		for (int j=0;j<vector.length-1;j++) {
			for (int i=0;i<vector.length-1; i++) {
				if(vector[i] > vector[i+1]) {
					aux = vector[i];
					vector[i] = vector[i+1];
					vector[i+1] = aux;
				}
			}
		}
	}

}
