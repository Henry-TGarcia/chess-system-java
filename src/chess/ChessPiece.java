package chess;

import boardgame.Piece;
import boardgame.Position;
import boardgame.Tabuleiro;

public abstract class ChessPiece extends Piece {
	//Atributo
	private int moveCount;
	
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
	
	public int getMoveCount() {
		return moveCount;
	}
	
	public void increaseMoveCount() {
		moveCount++;
	}
	
	public void decreaseMoveCount() {
		moveCount--;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}

	//Métodos
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
	
}
