package board;

public abstract class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;	
		posicao = null;							//a posicao de uma peca recem iniciada eh zero
	}	

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
}
