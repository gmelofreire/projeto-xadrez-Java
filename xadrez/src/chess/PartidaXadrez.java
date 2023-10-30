package chess;

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
	
	public void setupInicial() {
		
		//Inicialização das peças pretas
		tabuleiro.iniciarPeca(new Torre(tabuleiro, Cor.PRETO), new Posicao(0, 0));	
		tabuleiro.iniciarPeca(new Torre(tabuleiro, Cor.PRETO), new Posicao(0, 7));	
		tabuleiro.iniciarPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(0, 4));
		
		//Inicialização das peças brancas
		tabuleiro.iniciarPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(7, 0));
		tabuleiro.iniciarPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(7, 7));
		tabuleiro.iniciarPeca(new Rei(tabuleiro, Cor.BRANCO), new Posicao(7, 4));	
	}
	
}
