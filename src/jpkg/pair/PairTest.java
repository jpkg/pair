package jpkg.pair;

import static org.junit.Assert.*;
import jpkg.test.TestManager;

import org.junit.Test;

public class PairTest {

	public static void main(String[] args) {
		test();
		TestManager.runTests();
	}
	
	public static void test() {
		TestManager.addTest(PairTest.class);
	}
	
	@Test
	public void testBasic() {
		Pair<String, Integer> p = new Pair<>("hi", 1);
		
		assertEquals(p.getLeft(), "hi");
		assertEquals(p.getRight(), Integer.valueOf(1));
	}
	
	@Test
	public void testToString() {
		Pair<String, Integer> p = new Pair<>("hi", 1);
		Pair<String, Integer> nullpair = new Pair<>(null, null);
		
		assertEquals(p.toString(), "(hi, 1)");
		assertEquals(nullpair.toString(), "(null, null)");
	}
	
	@Test
	public void testEquals() {
		Pair<String, Integer> p1 = new Pair<>("hi", 1);
		Pair<String, Integer> p2 = new Pair<>("hi", 1);
		Pair<String, Integer> p3 = new Pair<>(null, null);

		assertTrue(p1.equals(p2));
		assertTrue(p2.equals(p1));
		assertFalse(p2.equals(p3));
		assertFalse(p3.equals(p2));
	}
}
