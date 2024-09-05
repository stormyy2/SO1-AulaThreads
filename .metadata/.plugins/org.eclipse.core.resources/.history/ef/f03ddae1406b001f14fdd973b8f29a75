package controller;

public class ThreadVetor extends Thread{
	private int vetor[];
	private int numero;
	
	
	public ThreadVetor(int vet[], int num) {
		vetor = vet;
		numero = num;
	}
	
	public void run() {
		double tempoInicial = System.nanoTime();
		
		if(numero % 2 == 0) {
			for(int i = 0; i< vetor.length; i++) {}
		} else {
			for(int valor : vetor) {}
		}
		double tempoFinal = System.nanoTime();
		
		double tempoTotal = (tempoFinal - tempoInicial)/ Math.pow(10, 9);
		System.out.println("Número escolhido: " + numero + "\nTempo de execução: " + tempoTotal);
	}
	
	
	
	
	
}
