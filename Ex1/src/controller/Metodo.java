package controller;

public class Metodo extends Thread{
	public Metodo() {
		super();
	}
	
	@Override
	public void run() {
		int tid = (int) threadId();
		System.out.println("Thread ID: " + tid);
	}

}