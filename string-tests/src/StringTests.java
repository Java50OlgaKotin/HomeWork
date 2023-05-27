import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTests {
	@Test
	void compareToTest() {
		String str = "Hello";
		assertEquals(0, str.compareTo("Hello"));
		assertEquals(-1, str.compareTo("Helloo"));
		assertEquals(-3, str.compareTo("Helo"));
		assertEquals(32, str.compareTo("HelLo"));
	}
	
	@Test
	void compareToIgnoreCaseTest() {
		String str = "Hello";
		assertEquals(0, str.compareToIgnoreCase("hELLO"));
		assertEquals(0, str.compareToIgnoreCase("HeLLo"));
		assertEquals(-3, str.compareToIgnoreCase("Helo"));
		assertEquals(-1, str.compareToIgnoreCase("Helloo"));
	}
	
	@Test
	void concatTest() {
		String str = "Hello";
		assertEquals("Hello world!", str.concat(" world!"));
		assertEquals("Hello Java50!", str.concat(" Java50!"));
	}
	
	@Test
	void startsWithTest() {
		String str = "Hello";
		assertTrue(str.startsWith("H"));
		assertFalse(str.startsWith("h"));
		assertTrue(str.startsWith("Hel"));
		assertFalse(str.startsWith("lo"));
	}
	
	@Test
	void endsWithTest() {
		String str = "Hello";
		assertTrue(str.endsWith("o"));
		assertFalse(str.endsWith("ll"));
		assertTrue(str.endsWith("llo"));
		assertFalse(str.endsWith("HEL"));
	}
	
	@Test
	void equalsIgnoreCaseTest() {
		String str = "Hello Java50!";
		assertTrue(str.equalsIgnoreCase("Hello Java50!"));
		assertTrue(str.equalsIgnoreCase("HELLO Java50!"));
		assertFalse(str.equalsIgnoreCase("Hello Java50"));
		assertFalse(str.equalsIgnoreCase("llo Java"));
	}
	
	@Test
	void indexOfTest() {
		String str = "Hello world";
		assertEquals(6, str.indexOf("world"));
		assertEquals(-1, str.indexOf("word"));	
		
	}
	
	@Test
	void lastIndexOfTest() {
		String str = "Hello world";
		assertEquals(7, str.lastIndexOf("o"));
		assertEquals(9, str.lastIndexOf("l"));
		assertEquals(-1, str.lastIndexOf("L"));
	}

}
