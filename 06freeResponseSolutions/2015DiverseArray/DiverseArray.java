public class DiverseArray
{
    public static int arraySum(int[] arr)
    {
        // YOUR CODE HERE
        int sum = 0;
        for (int item : arr)
        {
            sum += item;
        }
        return sum;
    }
    
    public static int[] rowSums(int[][] arr2D)
    {
        // YOUR CODE HERE
        int[] sums = new int[arr2D.length];
        for (int row = 0; row < arr2D.length; row++)
        {
            sums[row] = arraySum(arr2D[row]);
        }
        return sums;
    }
    
    public static boolean isDiverse(int[][] arr2D)
    {
        // YOUR CODE HERE
        int[] sums = rowSums(arr2D);
        for (int i = 0; i < sums.length; i++)
        {
            for (int j = i+1; j < sums.length; j++)
            {
                if (sums[i] == sums[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}