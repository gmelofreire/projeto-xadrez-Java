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

	public Integer getColunas() {
		return colunas;
	}

	public Peca peca(int x, int y) {
		return pecas[x][y];
	}
	
	public Peca[][] getPecas() {
		return pecas;
	}
	public Peca peca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new BoardException("ERRO AO LOCALIZAR A PEÇA: A LOCALIZAÇÃO INFORMADA NÃO EXISTE");
		}
		else {
		return pecas[posicao.getLinha()][posicao.getColuna()];
		}
	}
	
	public void iniciarPeca(Peca peca, Posicao posicao) {
		if(!posicaoExiste(posicao)){
			throw new BoardException("ERRO AO INICIAR PEÇA: A LOCALIZAÇÃO INFORMADA NÃO EXISTE");
		}
		if(existePeca(posicao)) {
			throw new BoardException("ERRO AO INICIAR PEÇA: A LOCALIZAÇÃO INFORMADA JÁ TEM UMA PEÇA");
			
		}
		else {
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
		}
	}
	
	
	
	public boolean posicaoExiste(Posicao posicao){
		if(posicao.getColuna() < 0 || posicao.getColuna() > pecas.length) {
			return false;
		}
		else if(posicao.getLinha() < 0 || posicao.getLinha() > pecas.length) {
			return false;
		}
		else {
			return true;
		}
	}
	public boolean existePeca(Posicao posicao) {
		if(peca(posicao) != null) {
			return true;
		}
		else
			return false;
		
	}
	
	

	
}
