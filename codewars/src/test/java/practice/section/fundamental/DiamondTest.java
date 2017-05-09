package practice.section.fundamental;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DiamondTest {
	@Test
	public void testDiamond3() {
		StringBuffer expected = new StringBuffer();
		expected.append(" *\n");
		expected.append("***\n");
		expected.append(" *\n");

		assertEquals(expected.toString(), Diamond.print(3));
	}

	@Test
	public void testDiamond5() {
		StringBuffer expected = new StringBuffer();
		expected.append("  *\n");
		expected.append(" ***\n");
		expected.append("*****\n");
		expected.append(" ***\n");
		expected.append("  *\n");

		assertEquals(expected.toString(), Diamond.print(5));
	}

	@Test
	public void testEvenNumberInput() {
		assertNull(Diamond.print(2));
	}
	
	@Test
	public void testNegativeNumberInput() {
		assertNull(Diamond.print(-10));
	}
}
