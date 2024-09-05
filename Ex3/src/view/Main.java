package view;
import java.util.Random;

import controller.ThreadVetor;


public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int vetor[] = new int[1000];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(100) + 1;
		}
		ThreadVetor n1 = new ThreadVetor(vetor, 1);
		ThreadVetor n2 = new ThreadVetor(vetor, 2);
		
		n1.start();
		n2.start();
		
	}

}
