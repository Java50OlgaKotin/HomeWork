import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class HW02_ArraysTests {

	@Test
	void removeNumberTest() {
		int [] src = {1, 2, 3, 4, 5, 6, 7};
		int index = 3;
		int [] expected = {1, 2, 3, 5, 6, 7};
		assertArrayEquals(expected, HomeWork02.removeNumber(src, index));
		
		index = 0;
		int [] expected2 = {2, 3, 4, 5, 6, 7};
		assertArrayEquals(expected2, HomeWork02.removeNumber(src, index));
		
		index = 6;
		int [] expected3 = {1, 2, 3, 4, 5, 6};
		assertArrayEquals(expected3, HomeWork02.removeNumber(src, index));
	}
	
	@Test
	void binarySearchTest() {
		int [] src = {10, 20, 30, 40, 50, 60};
		
		int number = 25;
		assertEquals(-3, Arrays.binarySearch(src, number));
		
		number = 40;
		assertEquals(3, Arrays.binarySearch(src, number));

	}
	
	@Test
	void insertNumberSorted() {
			int [] src = {10, 20, 30, 40, 50, 60};
			
			int number = 25;
			int [] expected = {10, 20, 25, 30, 40, 50, 60};
			assertArrayEquals(expected, HomeWork02.insertNumberSorted(src, number));
			
			number = 5;
			int [] expected2 = {5, 10, 20, 30, 40, 50, 60};
			assertArrayEquals(expected2, HomeWork02.insertNumberSorted(src, number));
			
			number = 70;
			int [] expected3 = {10, 20, 30, 40, 50, 60, 70};
			assertArrayEquals(expected3, HomeWork02.insertNumberSorted(src, number));
			
			number = 20;
			int [] expected4 = {10, 20, 20, 30, 40, 50, 60};
			assertArrayEquals(expected4, HomeWork02.insertNumberSorted(src, number));
	}

	}

