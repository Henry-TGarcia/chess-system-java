package chess;

import boardgame.Piece;
import boardgame.Tabuleiro;

public class ChessPiece extends Piece {
	//Associação
	private Color color;

	//Construtor
	public ChessPiece(Tabuleiro board, Color color) {
		super(board);
		this.color = color;
	}

	//Gets e Sets
	public Color getColor() {
		return color;
	}

	
	
	
}
