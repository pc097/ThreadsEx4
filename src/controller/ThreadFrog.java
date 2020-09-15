package controller;

import java.util.Random;

public class ThreadFrog extends Thread {
	private String sapo;

	public ThreadFrog(String sapo) {
		this.sapo = sapo;
	}

	@Override
	public void run() {
		puloSapo();
	}

	private void puloSapo() {

		Random random = new Random();
		int distPulo = 0;
		int distMax = 30;
		int aux = 0;
		while (distPulo < distMax) {
			aux += random.nextInt(10);
			distPulo += aux;
			System.out.println("O " + sapo + " pulou " + aux + " metros.");
		}
		System.out.println("O " + sapo + " chegou ao fim da corrida!");
	}
}
