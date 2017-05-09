package practice.section.fundamental;

import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public final class WhereIsMyParentTest {
    private static void test(final String expected, final String input) {
        assertEquals("For input \"" + input + '"', expected, WhereIsMyParent.findChildren(input));
    }
    
    @Test 
    public void basicTests() {
        test("AaBb", "abBA");
        test("AaaaaaZzzz", "AaaaaZazzz");
        test("AaBbbCcc", "CbcBcbaA");
        test("FfUuuuXx", "xXfuUuuF");
        test("", "");
    }
}
