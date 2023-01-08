package hangman;

public class RoundProgress {
	private static void roundZero() {
		System.out.println("_|____");
	}
	
	private static void roundOne() {
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println("_|____");
	}
	
	private static void roundTwo() {
		System.out.println("_______");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println("_|____");
	}
	
	private static void roundThree() {
		System.out.println("_______");
		System.out.println(" |     |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println("_|____");
	}
	
	private static void roundFour() {
		System.out.println("_______");
		System.out.println(" |    |");
		System.out.println(" |    o");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println("_|____");
	}
	
	private static void roundFive() {
		System.out.println("_______");
		System.out.println(" |    |");
		System.out.println(" |    o");
		System.out.println(" |   / \\");
		System.out.println(" |");
		System.out.println("_|____");
	}
	
	private static void roundSix() {
		System.out.println("_______");
		System.out.println(" |    |");
		System.out.println(" |    o");
		System.out.println(" |   /|\\");
		System.out.println(" |");
		System.out.println("_|____");
	}
	
	private static void roundSeven() {
		System.out.println("_______");
		System.out.println(" |    |");
		System.out.println(" |    o");
		System.out.println(" |   /|\\");
		System.out.println(" |   / \\");
		System.out.println("_|____");
	}
	
	public static void showRound(int roundsLeft) {
		int rounds = 7-roundsLeft;
		
		switch(rounds) {
		case 0: 
			roundZero();
			break;
		case 1: 
			roundOne();
			break;
		case 2: 
			roundTwo();
			break;
		case 3: 
			roundThree();
			break;
		case 4: 
			roundFour();
			break;
		case 5: 
			roundFive();
			break;
		case 6: 
			roundSix();
			break;
		case 7: 
			roundSeven();
			break;
		}
		
	}
}
