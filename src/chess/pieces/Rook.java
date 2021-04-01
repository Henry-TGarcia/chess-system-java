package chess.pieces;

import boardgame.Tabuleiro;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	//Construtor
	public Rook(Tabuleiro board, Color color) {
		super(board, color);
	}
	
	//Método
	@Override
	public String toString() {
		return "R"; 
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColunms()];
		return mat;
	}

}
