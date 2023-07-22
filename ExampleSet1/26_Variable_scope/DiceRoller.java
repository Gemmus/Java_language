import java.util.Random;

public class DiceRoller {
		
	DiceRoller(){
		Random random = new Random();
		int number = 0;
		roll(random, number);
	}
	
	void roll(Random random, int number) {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}
	
	// or alternatively, instead of passing them as args, they can be set as global variables:
	/*
	
	Random random;
	int number;
	
	DiceRoller(){
		random = new Random();
		roll();
	}
	
	void roll() {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}
	
	 */
}