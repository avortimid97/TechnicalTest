package src;


public class CamelCase {
	
	
	public static int countWords(String sentence) {
		//start counting from second word
		int countCamelCase = 1;
		char letter;
		
		//if the input is empty
		if (sentence.trim().isEmpty()) {
			return 0;
		}
		
		//the first letter is always part of the first word
		//start the scanning from the second letter
		for (int i=1; i<sentence.length(); i++) {
			letter = sentence.charAt(i);
			
			if (Character.isUpperCase(letter)) {
				countCamelCase++;				
			}
		}
		
		return countCamelCase;
	}

}
