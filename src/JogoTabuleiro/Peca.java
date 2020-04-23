package JogoTabuleiro;

public class Peca {
	protected Posicao posicao;
	private Tabuleiro tab;
	
	public Peca(Tabuleiro tab) {
		this.tab = tab;
		posicao = null;
	}

	protected Tabuleiro getTab() {
		return tab;
	}	
	
	
}
