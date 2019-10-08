package game;

import java.util.Scanner;

public class TicTacToeMain {
	
	public static void main(String[] args) {
		
		String[] players = UI.start(new Scanner(System.in));
		TicTacToeController ttc = new TicTacToeController();
		ttc.setUpPlayers(players);


		String userAnswer = "";
		while(!userAnswer.equals("end")) {
			UI.printBoard(ttc.getBoard());
			int[] move = UI.readTurn(new Scanner(System.in), ttc.getTurn());	
			String result = ttc.makeMove(move[0], move[1]);

			switch (result){
				case "w":
					userAnswer = UI.showResult(ttc.getTurn(), ttc.getScore(), new Scanner(System.in));
					break;
				case "d":
					userAnswer = UI.draw(new Scanner(System.in));
					break;
			}

			if(userAnswer.equals("y"))
				ttc.reset();
		}
	}
		
}

