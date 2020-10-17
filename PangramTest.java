package test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

import src.Pangram;

public class PangramTest {

	@Test
	public void pangramIsIdentifiedCorrectly() {
		assertTrue(Pangram.isPangram("The five boxing wizards jump quickly"));
		assertTrue(Pangram.isPangram("Jackdaws love my big sphinx of quartz"));
	}
	
	@Test
	public void notPangramIsIdentifiedCorrectly() {
		assertFalse(Pangram.isPangram("Coding in java is great"));
		assertFalse(Pangram.isPangram("Working in startups is great"));
	}
	
	@Test
	public void emptyInputShouldOutputNotPangram() {
		assertFalse(Pangram.isPangram(""));
		assertFalse(Pangram.isPangram(" "));
		assertFalse(Pangram.isPangram("  "));
	}
	
	@Test
	public void specialCharactersShouldOutputNotPangram() {
		assertFalse(Pangram.isPangram("5Jackdaws love my big sphinx of quartz"));
		assertFalse(Pangram.isPangram("Jackdaws love my big &sphinx of quartz"));
	}
}
