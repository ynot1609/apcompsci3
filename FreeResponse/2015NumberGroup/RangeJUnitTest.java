import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class RangeJUnitTest
{
    NumberGroup range1 = new Range(-3, 2);
    
    @Test
    public void evaluateOneContains()
    {
        boolean actual = range1.contains(-2);
        assertTrue(actual);
    }
    
    @Test
    public void evaluateTwoContains()
    {
        boolean actual = range1.contains(7);
        assertFalse(actual);
    }
    
    @Test
    public void evaluateThreeContains()
    {
        boolean actual = range1.contains(1);
        assertTrue(actual);
    }
}
