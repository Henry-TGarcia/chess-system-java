package chess;

import boardgame.Piece;
import boardgame.Position;
import boardgame.Tabuleiro;

public abstract class ChessPiece extends Piece {
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

	//Métodos
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
	
}
