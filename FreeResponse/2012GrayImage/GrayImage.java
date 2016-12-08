public class GrayImage
{
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    private int[][] pixelValues;

    public GrayImage(int[][] numGrid)
    {
        pixelValues = numGrid;
    }

    public int countWhitePixels()
    {
        // YOUR CODE HERE
        
    }

    public void processImage()
    {
        // YOUR CODE HERE
        
    }

    public String toString()
    {
        String result = "";
        for (int[] row : pixelValues)
        {
            for (int item : row)
            {
                result += item + "\t";
            }
            result += "\n";
        }
        return result;
    }
}
