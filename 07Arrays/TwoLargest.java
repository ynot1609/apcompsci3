public class TwoLargest
{
    public static void main(String[] args)
    {
        int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
        int largest = 0;
        int nextLargest = 0;
        
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] > largest)
            {
                largest = data[i];
            }
        }
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] > nextLargest && data[i] < largest)
            {
                nextLargest = data[i];
            }
        }
        System.out.println("Largest = " + largest);
        System.out.println("Next largest = " + nextLargest);
    }
}