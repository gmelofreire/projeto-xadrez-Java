package chess;

import board.Peca;
import board.Posicao;
import board.Tabuleiro;
import chess.pecas.Rei;
import chess.pecas.Torre;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro();
		setupInicial();
	}
	
	public PecaXadrez[][] getPecas(){
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez) tabuleiro.getPecas()[i][j];
			}
		}
		return mat;
		
	}
	
	public PecaXadrez realizarMovimentacao(PosicaoXadrez posicaoOrigem, PosicaoXadrez posicaoFinal) {
		Posicao posOrigem =  posicaoOrigem.paraPosicao();
		Posicao posFinal = posicaoFinal.paraPosicao();
		validarPosicaoOrigem(posOrigem);
		Peca pecaCapturada = fazerMovimento(posOrigem, posFinal);
		return (PecaXadrez) pecaCapturada;
	}
	
	private Peca fazerMovimento(Posicao posOrigem, Posicao posFinal) {
		Peca p = tabuleiro.removerPeca(posOrigem);
		Peca pecaCapturada = tabuleiro.removerPeca(posFinal);
		tabuleiro.iniciarPeca(p, posFinal);
		return pecaCapturada;
	}
	
	private void validarPosicaoOrigem(Posicao pos) {
		if(!tabuleiro.existePeca(pos)) {
			throw new ChessException("PEÇA NÃO ENCONTRADA NA LOCALIZAÇÃO INFORMADA");
		}
	}
	
	public void iniciarPeca(char coluna, int linha, Peca peca) {
		tabuleiro.iniciarPeca(peca, new PosicaoXadrez(coluna, linha).paraPosicao());
	}
	
	public void setupInicial() {
		
		//Inicialização das peças pretas
		iniciarPeca('a', 8, new Torre(tabuleiro, Cor.PRETO));
		iniciarPeca('h', 8, new Torre(tabuleiro, Cor.PRETO));	
		iniciarPeca('e', 8, new Rei(tabuleiro, Cor.PRETO));
		
		//Inicialização das peças brancas
		iniciarPeca('a', 1, new Torre(tabuleiro, Cor.BRANCO));
		iniciarPeca('h', 1, new Torre(tabuleiro, Cor.BRANCO));
		iniciarPeca('e', 1, new Rei(tabuleiro, Cor.BRANCO));	
	}
	
}
