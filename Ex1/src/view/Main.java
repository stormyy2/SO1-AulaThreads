package view;
import controller.Metodo;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i < 5 ; i++) {
			Metodo metodos = new Metodo();
			metodos.start();			
		}
	}

}
