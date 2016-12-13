import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MountainJUnitTest
{
    @Test
    public void secondQuestionPartA()
    {
        int[] arr1 = {11, 22, 33, 22, 11};
        int[] arr2 = {11, 22, 11, 22, 11};
        int[] arr3 = {11, 22, 33, 55, 77};
        int[] arr4 = {99, 33, 55, 77, 120};
        int[] arr5 = {99, 33, 55, 77, 55};
        int[] arr6 = {33, 22, 11};

        int result = Mountain.getPeakIndex(arr1);
        assertEquals(2, result);
        result = Mountain.getPeakIndex(arr2);
        assertEquals(1, result);
        result = Mountain.getPeakIndex(arr3);
        assertEquals(-1, result);
        result = Mountain.getPeakIndex(arr4);
        assertEquals(-1, result);
        result = Mountain.getPeakIndex(arr5);
        assertEquals(3, result);
        result = Mountain.getPeakIndex(arr6);
        assertEquals(-1, result);
    }

    @Test
    public void secondQuestionPartB()
    {
        int[] arr10 = {1, 2, 3, 2, 1};
        int[] arr11 = {1, 2, 1, 2, 1};
        int[] arr12 = {1, 2, 3, 1, 5};
        int[] arr13 = {1, 4, 2, 1, 0};
        int[] arr14 = {9, 3, 5, 7, 5};
        int[] arr15 = {3, 2, 1};

        assertTrue(Mountain.isMountain(arr10));
        assertFalse(Mountain.isMountain(arr11));
        assertFalse(Mountain.isMountain(arr12));
        assertTrue(Mountain.isMountain(arr13));
        assertFalse(Mountain.isMountain(arr14));
        assertFalse(Mountain.isMountain(arr15));
    }
}
