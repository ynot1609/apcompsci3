public class SparseArrayTest
{
    public static void main(String[] args)
    {
        SparseArray sparse = new SparseArray();
        sparse.addEntry(new SparseArrayEntry(1, 4, 4));
        sparse.addEntry(new SparseArrayEntry(2, 0, 1));
        sparse.addEntry(new SparseArrayEntry(3, 1, -9));
        sparse.addEntry(new SparseArrayEntry(1, 1, 5));
        
        System.out.println("Part a)");
        int result = 0;
        result = sparse.getValueAt(1, 4);
        System.out.println("row: 1 col: 4 value: " + result);
        result = sparse.getValueAt(2, 0);
        System.out.println("row: 2 col: 0 value: " + result);
        result = sparse.getValueAt(3, 1);
        System.out.println("row: 3 col: 1 value: " + result);
        result = sparse.getValueAt(1, 1);
        System.out.println("row: 1 col: 1 value: " + result);
        result = sparse.getValueAt(3, 3);
        System.out.println("row: 3 col: 3 value: " + result);
        
        System.out.println();
        System.out.println("Part b)");
        sparse.removeColumn(1);
        result = sparse.getValueAt(1, 3);
        System.out.println("row: 1 col: 3 value: " + result);
        result = sparse.getValueAt(2, 0);
        System.out.println("row: 2 col: 0 value: " + result);
    }
}