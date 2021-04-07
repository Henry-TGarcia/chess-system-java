package chess.pieces;

import boardgame.Position;
import boardgame.Tabuleiro;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

	// Construtor
	public Knight(Tabuleiro board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	// Método
	@Override
	public String toString() {
		return "N";
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColunms()];

		Position p = new Position(0, 0);

		p.setValues(position.getRow() - 1, position.getColunm() - 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		p.setValues(position.getRow() - 2, position.getColunm() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		p.setValues(position.getRow() - 2, position.getColunm() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		p.setValues(position.getRow() - 1, position.getColunm() + 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		p.setValues(position.getRow() + 1, position.getColunm() + 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		p.setValues(position.getRow() + 2, position.getColunm() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		p.setValues(position.getRow() + 2, position.getColunm() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		p.setValues(position.getRow() + 1, position.getColunm() - 2);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		return mat;
	}

}
