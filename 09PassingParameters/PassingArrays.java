public class PassingArrays
{
    public static void initializeArray()
    {
        int[] scores = {10, 20, 30};
        alterArray(scores);
        displayArray(scores);
    }
    
    public static void alterArray(int[] points)
    {
        points[0] = 500;
    }
    
    public static void displayArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args)
    {
        initializeArray();
    }
}