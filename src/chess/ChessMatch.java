package chess;

import boardgame.Tabuleiro;

public class ChessMatch {
	//Associaçao
	private Tabuleiro board;
	
	//Construtor
	public ChessMatch() {
		board = new Tabuleiro(8,8);	
	}
	
	//Métodos
	public ChessPiece[][] getPieces(){//retorna uma matriz de peças de xadrez correspondente a partida
		ChessPiece[][] matriz = new ChessPiece[board.getRows()][ board.getColunms()];
		
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColunms(); j++) {
				matriz[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return matriz; //retorna a matriz de peças da minha partida de xadrez
	}
}
