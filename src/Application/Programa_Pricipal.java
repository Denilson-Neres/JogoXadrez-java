package Application;

import Xadres.PartidaXadrez;

public class Programa_Pricipal {

	public static void main(String[] args) {

		PartidaXadrez partida = new PartidaXadrez();
		UI.printTabuleiro(partida.getPecas());
		System.out.println();
	}

}
