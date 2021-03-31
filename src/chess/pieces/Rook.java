package chess.pieces;

import boardgame.Tabuleiro;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	//Construtor
	public Rook(Tabuleiro board, Color color) {
		super(board, color);
	}
	
	//M�todo
	@Override
	public String toString() {
		return "R"; 
	}

}
