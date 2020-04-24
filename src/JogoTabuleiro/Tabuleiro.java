package JogoTabuleiro;

public class Tabuleiro {
	private int coluna;
	private int linha;
	private Peca[][]pecas;
	public Tabuleiro(int coluna, int linha) {
		this.coluna = coluna;
		this.linha = linha;
		pecas = new Peca[linha][coluna];	
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	
	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	
}
