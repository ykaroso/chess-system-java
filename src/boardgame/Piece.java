package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		System.out.println("Criando nova pe�a");
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}


}
