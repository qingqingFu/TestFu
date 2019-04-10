import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Xuantong on 4/9/2019.
 */
public class MathHeplerTest {
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 2;
        int b = 1;
        MathHepler instance = new MathHepler();
        int expResult = 3;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class MathHelper.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        int a = 2;
        int b = 1;
        MathHepler instance = new MathHepler();
        int expResult = 1;
        int result = instance.sub(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //  fail("The test case is a prototype.");
    }

}
