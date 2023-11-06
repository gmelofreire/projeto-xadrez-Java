package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.PartidaXadrez;
import chess.PecaXadrez;
import chess.PosicaoXadrez;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PartidaXadrez partida = new PartidaXadrez();
		
		while(true) {
			
			try {
				UI.limparTela();
				UI.printTabuleiro(partida.getPecas());
				System.out.println();
				System.out.print("Insira a posicao de origem: ");
				PosicaoXadrez posOrigem = UI.lerPoicaoXadrez(sc);
				System.out.println();
				System.out.print("Insira a posicao alvo: ");
				PosicaoXadrez posFinal = UI.lerPoicaoXadrez(sc);
				
				PecaXadrez pecaCapturada = partida.realizarMovimentacao(posOrigem, posFinal);
			}
			catch (ChessException e) {
				System.err.println(e.getMessage());
				sc.nextLine();
			}
			catch (InputMismatchException e){
				System.err.println(e.getMessage());
				sc.nextLine();
			}
		
		
		}

	}
}
