
/**
 * 
 * Hangman -- game program that presents user with a word, allows chances to guess all letters.   
 * 				User can guess all the letters in word to end game in success.
 * 				6 wrong guesses ends game in fail.
 * @author: David Klink
 * 
 *  
 **/





import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {

		// Declare all variables
		boolean isGameInPlay = true;
		int badGuesses = 0;
		int charLeft = 0;
		String hangmanWord = HangmanDict.pickWord();		
		int wordLen = hangmanWord.length();
		String [] guessLetterPool = new String [wordLen];
		String wordOutput = "";
		int matchingIndexesCounter = 0;		
		
		// Convert word to all upper case for comparison
		hangmanWord = hangmanWord.toUpperCase();
		
		
		// set the guessLetterPool array length to length of word chosen.  Set to all dashes "-" to begin game
		charLeft = wordLen;
		for (int at = 0; at < wordLen; at++)
			{			
				guessLetterPool[at] = "-";
			}
		
				
		// Start presentation of game.  Get the guesses from the console
		System.out.println("I have picked a word.");
		System.out.println("Here's the template in which each dash denotes a single letter.");
		Scanner kb = new Scanner(System.in);
			
		// Loop thru each letter in the arry to print template
			for (int i = 0; i < hangmanWord.length(); i++)
					{
						wordOutput = guessLetterPool[i];
						System.out.print(wordOutput + " ");
					}
				
		// Create a loop to keep accepting guesses from the console
		while(isGameInPlay) 
			{			
				System.out.println();
				System.out.println("There are " + badGuesses + " wrong guesses so far.  Please enter a letter:");
			
			//System.out.println("Attempt ["+(tryCounter+1)+"] :: \n");
				String guessLetter = kb.next();
				guessLetter = guessLetter.toUpperCase();
	
			// Verify that the guess value is valid
				char guessedCharacter = ' ';
				
				if(guessLetter != null && !guessLetter.isEmpty()) 
					{
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
			
				// Notify if guessed letter occurs in word or not
				// If no matches are found on previous loop, increment badGuesses counter and report incorrect to user
				if(matchingIndexesCounter == 0)
					{
						System.out.println("Incorrect.");
						badGuesses++;
					}
				
				// if correct matches are found, reset matchingIndexesCounter to 0 for next loop and report correct to user 
				else
					{	
						matchingIndexesCounter = 0;
						System.out.println("Correct.");
					}
			
				// Reprint current template set with dashes and letter(s) if there are correct guesses.   		
				for (int i = 0; i < hangmanWord.length(); i++)
					{
						wordOutput = guessLetterPool[i];
						System.out.print(wordOutput.toUpperCase() + " ");
					}

				// Set isGameInPlay to 'false' if 6 bad guesses have been given		
				if (badGuesses == 6) 
					{
						isGameInPlay = false;
						System.out.println("You lost.  The word is " + hangmanWord);
					}	
					
				
				// Set isGameInPlay to 'false' if no more letters are available to guess, meaning that game has been won.  Print win message
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
