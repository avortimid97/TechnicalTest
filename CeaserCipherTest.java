package test;
import static org.junit.Assert.assertEquals;
import org.junit.*;

import src.CeaserCipher;


public class CeaserCipherTest {
	
	private static final int SHIFT = 3;
	

	@Test
	public void abc3ShouldOutputdef () {
		assertEquals(CeaserCipher.encode("abc", SHIFT), "def");
	}
	
	@Test
	public void xyz3ShouldOutputabc () {
		assertEquals(CeaserCipher.encode("xyz", SHIFT), "abc");
	}
	
	@Test
	public void emptyInputShouldOutputZero () {
		assertEquals(CeaserCipher.encode("", SHIFT), "");
		assertEquals(CeaserCipher.encode(" ", SHIFT), " ");
	}
	
	@Test
	public void specialCharactersEncodingShouldNotShift () {
		assertEquals(CeaserCipher.encode("ab4c", SHIFT), "de4f");
		assertEquals(CeaserCipher.encode("x&yz", SHIFT), "a&bc");

	}
	
}
