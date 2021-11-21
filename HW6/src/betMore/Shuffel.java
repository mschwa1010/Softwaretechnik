package betMore;

import java.util.Random;

public class Shuffel {
	
	private Random random = new Random();
	
	public int pickCard() {
		return random.nextInt(100)+1;
	}

}
