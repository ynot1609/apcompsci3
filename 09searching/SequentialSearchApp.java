public class SequentialSearchApp
{
    public static int sequentialSearch(int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] scores = {92,81,37,9,23,58,17,62};
        int position = sequentialSearch(scores, 957);
        System.out.println("Position = " + position);
    }
}