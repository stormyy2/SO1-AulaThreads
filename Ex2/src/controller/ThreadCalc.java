package controller;

public class ThreadCalc extends Thread{
	
	private int vet[];
	private int linha;
	
	public ThreadCalc(int vetor[], int ln) {
		vet = vetor;
		linha = ln;
	}
	
	public void run() {
		int total = 0;
		for(int i = 0; i < vet.length; i++) {
			total += vet[i];
		}
		System.out.println("Linha calculada: " + linha + "\nTotal da linha: " + total);
		
		
	}
	
	
}
