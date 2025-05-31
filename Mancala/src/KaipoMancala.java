import java.util.Scanner;
public class KaipoMancala {
	private int[][] board;
	private String player1;
	private String player2;
	private int p1Store;
	private int p2Store;
	Scanner kb = new Scanner(System.in);
	
	public KaipoMancala() {
		board = new int[2][6];
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col<board[0].length;col++) {
				board[row][col] = 4;
			}
		}
		player1 = "Player 1";
		player2 = "Player 2";
		p1Store = 0;
		p2Store = 0;
	}//end of default constructor
	
	public KaipoMancala(String user1, String user2) {
		board = new int[2][6];
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col<board[0].length;col++) {
				board[row][col] = 4;
			}
		}
		player1 = user1;
		player2 = user2;
		p1Store = 0;
		p2Store = 0;
	}
	
	public void printBoard() {
		System.out.println("=======Mancala Board=======");
		System.out.println("PITS:\t6  5  4  3  2  1");
		System.out.println("\t----------------");
		
		for(int row = 0; row < board.length; row++) {
			System.out.print("\t");
			for(int col = 0; col<board[0].length;col++) {
				System.out.print(board[row][col] + "  ");
			}
			if(row == 0) {
				System.out.println();
				System.out.print(" P2: " + p2Store + "\t\t\t  " + p1Store + " :P1");
				System.out.println();
			} else {
				System.out.println();
			}
		}
		System.out.println("\t----------------");
		System.out.println("PITS:\t1  2  3  4  5  6");
	}
	
	public void p1Turn(int pit) {
		//player 1 gets the bottom lane and right store
		int numRocks = board[1][pit];
		board[1][pit] = 0;
		int row = 1;
		boolean goAgain = false;
		
		//Going through all rocks
		for(int i = numRocks; i > 0; i--) {
			goAgain = false;
			//bottom rotation
			if(row == 1) {
				pit++;
				if(pit <= 5) {
					board[row][pit]++;
				} else {
					p1Store++;
					row = 0;
					goAgain = true;
				}
			}
			
			//top rotation
			if(row == 0) {
				pit--;
				if(pit >= 0) {
					board[row][pit]++;
				} else {
					row = 1;
				}
			}	
		}
		
		//When land on empty
		if(row == 1) {
			if(board[row][pit] - 1 == 0) {
				p1Store += (board[row][pit] + board[0][pit]);
				board[row][pit] = 0;
				board[0][pit] = 0;
			}
		}
		
		printBoard();
		if(goAgain) {
			System.out.print(player1 + " goes again: ");
			int val = kb.nextInt();
			
			while(1 > val && val > 6) {
				System.out.print(player1 + " enter a value between 1 - 6. Try again: ");
				val = kb.nextInt();
			}
			
			p1Turn(val-1);
		}
		
	}
	
	//player 2
	public void p2Turn(int sub) {
		//player 2 gets the top lane and left store
		int pit = 5-sub;
		int numRocks = board[0][pit];
		board[0][pit] = 0;
		int row = 0;
		boolean goAgain = false;
		
		//Going through all rocks
		for(int i = numRocks; i > 0; i--) {
			goAgain = false;
			//bottom rotation
			if(row == 1) {
				pit++;
				if(pit <= 5) {
					board[row][pit]++;
				} else {
					row = 0;
				}
			}
			
			//top rotation
			if(row == 0) {
				pit--;
				if(pit >= 0) {
					board[row][pit]++;
				} else {
					row = 1;
					p2Store++;
					goAgain = true;
				}
			}	
		}
		
		//When land on empty
		if(row == 0) {
			if(board[row][pit] - 1 == 0) {
				p1Store += (board[row][pit] + board[1][pit]);
				board[row][pit] = 0;
				board[1][pit] = 0;
			}
		}
		
		printBoard();
		if(goAgain) {
			System.out.print(player2 + " goes again: ");
			int val = kb.nextInt();
			
			while(1 > val && val > 6) {
				System.out.print(player2 + " enter a value between 1 - 6. Try again: ");
				val = kb.nextInt();
			}
			
			p2Turn(val-1);
		}

	}
	
	//Game End
	public boolean gameOver() {
		int topSum = 0;
		int bottomSum = 0;
		
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col < board[0].length; col++) {
				if(row == 0) {
					topSum += board[row][col];
				} else {
					bottomSum += board[row][col];
				}
			}
		}
		
		if(topSum == 0 || bottomSum == 0) {
			p2Store += topSum;
			p1Store += bottomSum;
			for(int row = 0; row < board.length; row++) {
				for(int col = 0; col<board[0].length;col++) {
					board[row][col] = 4;
				}
			}
			return false;
		} else {
			return true;
		}
	}
	
	public int getp1Score() {
		return p1Store;
	}
	
	public int getp2Score() {
		return p2Store;
	}
}

