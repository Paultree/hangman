package hangman;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		//random word generator
		String word = ReadJSONFile.generateWord();
		//converts word into underscores
		String userProgress = GameOutput.progressInit(word);
		
		GameOutput.wordProgress(userProgress);
		// console logs the current progress of the word
		
		int rounds = 7;
		
		//while loop handles game logic//
		while (rounds >= 0) {
			RoundProgress.showRound(rounds);
			//shows hang man progress 
			
			if (rounds == 0) {
				System.out.println("Game over! The word was " + word);
				return;
			}
			
			Scanner guessObj = new Scanner(System.in);
			System.out.println("Enter a letter or word:");
			String userGuess = guessObj.nextLine().toLowerCase();
			System.out.println("You guessed: " + userGuess);
			//handles user input
			
			rounds--;
			//decrements round by 1
			
			if (userGuess.length() > 1 && !userGuess.equals(word)) {
				GameOutput.wordProgress(userProgress);
				continue;
			}
			//

			if (userGuess.equals(word)) {
				System.out.println("You win!");
				rounds = -1;
			} 
			
			
			userProgress = GameOutput.checkGuess(word, userGuess, userProgress);
			//evaluates the user's input and updates answer word progress.
			GameOutput.wordProgress(userProgress);
		}
	}

}
