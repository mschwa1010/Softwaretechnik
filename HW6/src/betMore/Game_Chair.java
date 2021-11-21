package betMore;

import java.util.Scanner;

public class Game_Chair {

	public static void main(String[] args) {
		
		BetMore_Game bet = new BetMore_Game();
		
		Player computer = new Player(bet);
		Player player_2 = new Player(bet);	
		
		computer.start();
		player_2.start();
		
		for(int i=0; i<4; i++) {
			
			boolean validInput = false;
			String input = new String();
			
			System.out.println("Your current Number is: "+player_2.getCardNumber());
			
			while (!validInput) {
				Scanner s = new Scanner(System.in);
				System.out.println("Do you want to choose a new Number? [yes][no]");
				input = s.nextLine();
				if(input.equals("yes")||input.equals("no")) validInput=true;
				else System.err.println("Invalid input!");
			}
			
			if(input.equals("yes")) player_2.start();
			else break;
			
		}
		
		System.out.println("Player_2's cardNumer: "+player_2.getCardNumber() + " Computer's cardNumber: "+ computer.getCardNumber());
		Player winner = bet.findWinner(computer, player_2);
		if(winner.equals(player_2))System.out.println("player_2 wins!");
		else System.out.println("computer wins!");

		

	}

}
