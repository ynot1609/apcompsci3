import java.util.*;
public class SparseArray
{
    private int numRows;
    private int numCols;
    private List<SparseArrayEntry> entries;
    
    public SparseArray()
    {
        entries = new ArrayList<SparseArrayEntry>();
    }
    
    public int getNumRows()
    {
        return numRows;
    }
    
    public int getNumCols()
    {
        return numCols;
    }
    
    public void addEntry(SparseArrayEntry s)
    {
        entries.add(s);
    }
    
    public int getValueAt(int row, int col)
    {
        // YOUR CODE HERE
        
    }
    
    public void removeColumn(int col)
    {
        // YOUR CODE HERE
        
    }
}
