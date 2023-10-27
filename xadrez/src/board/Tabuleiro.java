package board;

public class Tabuleiro {
	
	private Integer linhas = 8;
	private Integer colunas = 8;
	protected Peca[][] pecas;
	
	public Tabuleiro() {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public Integer getLinhas() {
		return linhas;
	}

	public void setLinhas(Integer linhas) {
		this.linhas = linhas;
	}

	public Integer getColunas() {
		return colunas;
	}

	public void setColunas(Integer colunas) {
		this.colunas = colunas;
	}
	
	public Peca peca(int x, int y) {
		return pecas[x][y];
	}
	
	
	public Peca[][] getPecas() {
		return pecas;
	}
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void iniciarPeca(Peca peca, Posicao posicao) {
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}

	
}
