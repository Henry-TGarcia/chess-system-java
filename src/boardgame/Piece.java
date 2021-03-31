package boardgame;

public class Piece {
	//Associação
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
