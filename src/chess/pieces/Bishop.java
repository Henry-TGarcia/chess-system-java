package chess.pieces;

import boardgame.Position;
import boardgame.Tabuleiro;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {

	//Construtor
	public Bishop(Tabuleiro board, Color color) {
		super(board, color);
	}

	// Método
	@Override
	public String toString() {
		return "B";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColunms()];

		Position p = new Position(0, 0);

		//NW (Noroeste)
		p.setValues(position.getRow() - 1, position.getColunm() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
			p.setValues(p.getRow() - 1, p.getColunm() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		//NE
		p.setValues(position.getRow() - 1, position.getColunm() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
			p.setValues(p.getRow() - 1, p.getColunm() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		//SE
		p.setValues(position.getRow() + 1, position.getColunm() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
			p.setValues(p.getRow() + 1, p.getColunm() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		//SW
		p.setValues(position.getRow() + 1, position.getColunm() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
			p.setValues(p.getRow() + 1, p.getColunm() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		return mat;
	}

}
