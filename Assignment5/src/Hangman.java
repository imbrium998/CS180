import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner (System.in);
		
		//String word = HangmanDict.pickWord();
		String word = "monopoly";
		int wordLen = 0;
		int guesses = 0;
		String guessLetters = "";
		Boolean win = Boolean.FALSE;
		
		wordLen = word.length();
		guesses = 0;
		
		System.out.println("I have picked a word " + word);
		System.out.println("Here's the template in which each dash denotes a single letter.");
		System.out.println(wordLen);
		
		
		System.out.println("There were " + guesses + " wrong guesses so far.  Please enter a letter:");
		guessLetters = kb.next();
		
		if (word.contains(guessLetters))
				{
					guesses = guesses ++ ;
					System.out.println("guesses: " + guesses);
				}
		
		
	
	}

}
