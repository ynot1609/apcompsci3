public class BinarySearchRecursiveApp
{
    public static int binarySearchRecursive(int[] arr, int target, int low, int high)
    {
        if (low > high)
        {
            return -1;
        }
        else
        {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
            {
                return mid;
            }
            else if (target > arr[mid])
            {
                return binarySearchRecursive(arr, target, mid+1, high);
            }
            else
            {
                return binarySearchRecursive(arr, target, low, mid-1);
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] scores = {9,17,23,37,58,62,81,92};
        int range = scores.length;
        int position = binarySearchRecursive(scores, 81, 0, range);
        System.out.println("Position = " + position);
    }
    
}