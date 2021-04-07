package chess.pieces;

import boardgame.Position;
import boardgame.Tabuleiro;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	//Associação
	private ChessMatch chessMatch;
	
	// Construtor
	public King(Tabuleiro board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch = chessMatch;
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
	
	private boolean testRookCastling(Position position) { //testando se a torre esta apta para o "Roque"
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p instanceof Rook && p.getColor() == getColor() && p.getMoveCount() == 0;
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
		
		//#Specialmove castling (roque)
		if(getMoveCount() == 0 && !chessMatch.getCheck()) {
			//#Specialmove castling kingside rook (roque pequeno)
			Position posT1 = new Position(position.getRow(), position.getColunm() + 3);
			if(testRookCastling(posT1)) {
				Position p1 = new Position(position.getRow(), position.getColunm() + 1);
				Position p2 = new Position(position.getRow(), position.getColunm() + 2);
				if(getBoard().piece(p1) == null && getBoard().piece(p2) == null) {
					mat[position.getRow()][position.getColunm() + 2] = true;
				}
				
			}
			//#Specialmove castling queenside rook (roque maior)
			Position posT2 = new Position(position.getRow(), position.getColunm() - 4);
			if(testRookCastling(posT2)) {
				Position p1 = new Position(position.getRow(), position.getColunm() - 1);
				Position p2 = new Position(position.getRow(), position.getColunm() - 2);
				Position p3 = new Position(position.getRow(), position.getColunm() - 3);
				if(getBoard().piece(p1) == null && getBoard().piece(p2) == null && getBoard().piece(p3) == null) {
					mat[position.getRow()][position.getColunm() - 2] = true;
				}
			}
		}
		return mat;
	}

}
