public class SelectionSort
{
    public static void selectionSort(int[] arr)
    {
        int min = 0;
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++)
        {
            min = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[min])
                {
                    min = j;
                }
            }
            
            // swap
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    
    public static void main(String[] args)
    {
        int[] values = {12,39,87,53,1,29,7};
        selectionSort(values);
        for (int item : values)
        {
            System.out.print(item + " ");
        }
    }
}