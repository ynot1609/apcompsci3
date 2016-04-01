public class BinarySearchIterativeApp
{
    public static int binarySearchIterative(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high)
        {
            int mid = (low + high)/2;
            if (arr[mid] == target)
            {
                return mid;
            }
            else if (target > arr[mid])
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] scores = {9,17,23,37,58,62,81,92};
        int position = binarySearchIterative(scores, 92);
        System.out.println("Position = " + position);
    }
}