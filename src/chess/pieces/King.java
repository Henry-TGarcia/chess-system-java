package chess.pieces;

import boardgame.Tabuleiro;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	//Construtor
	public King(Tabuleiro board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	
	//Método
	@Override
	public String toString() {
		return "K";
	}

}
