package game;

public class Player {
	
	private String name;
	private int move;
	private int wins;
	private int losses;
	private boolean turn = true;

	
	public Player(String name, String move) {
		this.name = name;
		this.move = Integer.parseInt(move);
	}
	
	public int getMove() {
		return this.move;
	}
	
	public boolean getTurn() {
		return this.turn;
	}
	
	public void setTurn(boolean turn) {
		this.turn = turn;
	}
	
	public void increasetWins() {
		this.wins++;
	}
	
	public void increaseLosses() {
		this.losses++;
	}
	
	public int getWins() {
		return this.wins;
	}
	
	public int getLosses() {
		return this.losses;
	}
}
