import java.util.Scanner;
import java.util.Arrays;

public class Hangman {

	public static void main(String[] args) {

		boolean isGameInPlay = true;
		int badGuesses = 0;
		int charLeft = 0;
		String hangmanWord = "monopoly";
		int wordLen = hangmanWord.length();
		String [] guessLetterPool = new String [wordLen];
		String wordOutput = "";
		int matchingIndexesCounter = 0;		
		
		// Convert lib word to all uppercase for comparison
		hangmanWord = hangmanWord.toUpperCase();
		
		
		// set the guessLetterPool array to all dashes "-" to begin game
		charLeft = wordLen;
		for (int at = 0; at < wordLen; at++)
		{			
			guessLetterPool[at] = "-";
		}
		
		// First get the hangman word from the console
		Scanner kb = new Scanner(System.in);
		
		// Get the guess from the console\
					System.out.println("I have picked a word.");
					System.out.println("Here's the template in which each dash denotes a single letter.");
					
					for (int i = 0; i < hangmanWord.length(); i++)
						{
							wordOutput = guessLetterPool[i];
							System.out.print(wordOutput + " ");
						}
				
		// Create a loop to keep accepting guesses from the console
		while(isGameInPlay) {			

			System.out.println();
			System.out.println("There are " + badGuesses + " wrong guesses so far.  Please enter a letter:");
			
			//System.out.println("Attempt ["+(tryCounter+1)+"] :: \n");
			String guessLetter = kb.next();
			guessLetter = guessLetter.toUpperCase();
	
			// Verify that the guess value is valid
			char guessedCharacter = ' ';
			if(guessLetter != null && !guessLetter.isEmpty()) 
			
				{
					// May want to add logic to check the size of the input and yell if they enter more than one character
					// May also want to check that the character is a letter from a-z
					guessedCharacter = guessLetter.charAt(0);
				} 
			else 
				{
				System.out.println("You need to provide a valid letter!!!");
				}		

			
			
			// Iterate over the word and check for matching letter(s)
			for (int i = 0; i <= (hangmanWord.length() - 1); i++) 
				{
								
					if(guessedCharacter == hangmanWord.charAt(i)) 
						{
							guessLetterPool[i] = guessLetter;
							matchingIndexesCounter = 1;
							charLeft--;
						}
					
				}	
			
			if(matchingIndexesCounter == 0)
				{
					System.out.println("Incorrect.");
					badGuesses++;
				}
			else
				{	
					matchingIndexesCounter = 0;
					System.out.println("Correct.");
					
				}
			
						
			for (int i = 0; i < hangmanWord.length(); i++)
				{
					wordOutput = guessLetterPool[i];
					System.out.print(wordOutput.toUpperCase() + " ");
				}

						
			if (badGuesses == 6) 
				{
					isGameInPlay = false;
					System.out.println("You lost.  The word is" + hangmanWord);
				}	
					
				
			else if (charLeft == 0)
				{
					isGameInPlay = false;
					System.out.println();
					System.out.println("You won!");
				}
					
			
		}
		kb.close();	
	}

}
