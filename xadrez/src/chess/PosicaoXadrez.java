package chess;

import board.Posicao;

public class PosicaoXadrez {
	
	private char coluna;
	private Integer linha;
	
	public PosicaoXadrez(char coluna, Integer linha) {
		if(coluna < 'a' || coluna > 'h' || linha < 0 || linha > 8) {
			throw new ChessException("ERRO AO INSTANCIAR A POSIÇÃO XADREZ: INSIRA UM VALOR VALIDO (ENTRE a1 E h8)");
		}
		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public void setColuna(char coluna) {
		this.coluna = coluna;
	}

	public Integer getLinha() {
		return linha;
	}

	public void setLinha(Integer linha) {
		this.linha = linha;
	}
	
	protected Posicao paraPosicao() {
		int linha = 8 - this.linha;
		int coluna = this.coluna - 'a';
		Posicao pos = new Posicao(linha, coluna);
		return pos;
	}
	
	protected PosicaoXadrez dePoicao(Posicao pos) {
		return new PosicaoXadrez((char) (pos.getColuna() - 'a'), pos.getLinha());
	}

	@Override
	public String toString() {
		return "" + coluna + linha;
	}
	
}
