package tasks.cw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckThreeAndTwoTest {

	@Test
	void testCheckThreeAndTwo() {
		assertEquals(true, new CheckThreeAndTwo().checkThreeAndTwo(new char[] { 'a', 'a', 'b', 'b', 'b' }));
        assertEquals(false, new CheckThreeAndTwo().checkThreeAndTwo(new char[] { 'a', 'c', 'a', 'c', 'b' }));
        assertEquals(false, new CheckThreeAndTwo().checkThreeAndTwo(new char[] { 'a', 'a', 'a', 'a', 'a' }));
	}

}
