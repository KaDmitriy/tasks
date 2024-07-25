package tasks.cw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AreTheyTheSameTest {

	@Test
	void testComp() {
		int[] a = new int[] { 121, 144, 19, 161, 19, 144, 19, 11 };
		int[] b = new int[] { 121, 14641, 20736, 361, 25921, 361, 20736, 361 };
		assertEquals(true, AreTheyTheSame.comp(a, b));

		int[] a1 = new int[] { 121, 144, 19, 161, 19, 144, 19, 11 };
		int[] b1 = new int[] { 121, 146411, 207361, 3611, 259211, 3611, 207361, 3611 };
		assertEquals(false, AreTheyTheSame.comp(a1, b1));

		int[] a2 = new int[] { 121, 144, 19, 161, 19, 144, 11, 19 };
		int[] b2 = new int[] { 121, 146411, 207361, 3611, 259211, 3611, 207361, 361 };
		assertEquals(false, AreTheyTheSame.comp(a2, b2));

		int[] a3 = new int[] { 19, 19 };
		int[] b3 = new int[] { 207361, 361 };
		assertEquals(false, AreTheyTheSame.comp(a3, b3));
		
		int[] a4 = new int[0];
		int[] b4 = new int[0];
		assertEquals(true, AreTheyTheSame.comp(a4, b4));
		
		int[] a5 = new int[0];
		int[] b5 = null;
		assertEquals(false, AreTheyTheSame.comp(a5, b5));
	}
	
	@Test
	void testCompTime() {
		
		var testArrays = getTestArrays();
		
		assertEquals(true, AreTheyTheSame.comp(testArrays[0], testArrays[1]));
		
		long startTime = 0;
		long endTime = 0;
		long elapsedTime = 0;
		
		/*
		startTime = System.currentTimeMillis();
		assertEquals(true, AreTheyTheSame.comp(testArrays[0], testArrays[1]));
		endTime = System.currentTimeMillis();
		elapsedTime = (endTime - startTime)/1000;
		System.out.println("My elapsed time: "+elapsedTime+" s");
		*/
		startTime = System.currentTimeMillis();
		assertEquals(true, AreTheyTheSame.compCWTop(testArrays[0], testArrays[1]));
		endTime = System.currentTimeMillis();
		elapsedTime = (endTime - startTime);
		System.out.println("CW top elapsed time: "+elapsedTime+" ms");
		
		startTime = System.currentTimeMillis();
		assertEquals(true, AreTheyTheSame.compCWTop2(testArrays[0], testArrays[1]));
		endTime = System.currentTimeMillis();
		elapsedTime = (endTime - startTime);
		System.out.println("CW top2 elapsed time: "+elapsedTime+" ms");
	}
	
	private int[][] getTestArrays() {
		int countNumber = 250_000;
		int[][] testArrays = new int[2][countNumber];
		for(int i = 0; i < countNumber; i++) {
			testArrays[0][i] = (int) (Math.random() * 1000);
			testArrays[1][i] = testArrays[0][i]*testArrays[0][i];
		}
		return testArrays;
	}

}
