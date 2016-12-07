public class AlterArrays
{
    public static void squareElements(double[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Math.pow(arr[i], 2.0);
        }
    }
    
    public static void displayArray(double[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
    }
    
    public static void main(String[] args)
    {
        double[] scores = {8.6, 5.3, 7.1, 9.2, 1.4};
        squareElements(scores);
        displayArray(scores);
    }
}