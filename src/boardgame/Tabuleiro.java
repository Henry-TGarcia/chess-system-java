package boardgame;

public class Tabuleiro {
	//Atributos
	private int rows;
	private int colunms;
	private Piece[][] pieces; //Matriz de peças
	
	//Construtores
	public Tabuleiro(int rows, int colunms) {
		if(rows < 1 || colunms < 1) {//tratamento de excessões
			throw new BoardException("Error creating board: there must be at least 1 row and 1 colunm");
		}
		this.rows = rows;
		this.colunms = colunms;
		pieces = new Piece[rows][colunms];
	}

	//Gets e Sets
	public int getRows() {
		return rows;
	}

	public int getColunms() {
		return colunms;
	}
	
	//Métodos
	public Piece piece(int row, int colunm) {
		if(!positionExists(row, colunm)) {//tratamento de excessões
			throw new BoardException("Position not on the board");
		}
		return pieces[row][colunm];
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position)) {//tratamento de excessões
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColunm()];
	}
	
	public void placePiece(Piece piece, Position position) {//colocar peças
		if(thereIsAPiece(position)) {//tratamento de excessões
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColunm()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int colunm) {
		return row >= 0 && row < rows && colunm >= 0 && colunm < colunms;
	}//|
	 //V
	public boolean positionExists(Position position) {//testando se uma posição existe
		return positionExists(position.getRow(), position.getColunm());
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {//tratamento de excessões
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
	
}
