package boardgame;

public class Position {
	//Atributos
	private int row;
	private int colunm;
	
	//Construtores
	public Position(int row, int colunm) {
		this.row = row;
		this.colunm = colunm;
	}

	//Gets e sets
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColunm() {
		return colunm;
	}

	public void setColunm(int colunm) {
		this.colunm = colunm;
	}
	
	@Override
	public String toString() {
		return row + ", " + colunm;
	}
	
}
