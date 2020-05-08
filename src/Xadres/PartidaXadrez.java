package Xadres;

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
		PecaXadrez[][] partida = new PecaXadrez[tab.getLinhas()][tab.getColunas()];
		for (int i=0; i<tab.getLinhas(); i++) {
			for(int j=0; j<tab.getColunas(); j++) {
				partida[i][j] = (PecaXadrez) tab.peca(i, j); 
			}
		}
		return partida;
	}
	
	private void colocarNovaPeca(char coluna, int linha, PecaXadrez peca) {
		tab.colocarPeca(peca, new PosicaoXadrez(coluna, linha).toPosicao());
	}
	
	private void iniciarSetup() {
		colocarNovaPeca('b', 6, new Torre(tab, Cor.BRANCO));
		colocarNovaPeca('e', 8, new Rei(tab, Cor.PRETO));
		colocarNovaPeca('e',1, new Rei(tab, Cor.BRANCO));
	}
}
