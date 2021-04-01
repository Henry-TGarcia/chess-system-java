package chess.pieces;

import boardgame.Position;
import boardgame.Tabuleiro;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	// Construtor
	public Rook(Tabuleiro board, Color color) {
		super(board, color);
	}

	// M�todo
	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColunms()];

		Position p = new Position(0, 0);

		// Verificar acima da minha pe�a
		p.setValues(position.getRow() - 1, position.getColunm());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
			p.setRow(p.getRow() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		// Verificar a esqueda da minha pe�a
		p.setValues(position.getRow(), position.getColunm() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
			p.setColunm(p.getColunm() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		// Verificar a direita da minha pe�a
		p.setValues(position.getRow(), position.getColunm() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
			p.setColunm(p.getColunm() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		// Verificar baixo da minha pe�a
		p.setValues(position.getRow() + 1, position.getColunm());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
			p.setRow(p.getRow() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColunm()] = true;
		}

		return mat;
	}

}
