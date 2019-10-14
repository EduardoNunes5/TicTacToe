package game;

public class TicTacToe {
	private String[][] board;		
	public TicTacToe() {
		this.board = new String[3][3];
		fillEmptyBoard();
	}
	
	
	public void makeMove(int i, int j, int playerMove) {
		try {
			if(!board[i][j].equals("")) return;
			switch(playerMove) {
				case 0:
					board[i][j] = "O";
					break;
				case 1:
					board[i][j] = "X";
					break;
				default:
					System.out.println("Illegal movement attempt.");
					break;
			}
			
		}	
		catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println();
			System.out.println("Illegal index");
		}
	}
	
	
	public boolean checkWin() {
		int upLeftToRight = 0;
		int mainDiagonal = 0;
		int midLeftToRight = 0;
		int downLeftToRight = 0;
		int leftTopToBottom = 0;
		int middleTopToBottom = 0;
		int rightTopToBottom = 0;
		for(int i = 0; i < this.board.length-1; i ++) {
			if(board[i][i].equals(board[i+1][i+1]) && !board[i][i].trim().equals(""))
				mainDiagonal++;	
			if(board[0][i].equals(board[0][i+1]) && !board[0][i].trim().equals("")) 
				upLeftToRight++;									
			if(board[1][i].equals(board[1][i+1]) && !board[1][i].trim().equals(""))
				midLeftToRight++;
			if(board[2][i].equals(board[2][i+1]) && !board[2][i].trim().equals(""))
				downLeftToRight++;
			if(board[i][0].equals(board[i+1][0]) && !board[i][0].trim().equals("")) 
				leftTopToBottom++;
			if(board[i][1].equals(board[i+1][1]) && !board[i][1].trim().equals(""))
				middleTopToBottom++;
			if(board[i][2].equals(board[i+1][2]) && !board[i][2].trim().equals(""))
				rightTopToBottom++;
		}
		
		if(upLeftToRight == 2 || mainDiagonal == 2 || midLeftToRight == 2 || downLeftToRight == 2 || leftTopToBottom == 2 || middleTopToBottom == 2 || rightTopToBottom == 2) {
			return true;
		}
		if(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[2][0].trim().equals(""))
			return true;
		
		return false;
	}

	public boolean checkDraw(){
		int cont = 0;
		for(int i = 0; i < this.board.length; i ++){
			for(int j = 0; j < this.board.length; j ++)
			if(!board[i][j].equals("")){
				cont ++;
			}
		}

		if(cont == 9)
			return true;
		return false;

	}
	
	private void fillEmptyBoard() {
		for(int i = 0; i < this.board.length; i++) {
			for(int j = 0; j < this.board.length; j++) {
				this.board[i][j] = "";
			}
		}
	}
	
	public String[][] getBoard() {
		return this.board;
	}
	

}
