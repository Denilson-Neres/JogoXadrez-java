package Xadres;

import JogoTabuleiro.Tabuleiro;

public class PartidaXadrez {
	private Tabuleiro tab;
	
	public PartidaXadrez() {
		tab = new Tabuleiro(8, 8);
	}
	
	public PecaXadrez[][]getPecas(){
		PecaXadrez[][] partida = new PecaXadrez[tab.getLinha()][tab.getColuna()];
		for (int i=0; i<tab.getLinha(); i++) {
			for(int j=0; j<tab.getColuna(); j++) {
				partida[i][j] = (PecaXadrez) tab.peca(i, j); 
			}
		}
		return partida;
	}
	
}
