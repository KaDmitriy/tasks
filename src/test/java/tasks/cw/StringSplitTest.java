package tasks.cw;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class StringSplitTest {

	@Test
	void testSolution() {
	       String s = "abcdef";
	       String s1 = "LovePizza";
	       
	       String result = Arrays.toString(StringSplit.solution(s));
	       assertEquals("[ab, cd, ef]", result);
	       assertEquals("[Lo, ve, Pi, zz, a_]", Arrays.toString(StringSplit.solution(s1)));
	       //assertEquals("Should handle even string","[He, ll, oW, or, ld]", Arrays.toString(StringSplit.solution(s1)));
	}

}
