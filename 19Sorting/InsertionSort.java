public class InsertionSort
{
    public static void insertionSort(int[] arr)
    {
        int j = 0;
        int index = 0;
        for (int i = 1; i < arr.length; i++)
        {
            index = arr[i];
            j = i;
            while((j > 0) && arr[j-1] > index)
            {
                arr[j] = arr[j-1];
                j = j - 1;
            }
            arr[j] = index;
        }
    }
    
    public static void main(String[] args)
    {
        int[] values = {12,3,8,7,9,1,23,18};
        insertionSort(values);
        for (int item : values)
        {
            System.out.print(item + " ");
        }
    }
}