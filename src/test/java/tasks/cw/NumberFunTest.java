package tasks.cw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberFunTest {

	@Test
	void testFindNextSquare() {
		assertEquals(144, NumberFun.findNextSquare(121));
	}

	@Test
	public void testFindNextSquareTest2() {
		assertEquals(676, NumberFun.findNextSquare(625));
	}

	@Test
	public void testFindNextSquareTest3() {
		assertEquals(-1, NumberFun.findNextSquare(114));
	}
	
	@Test
	public void testFindNextSquareRundomTest() {
		assertEquals(6_155_657_764L, NumberFun.findNextSquare(6_155_500_849L));
		assertEquals(15241630849L, NumberFun.findNextSquare(15241383936L));
	}

}
