package view;
import java.util.Random;

import controller.ThreadCalc;

public class Main {

	public static void main(String[] args) {
		int matriz[][] = new int[3][5];
		matriz = preencheMatriz(matriz);
		
		for(int i = 0; i < 3 ; i++ ) {
				ThreadCalc metodo = new ThreadCalc(matriz[i], i+1);
				metodo.start();
			}
	}
	
	
	public static int[][] preencheMatriz(int matriz[][]){
		Random random = new Random();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				matriz[i][j] = random.nextInt(100) + 1; 
			}
		}
		return matriz;
	}
	

}
