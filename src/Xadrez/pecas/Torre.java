package Xadrez.pecas;

import JogoTabuleiro.Tabuleiro;
import Xadres.Cor;
import Xadres.PecaXadrez;

public class Torre extends PecaXadrez{

	public Torre(Tabuleiro tab, Cor cor) {
		super(tab, cor);
	}
	
	@Override
	public String toString() {
		return "T"; 
	}
	
}
