package view;

import controller.ThreadFrog;

public class Main {

	public static void main(String[] args) {

		String sapo = "Sapo ";
		for (int i = 0; i < 5; i++) {
			sapo += i+1;
			Thread threadFrog = new ThreadFrog(sapo);
			sapo = "Sapo ";
			threadFrog.start();
		}
	}
}
