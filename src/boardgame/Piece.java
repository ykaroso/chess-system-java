package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		System.out.println("Criando nova peça");
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}


}
