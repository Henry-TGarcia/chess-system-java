package chess.pieces;

import boardgame.Position;
import boardgame.Tabuleiro;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	// Construtor
	public King(Tabuleiro board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	// Método
	@Override
	public String toString() {
		return "K";
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColunms()];

		Position p = new Position(0, 0);

		// Acima
		p.setValues(position.getRow() - 1, position.getColunm());
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		// Abaixo
		p.setValues(position.getRow() + 1, position.getColunm());
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		// Esquerda
		p.setValues(position.getRow(), position.getColunm() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		// Direita
		p.setValues(position.getRow(), position.getColunm() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		// NW(noroeste)
		p.setValues(position.getRow() - 1, position.getColunm() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		// NE(nordeste)
		p.setValues(position.getRow() - 1, position.getColunm() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		// SW(suloeste)
		p.setValues(position.getRow() + 1, position.getColunm() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		// SE(suleste)
		p.setValues(position.getRow() + 1, position.getColunm() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		return mat;
	}

}
