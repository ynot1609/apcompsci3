public class InsertionSortDraft
{
    public static void insertionSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int cur = arr[i];
            for (int j = i-1; j>=0 && arr[j]>cur; j--)
            {
                arr[j+1] = arr[j];
                arr[j] = cur;
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] scores = {92,81,37,9,23,58,17,62};
        insertionSort(scores);
        for (int item : scores)
        {
            System.out.print(item + " ");
        }
    }
}
