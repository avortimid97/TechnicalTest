package src;

import java.util.HashSet;

public class Pangram {
	
	public static boolean isPangram (String sentence) {

		sentence = sentence.toLowerCase().replaceAll(" ", "");
		
		//using a set to eliminate duplicates
		HashSet<Character> alphabetLetters = new HashSet<Character>();
		char letter;
		
		for (int i = 0; i < sentence.length(); i++) {
			letter = sentence.charAt(i);
			alphabetLetters.add(letter);
		}
				
		if (alphabetLetters.size() == 26) {
			return true;
		}
		
		return false;
	}

}
