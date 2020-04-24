package Xadres;

import JogoTabuleiro.Peca;
import JogoTabuleiro.Tabuleiro;

public class PecaXadrez extends Peca{
	private Cor cor;

	public PecaXadrez(Tabuleiro tab, Cor cor) {
		super(tab);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}


	
}
