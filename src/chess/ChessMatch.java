package chess;


import boardgame.Tabuleiro;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	//Associa�ao
	private Tabuleiro board;
	
	//Construtor
	public ChessMatch() {
		board = new Tabuleiro(8,8);	
		initialSetup();
	}
	
	//M�todos
	public ChessPiece[][] getPieces(){//retorna uma matriz de pe�as de xadrez correspondente a partida
		ChessPiece[][] matriz = new ChessPiece[board.getRows()][ board.getColunms()];
		
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColunms(); j++) {
				matriz[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return matriz; //retorna a matriz de pe�as da minha partida de xadrez
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {//respons�vel por iniciar a partida de xadrez colocando as pe�as no tabulerio
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
	}
}
