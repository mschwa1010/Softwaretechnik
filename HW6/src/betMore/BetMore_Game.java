package betMore;

public class BetMore_Game {
	
	private Shuffel shuffel = new Shuffel();
	
	public int play() {
		return shuffel.pickCard();
	}
	
	public Player findWinner(Player computer, Player player_2) {
		if(player_2.getCardNumber()>=computer.getCardNumber()) return player_2;
		else return computer;
	}
	

}
