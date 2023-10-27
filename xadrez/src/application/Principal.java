package application;

import board.Tabuleiro;
import chess.PartidaXadrez;

public class Principal {

	public static void main(String[] args) {
		
		PartidaXadrez partida = new PartidaXadrez();
		UI.printTabuleiro(partida.getPecas());

	}

}
