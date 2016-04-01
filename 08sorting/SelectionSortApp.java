public class SelectionSortApp
{
    public static void swap(int[] arr, int x, int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
    public static void selectionSort(int nums[])
    {
        for (int i = 0; i < nums.length-1; i++)
        {
            int minIndex = i;
            for (int j = i+1; j < nums.length; j++)
            {
                if (nums[j] < nums[minIndex])
                {
                    minIndex = j;
                }
            }
            swap(nums, i, minIndex);
        }
    }
    
    public static void main(String[] args)
    {
        int[] values = {12,3,8,7,9,1,23,18};
        selectionSort(values);
        for (int item : values)
        {
            System.out.print(item + " ");
        }
    }
    
    
}