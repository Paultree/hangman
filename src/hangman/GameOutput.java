package hangman;

public class GameOutput {
	
	public static String progressInit(String str) {
		String wordProgress = str.replaceAll(".", "_ ");
		
		return wordProgress.trim();
	}
	
	public static String checkGuess(String answer, String guess, String progress) {
		char[] guessArr = guess.toCharArray();
		
		char[] progressArr = progress.toCharArray();
		
		for (int i = 0; i < guessArr.length; i++) {
			String guessLetter = Character.toString(guessArr[i]);
			
			if (answer.contains(guessLetter)) {
				int index = answer.indexOf(guessLetter);
				//index of answer 0,1,2,3,4 _____> progress 0,2,4,6,8 _ _ _ _ _
				while (index >= 0) {
					progressArr[index*2] = guessLetter.charAt(0);
					index = answer.indexOf(guessLetter, index + 1);
				}
			}
		}
		return String.valueOf(progressArr);
	}
	
	public static void wordProgress(String str) {
		System.out.println("The word is:" + str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
