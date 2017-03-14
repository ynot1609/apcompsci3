public class BinarySearch
{
    public static int binarySearch(int[] arr, int key)
    {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right)
        {
            int midpoint = (left + right)/2;
            if (arr[midpoint] == key)
            {
                return midpoint;
            }
            else if (arr[midpoint] < key)
            {
                left = midpoint + 1;
            }
            else
            {
                right = midpoint - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] samples = {9,14,23,30,34,52,68,71,86,97};
        int query = 97;
        int result = binarySearch(samples, query);
        System.out.println("Found search key? " + result);
        
        query = 57;
        result = binarySearch(samples, query);
        System.out.println("Found search key? " + result);
    }
    
}