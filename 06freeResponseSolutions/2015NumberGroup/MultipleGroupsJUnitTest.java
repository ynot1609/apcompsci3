import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class MultipleGroupsJUnitTest
{
    MultipleGroups multiple1 = new MultipleGroups();
    
    @Test
    public void evaluateOneContains()
    {
        multiple1.addGroup(new Range(5, 8));
        multiple1.addGroup(new Range(10, 12));
        multiple1.addGroup(new Range(1, 6));
        boolean actual = multiple1.contains(2);
        assertTrue(actual);
    }
    
    @Test
    public void evaluateTwoContains()
    {
        multiple1.addGroup(new Range(5, 8));
        multiple1.addGroup(new Range(10, 12));
        multiple1.addGroup(new Range(1, 6));
        boolean actual = multiple1.contains(9);
        assertFalse(actual);
    }
    
    @Test
    public void evaluateThreeContains()
    {
        multiple1.addGroup(new Range(5, 8));
        multiple1.addGroup(new Range(10, 12));
        multiple1.addGroup(new Range(1, 6));
        boolean actual = multiple1.contains(6);
        assertTrue(actual);
    }
}
