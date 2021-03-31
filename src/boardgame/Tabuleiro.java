package boardgame;

public class Tabuleiro {
	//Atributos
	private int rows;
	private int colunms;
	private Piece[][] pieces; //Matriz de pe�as
	
	//Construtores
	public Tabuleiro(int rows, int colunms) {
		this.rows = rows;
		this.colunms = colunms;
		pieces = new Piece[rows][colunms];
	}

	//Gets e Sets
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColunms() {
		return colunms;
	}

	public void setColunms(int colunms) {
		this.colunms = colunms;
	}
	
	//M�todos
	public Piece piece(int row, int colunm) {
		return pieces[row][colunm];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColunm()];
	}
	
	public void placePiece(Piece piece, Position position) {//colocar pe�as
		pieces[position.getRow()][position.getColunm()] = piece;
		piece.position = position;
	}
	
}
