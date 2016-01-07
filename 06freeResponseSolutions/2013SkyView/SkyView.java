//----------------------------------------------------------
// File Name:	SkyView.java
// Description:	2013 AP Free Response Question 4.
// Programmer:	Alwin Tareen
// Last Edited:	Apr 13, 2015
// OS Platform:	Linux Mint Maya 13, Java SE Development Kit 7
//
// Compilation:	javac SkyView.java
// Execution:	<non-executable>
//----------------------------------------------------------

public class SkyView
{
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        // YOUR CODE HERE
        double[][] horizon = new double[numRows][numCols];
        int scanIndex = 0;
        for (int row = 0; row < numRows; row++)
        {
            // if the row is odd, place data in backwards order
            if (row % 2 != 0)
            {
                for (int col = numCols-1; col >= 0; col--)
                {
                    horizon[row][col] = scanned[scanIndex];
                    scanIndex++;
                }
            }
            else
            {
                for (int col = 0; col < numCols; col++)
                {
                    horizon[row][col] = scanned[scanIndex];
                    scanIndex++;
                }
            }
        }
        view = horizon;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        // YOUR CODE HERE
        double sum = 0.0;
        int dataPoints = 0;
        for (int row = startRow; row <= endRow; row++)
        {
            for (int col = startCol; col <= endCol; col++)
            {
                System.out.println(view[row][col]);
                sum += view[row][col];
                dataPoints++;
            }
        }
        System.out.println("sum = " + sum);     
        System.out.println("dataPoints = " + dataPoints);
        return sum/dataPoints;
    }

    public String toString()
    {
        String result = "";
        for (double[] row : view)
        {
            for (double item : row)
            {
                result += item + " ";
            }
            result += "\n";
        }
        return result;
    }
}


