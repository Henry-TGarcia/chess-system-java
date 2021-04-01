package boardgame;

public abstract class Piece {
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

	//Métodos
	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColunm()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] matriz = possibleMoves();
		for (int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				if(matriz[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
