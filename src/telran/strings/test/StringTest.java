package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void charAtTest() {
		String str = "Hello";
		assertEquals('H', str.charAt(0));
		assertEquals('o', str.charAt(4));
		assertEquals('l', str.charAt(2));
		assertEquals('c', 'e' - 2);
		assertEquals("Hello2", str + 2);
	}

	@Test
	void containsTest() {
		String str = "Hello";
		assertTrue(str.contains("H"));
		assertFalse(str.contains("h"));
		assertTrue(str.contains("ello"));
		assertFalse(str.contains("lelo"));

	}
	//HW_1
	@Test
	void compareToTest() {
		//TODOooo
		String str = "Hello";
		assertEquals(-32,str.compareTo("hello"));
		assertEquals(0,str.compareTo("Hello"));
		assertEquals(32,str.compareTo("HellO"));
		assertEquals(32,str.compareTo("HELLO"));
		assertEquals(-3,str.compareTo("Helloooo"));
		assertEquals(3,str.compareTo("He"));
	}
	@Test
	void concatTest() {
		String str = "John";
		String str2 = " Wick";
		assertEquals("John Wick",str.concat(str2));
		assertEquals("John1",str.concat("1"));
		assertEquals("John,",str.concat(","));
	}
	@Test
	void endsWithTest() {
		String str = "Hello";
		assertTrue(str.endsWith("lo"));
		assertFalse(str.endsWith("LO"));
		assertFalse(str.endsWith(" "));
	}
	@Test
	void lengthTest() {
		String str = "Hello";
		String str2 = "";
		assertEquals(5,str.length());
		assertEquals(0,str2.length());
	}
	@Test
	void replaceTest() {
		String str = "Hello";
		assertEquals("Heppa",str.replace("llo", "ppa"));
		assertEquals("Hollo",str.replace('e', 'o'));
	}
}