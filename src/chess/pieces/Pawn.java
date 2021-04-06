package chess.pieces;

import boardgame.Position;
import boardgame.Tabuleiro;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

	//Construtor
	public Pawn(Tabuleiro board, Color color) {
		super(board, color);
	}

	
	//Métodos
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColunms()];

		Position p = new Position(0, 0);
		
		if(getColor() == Color.WHITE) {
			p.setValues(position.getRow() - 1, position.getColunm()); //andar 1 casa
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColunm()] = true;
			}
			
			p.setValues(position.getRow() - 2, position.getColunm());//andar 2 casas na primeira jogada, se quiser
			Position p2 = new Position(position.getRow() - 1, position.getColunm());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColunm()] = true;
			}
			
			p.setValues(position.getRow() - 1, position.getColunm() - 1); //"comer" a peça adversária na diagonal Esquerda
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColunm()] = true;
			}
			
			p.setValues(position.getRow() - 1, position.getColunm() + 1); //"comer" a peça adversária na diagonal Direita
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColunm()] = true;
			}
		}
		else {
			p.setValues(position.getRow() + 1, position.getColunm()); //andar 1 casa
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColunm()] = true;
			}
			
			p.setValues(position.getRow() + 2, position.getColunm());//andar 2 casas na primeira jogada, se quiser
			Position p2 = new Position(position.getRow() + 1, position.getColunm());
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColunm()] = true;
			}
			
			p.setValues(position.getRow() + 1, position.getColunm() - 1); //"comer" a peça adversária na diagonal Esquerda
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColunm()] = true;
			}
			
			p.setValues(position.getRow() + 1, position.getColunm() + 1); //"comer" a peça adversária na diagonal Direita
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColunm()] = true;
			}
		}
		
		
		return mat;
	}
	
	@Override
	public String toString() {
		return "P";
	}

}
