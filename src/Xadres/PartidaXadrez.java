package Xadres;

import JogoTabuleiro.Posicao;
import JogoTabuleiro.Tabuleiro;
import Xadrez.pecas.Rei;
import Xadrez.pecas.Torre;

public class PartidaXadrez {
	private Tabuleiro tab;
	
	public PartidaXadrez() {
		tab = new Tabuleiro(8, 8);
		iniciarSetup();	
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
	
	private void iniciarSetup() {
		tab.colocarPeca(new Torre(tab, Cor.BRANCO),new Posicao(2,1));
		tab.colocarPeca(new Rei(tab, Cor.PRETO), new Posicao(0,4 ));
		tab.colocarPeca(new Rei(tab, Cor.BRANCO), new Posicao(7,4 ));
	}
}
