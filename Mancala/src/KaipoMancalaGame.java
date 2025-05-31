import java.util.Scanner;

public class KaipoMancalaGame {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//APCSA/CS121
		//Mancala Game
		
		Scanner kb = new Scanner(System.in);
		
		
		//Game Start
		System.out.println("Welcome to Mancala!");
		try {
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		System.out.println("To start please enter player names(enter a 0 to skip).");
		try {
		    Thread.sleep(4000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		System.out.print("Player 1: ");
		String p1Name = kb.next();
		
		if(p1Name.equals("0")) {
			p1Name = "Player 1";
		}
		
		System.out.print("Player 2: ");
		String p2Name = kb.next();
		
		if(p2Name.equals("0")) {
			p2Name = "Player 2";
		}
		
		KaipoMancala game1 = new KaipoMancala(p1Name, p2Name);
		
		try {
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		//Playing the game
		System.out.println("Start!");
		game1.printBoard();
		while(game1.gameOver()) {
			//Player 1 turn
			System.out.print(p1Name + " select a pit: ");
			int p1Pit = kb.nextInt();
			
			while(1 > p1Pit && p1Pit > 6) {
				System.out.print(p1Name + " enter a value between 1 - 6. Try again: ");
				p1Pit = kb.nextInt();
			}
			
			game1.p1Turn(p1Pit-1);
			
			//Player 2 turn
			System.out.print(p2Name + " select a pit: ");
			int p2Pit = kb.nextInt();
			
			while(1 > p2Pit && p2Pit > 6) {
				System.out.print(p2Name + " enter a value between 1 - 6. Try again: ");
				p2Pit = kb.nextInt();
			}
			
			game1.p2Turn(p2Pit-1);
		}
		
		System.out.println("Game Over!");
		if(game1.getp1Score() > game1.getp2Score()) {
			System.out.println(p1Name + " Wins!");
			System.out.println("Get better " + p2Name);
		} else {
			System.out.println(p2Name + " Wins!");
			System.out.println("Get better " + p1Name);
		}
		
		System.out.println("\nWould you like a rematch?(Y/N)");
		String rematch = kb.next();
		 if(rematch.equalsIgnoreCase("y")) {
			 //Second game
			KaipoMancala game2 = new KaipoMancala(p1Name, p2Name);
			
			while(game2.gameOver()) {
				//Player 1 turn
				System.out.println(p1Name + " select a pit: ");
				int p1Pit = kb.nextInt();
				
				while(1 > p1Pit && p1Pit > 6) {
					System.out.println(p1Name + " enter a value between 1 - 6. Try again: ");
					p1Pit = kb.nextInt();
				}
				
				game2.p1Turn(p1Pit-1);
				
				//Player 2 turn
				System.out.println(p2Name + " select a pit: ");
				int p2Pit = kb.nextInt();
				
				while(1 > p2Pit && p2Pit > 6) {
					System.out.println(p2Name + " enter a value between 1 - 6. Try again: ");
					p2Pit = kb.nextInt();
				}
				
				game2.p2Turn(p2Pit - 1);
			}
			
			System.out.println("Game Over!");
			if(game2.getp1Score() > game2.getp2Score()) {
				System.out.println(p1Name + " Wins!");
				System.out.println("Get better " + p2Name);
			} else {
				System.out.println(p2Name + " Wins!");
				System.out.println("Get better " + p1Name);
			}
		 }
	}

}
