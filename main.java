package src;

public class main {

	public static void main(String[] args) {
		
		
		System.out.println("Problem 1" + "\n"
				+ "helloWorld has "+ CamelCase.countWords("helloWorld") + " words\n"
				+ "oneTwoThree has " + CamelCase.countWords("oneTwoThree") + " words\n"
				+ "thisIsAGreatTest has " + CamelCase.countWords("thisIsAGreatTest") + " words\n");
		
		System.out.println("Problem 2" + "\n"
				+ "abc shifted by 3 is " + CeaserCipher.encode("abc", 3) + "\n"
				+ "xyz shifted by 3 is " + CeaserCipher.encode("xyz", 3) + "\n");
		
		System.out.println("Problem 3" + "\n"
				+ "Is 'The five boxing wizards jump quickly' a pangram? " 
				+ Pangram.isPangram("The five boxing wizards jump quickly") + "\n"
				+ "Is 'Jackdaws love my big sphinx of quartz' a pangram? " 
				+ Pangram.isPangram("Jackdaws love my big sphinx of quartz") + "\n"
				+ "Is 'Coding in java is great' a pangram? " 
				+ Pangram.isPangram("Coding in java is great") + "\n"
				+ "Is 'Working in startups is great' a pangram? " 
				+ Pangram.isPangram("Working in startups is great") + "\n");

	}

}
