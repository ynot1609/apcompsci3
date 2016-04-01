import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SparseArrayJUnitTest
{
    SparseArray sparse = new SparseArray();
    
    @Test
    public void evaluateOneGetValueAt()
    {
        sparse.addEntry(new SparseArrayEntry(1, 4, 4));
        sparse.addEntry(new SparseArrayEntry(2, 0, 1));
        sparse.addEntry(new SparseArrayEntry(3, 1, -9));
        sparse.addEntry(new SparseArrayEntry(1, 1, 5));
        int expected = -9;
        int actual = sparse.getValueAt(3, 1);
        assertEquals(expected, actual);
    }
    
    @Test
    public void evaluateTwoGetValueAt()
    {
        sparse.addEntry(new SparseArrayEntry(1, 4, 4));
        sparse.addEntry(new SparseArrayEntry(2, 0, 1));
        sparse.addEntry(new SparseArrayEntry(3, 1, -9));
        sparse.addEntry(new SparseArrayEntry(1, 1, 5));
        int expected = 0;
        int actual = sparse.getValueAt(3, 3);
        assertEquals(expected, actual);
    }
    
    @Test
    public void evaluateThreeRemoveColumn()
    {
        sparse.addEntry(new SparseArrayEntry(1, 4, 4));
        sparse.addEntry(new SparseArrayEntry(2, 0, 1));
        sparse.addEntry(new SparseArrayEntry(3, 1, -9));
        sparse.addEntry(new SparseArrayEntry(1, 1, 5));
        sparse.removeColumn(1);
        int expected = 4;
        int actual = sparse.getValueAt(1, 3);
        assertEquals(expected, actual);
    }
    
    @Test
    public void evaluateFourRemoveColumn()
    {
        sparse.addEntry(new SparseArrayEntry(1, 4, 4));
        sparse.addEntry(new SparseArrayEntry(2, 0, 1));
        sparse.addEntry(new SparseArrayEntry(3, 1, -9));
        sparse.addEntry(new SparseArrayEntry(1, 1, 5));
        sparse.removeColumn(1);
        int expected = 1;
        int actual = sparse.getValueAt(2, 0);
        assertEquals(expected, actual);
    }
}
