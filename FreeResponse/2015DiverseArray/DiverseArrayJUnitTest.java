import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class DiverseArrayJUnitTest
{
    int[] arr1 = {1,3,2,7,3};
    int[][] mat1 = { {1,3,2,7,3},
                        {10,10,4,6,2},
                        {5,3,5,9,6},
                        {7,6,4,2,1} };
    int[][] mat2 = { {1,1,5,3,4},
                        {12,7,6,1,9},
                        {8,11,10,2,5},
                        {3,2,3,0,6} };
    @Test
    public void evaluateOneArraySum()
    {
        int expected = 16;
        int actual = DiverseArray.arraySum(arr1);
        assertEquals(expected, actual);
    }
    
    @Test
    public void evaluateTwoArrayRowSums()
    {
        int[] expected = {16,32,28,20};
        int[] actual = DiverseArray.rowSums(mat1);
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void evaluateThreeIsDiverse()
    {
        boolean actual = DiverseArray.isDiverse(mat1);
        assertTrue(actual);
    }
    
    @Test
    public void evaluateFourIsDiverse()
    {
        boolean actual = DiverseArray.isDiverse(mat2);
        assertFalse(actual);
    }
}