package controller;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class ThreadsController extends Thread{

	Random rd = new Random();
	
	int id;
	Semaphore semaforo;
	
	public ThreadsController(int id, Semaphore semaforo) {
		this.id = id;
		this.semaforo = semaforo;
	}
	
	public void run() {
		
	}

	public void cozinharPrato() {
		if(id % 2 == 0) {
			// Valor aleatório entre 0.2 a 1.0 segundo
			double valor = 0.5 + rd.nextDouble() * 0.3; // valor aleatório entre 0.5 e 0.8 segundo
			long tempo = (long) (valor * 1000);
			try {
				Thread.sleep(tempo);
				System.out.println("O prato "+id+" é uma Sopa de Cebola!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			// Valor aleatório entre 0.2 a 1.0 segundo
			double valor = 0.5 + rd.nextDouble() * 0.3; // valor aleatório entre 0.5 e 0.8 segundo
			long tempo = (long) (valor * 1000);
			System.out.println("O prato "+id+" é Lasanha a Bolonhesa!");
		}
	}
}
