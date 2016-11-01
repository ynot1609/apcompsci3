public class ArrayMaxMin
{
    public static void main(String[] args)
    {
        int[][] data = { {39,4,87,53,49},
                         {92,38,7,43,29},
                         {9,83,24,75,38},
                         {93,48,57,89,63} };

        int maxValue = 0;
        int maxIndexRow = 0;
        int maxIndexCol = 0;
        
        int minValue = 9999;
        int minIndexRow = 0;
        int minIndexCol = 0;
        for (int row = 0; row < data.length; row++)
        {
            for (int col = 0; col < data[0].length; col++)
            {
                if (data[row][col] > maxValue)
                {
                    maxValue = data[row][col];
                    maxIndexRow = row;
                    maxIndexCol = col;
                }
                
                if (data[row][col] < minValue)
                {
                    minValue = data[row][col];
                    minIndexRow = row;
                    minIndexCol = col;
                }
            }
        }
        
        System.out.println("Max = " + maxValue);
        System.out.println("Max location = " + maxIndexRow + "," + maxIndexCol);
        System.out.println("Min = " + minValue);
        System.out.println("Min location = " + minIndexRow + "," + minIndexCol);
    }
}