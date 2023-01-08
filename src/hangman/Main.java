package hangman;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String word = ReadJSONFile.generateWord();
		String userProgress = GameOutput.progressInit(word);
		
		System.out.println(word);
		
		
		GameOutput.wordProgress(userProgress);
		
		int rounds = 7;
		
		
		while (rounds >= 0) {
			RoundProgress.showRound(rounds);
			if (rounds == 0) {
				System.out.println("Game over! The word was " + word);
				return;
			}
			
			Scanner guessObj = new Scanner(System.in);
			System.out.println("Enter letter:");
			String userGuess = guessObj.nextLine().toLowerCase();
			System.out.println("You guessed the letter: " + userGuess);
			rounds--;
			
			if (userGuess.length() > 1 && !userGuess.equals(word)) {
				GameOutput.wordProgress(userProgress);
				continue;
			}

			if (userGuess.equals(word)) {
				System.out.println("You win!");
				rounds = -1;
			} 
			
			
			
			userProgress = GameOutput.checkGuess(word, userGuess, userProgress);
			GameOutput.wordProgress(userProgress);
		}
	}

}
