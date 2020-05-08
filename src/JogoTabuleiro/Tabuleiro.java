package JogoTabuleiro;

public class Tabuleiro {
	private int colunas;
	private int linhas;
	private Peca[][]pecas;
	
	public Tabuleiro(int colunas, int linhas) {
		if(linhas < 1 || colunas < 1) {
			throw new ExceptionTabuleiro("Erro na criação do tabuleiro.");
		}
		this.colunas = colunas;
		this.linhas = linhas;
		pecas = new Peca[linhas][colunas];	
	}
	public int getColunas() {
		return colunas;
	}

	public int getLinhas() {
		return linhas;
	}

	
	public Peca peca(int linha, int coluna) {
		if(!posicaoExistente(linha, coluna)) {
			throw new ExceptionTabuleiro("Posicao não esta no tabuleiro.");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new ExceptionTabuleiro("Posicao não esta no tabuleiro.");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca(Peca peca, Posicao posicao) {
		if((haUmaPeca(posicao))) {
			throw new ExceptionTabuleiro("Já existe a pessa na posição: " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()]= peca;
		peca.posicao = posicao;
	}
	
	private boolean posicaoExistente(int linha, int coluna) {
			return linha >= 0 && linha < linhas && coluna >= 0 && coluna< colunas;
	}
	
	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExistente(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean haUmaPeca(Posicao posicao) {
		if(!posicaoExistente(posicao)) {
			throw new ExceptionTabuleiro("Posicao não esta no tabuleiro.");
		}
		return peca(posicao) != null;
	}
}
