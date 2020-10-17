package src;

import java.io.*;

public class CeaserCipher {
	
	public static String encode(String sequence, int shift) {
	
		StringBuilder result = new StringBuilder();
		char letter;
				
		for (int i = 0; i < sequence.length(); i++) {
	        letter = sequence.charAt(i);
	        
	        // shift letters only
	        // special characters aren't shifted
	        if (Character.isLetter(letter)) {
		        letter = (char) (sequence.charAt(i) + shift);
		        
		        if (letter > 'z') {
		            letter = (char) (sequence.charAt(i) + shift - 26);
		        } 
		    }
	        
	        result.append(letter);
	    }
		
	    return result.toString();
	}

}
