package boardgame;

public class Piece {
	//Associa��o
	protected Position position;
	private Tabuleiro board;
	
	//Construtores
	public Piece(Tabuleiro board) {
		this.board = board;
		position = null;
	}

	//Gets e Sets
	protected Tabuleiro getBoard() {
		return board;
	}


	
	
	
}
