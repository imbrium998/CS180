/*
 *  A class implementing random word selection from a predefined dictionary. 
 *  Supplement to the Hangman project. See project description for the details
 *  on the use of this file.
 *
 *  static method pickWord generates and returns a pseudorandom word.
 */

import java.util.Random;

public class HangmanDict{
    
    private static Random generator = new Random();
    
    /*
     *     public static String pickWord () 
     *     - returns a randomly selected word.
     */
    public static String pickWord () 
    {
	String[] words = {"young", "scientist", "pub", "announcement",
			  "lunchtime",
			  "crowd", "discoverer", "secret", "life", 
			  "chemical", "structure", "archive", "molecule", 
			  "information", "quantity", "occasion", "revolution",
			  "between", "laboratory", "effect", "mechanism",
			  "wave", "behind", "door"};

	int nWords =  words.length;

	int rind = generator.nextInt(nWords);
	
	return words[rind];
	
    }
}
