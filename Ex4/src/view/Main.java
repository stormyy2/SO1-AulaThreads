package view;
import controller.ThreadSapo;
public class Main {

	public static void main(String[] args) {
		int j = 1;
		for(int i = 0; i < 5; i++) {
			ThreadSapo sapo = new ThreadSapo(20, i, j);
			sapo.start();
			j++;
		}
	}

}
