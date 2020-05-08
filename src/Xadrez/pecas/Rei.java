package Xadrez.pecas;

import JogoTabuleiro.Tabuleiro;
import Xadres.Cor;
import Xadres.PecaXadrez;

public class Rei extends PecaXadrez{

	public Rei(Tabuleiro tab, Cor cor) {
		super(tab, cor);
	}
	
	@Override
	public String toString() {
		return "R";
	}
	
}
