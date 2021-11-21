package betMore;

public class Player {
	
	private int cardNumber;
	private BetMore_Game bet;
	
	public Player(BetMore_Game bet) {
		this.bet = bet;
	}
	
	public int start() {
		cardNumber = bet.play();
		return cardNumber;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
}
