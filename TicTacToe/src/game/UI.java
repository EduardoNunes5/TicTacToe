package game;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UI {
	
	public static String[] start(Scanner sc) {
		System.out.print("Player 1 name: ");
		String p1Name = sc.nextLine();
		System.out.print("Player 1 move (0 or 1): ");
		String p1Move = sc.nextLine();
		System.out.print("Player 2 name: " );
		String p2Name = sc.nextLine();
		String p2Move = "";
		if(p1Move.equals("0"))
			p2Move = "1";
		else
			p2Move = "0";

		return new String[] {p1Name, p1Move, p2Name, p2Move};
		
	}
	
	public static void printBoard(String[][] board) {
		int size = board.length;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				printMovements(board, i, j);
			}		
			if(i < 2){
				System.out.println();
				System.out.println("-----------");
			}
		}
	}
	
	public static int[] readTurn(Scanner sc, String player) {
		System.out.println();
		System.out.println(player + " turn.");
		System.out.print("line -> ");
		int line = sc.nextInt();
		System.out.print("column -> ");
		int column = sc.nextInt();		
		return new int[] {line, column};
	}
	
	public static String showResult(String player, int[] score, Scanner sc) {
		System.out.println();
		System.out.println(player.toUpperCase() + " WINS!");
		System.out.println("---------SCORE---------");
		System.out.println(player+ ":" );
		System.out.println("wins: " + score[0] +", losses: " + score[1]);
		System.out.println("-----------------------");
		System.out.println();
		
		System.out.print("enter any key to finish or y to continue playing ->> ");
		String option = sc.nextLine();
		return option;
	}
	

	
	private static void printMovements(String[][] board, int i, int j) {
		if(board[i][j] == null || "".equals(board[i][j].trim()))
			System.out.print("   ");
		else 
			System.out.print(" " + board[i][j] + " ");
		if(j < 2)
			System.out.print("|");
		
	}


	public static String draw(Scanner sc){
		System.out.println("-----------  DRAW!!! ----------- ");
		System.out.print("Do you want to play again? (y to continue, any other key to finish) ->> ");
		String answer = sc.nextLine();

		return answer;

	}
	
	

		

}
