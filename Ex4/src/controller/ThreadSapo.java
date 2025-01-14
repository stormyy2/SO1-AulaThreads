package controller;
import java.util.Random;

public class ThreadSapo extends Thread{
	
	private int puloMax, posicao, sapoId;
	private static int colocacao[] = new int[5];
	private static double tempoTotal[] = new double[5];
	
	public ThreadSapo(int puloMax, int posicao, int sapoId) {
		this.puloMax = puloMax;
		this.posicao = posicao;
		this.sapoId = sapoId;
	}
	
	@Override
	public void run() {
		Random random = new Random();
		int distanciaMax = 100;
		int distPercorrida = 0;
		double tempoInicial = System.nanoTime();
		
		while(distPercorrida < distanciaMax) {
			int pulo = random.nextInt(puloMax);
			distPercorrida += pulo;
			System.out.println("Sapo " + (posicao + 1)+ " pulou " + pulo + " m. Distância percorrida: " + distPercorrida + " de 100 metros.");
		}
		
		double tempoFinal = System.nanoTime();
		double tempoDecorrido = (tempoFinal - tempoInicial)/Math.pow(10, 9);
		
		colocacao[posicao] = sapoId;
		tempoTotal[posicao] = tempoDecorrido;
		
		System.out.println("Sapo " + sapoId + " chegou ao final em " + tempoDecorrido + " segundos.");
		System.out.println("\n---------\n");
			
		synchronized (ThreadSapo.class) {
			if (posicao == 4) { 
				ordenarResultados();
				exibirResultados();
			}
			
			
		}
	}
	
	
	private static void ordenarResultados() {
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (tempoTotal[i] > tempoTotal[j]) {
                    double auxTempo = tempoTotal[i];
                    tempoTotal[i] = tempoTotal[j];
                    tempoTotal[j] = auxTempo;

                    int auxId = colocacao[i];
                    colocacao[i] = colocacao[j];
                    colocacao[j] = auxId;
                }
            }
        }
    }
	
	private static void exibirResultados() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + (i + 1) + ": Sapo " + colocacao[i] + " com tempo de " + tempoTotal[i] + " segundos.");
        }
    }
	
	
		
}
