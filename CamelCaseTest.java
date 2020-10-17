package test;
import static org.junit.Assert.assertEquals;
import org.junit.*;
import src.CamelCase;


public class CamelCaseTest {
	
	@Test
	public void firstWordIsLower() {
		assertEquals(CamelCase.countWords("flower"), 1);
		assertEquals(CamelCase.countWords("flowerBug"), 2);
	}
	
	@Test
	public void firstWordIsUpper() {
		assertEquals(CamelCase.countWords("Flower"), 1);
		assertEquals(CamelCase.countWords("FlowerBug"), 2);
		
	}
	
	@Test
	public void ignoreSpecialChars() {
		assertEquals(CamelCase.countWords("f5l&ower"), 1);
		assertEquals(CamelCase.countWords("f5l&owerB6g"), 2);
	}
	
	@Test
	public void helloWorldShouldOutput2() {
		assertEquals(CamelCase.countWords("helloWorld"), 2);
	}
	
	@Test
	public void oneTwoThreeShouldOutput3() {
		assertEquals(CamelCase.countWords("oneTwoThree"), 3);
	}
	
	@Test
	public void thisIsAGreatTestShouldOutput5() {
		assertEquals(CamelCase.countWords("thisIsAGreatTest"), 5);
	}
	
	@Test
	public void emptyInputShouldOutput0() {
		assertEquals(CamelCase.countWords(""), 0);
		assertEquals(CamelCase.countWords(" "), 0);
		assertEquals(CamelCase.countWords("  "), 0);
	}
}
