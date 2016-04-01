public class MergeSortDraftBWagner

{
    public static void recursiveMergeSort(int[] arr, int[] part)
    {
        if (part.length > 1)
        {
            int mid = part.length / 2;
            int full = part.length - mid;
            
            System.out.println("mid = " + mid);
            System.out.println("full = " + full);
            
            int[] left = new int[mid];
            for (int i = 0; i < mid; i++)
                left[i] = part[i];
            
            int[] right = new int[full];
            for (int i = mid, j = 0; i < part.length; i++, j++)
                right[j] = part[i];
            
            for (int item : left)
                System.out.print(item + " ");
            
            System.out.println();
            
            for (int item : right)
                System.out.print(item + " ");
            
            System.out.println();
            
            recursiveMergeSort(arr, left);
            recursiveMergeSort(arr, right);
            merge(arr, left, right);
        }
    }
    
    public static void merge(int[] arr, int[] left, int[] right)
    {
        /*
        int mid = (beg + end) / 2;
        int n = end - beg + 1;
        int[] left = new int[mid+1];
        for (int i = beg, j = 0; i <= mid; i++, j++)
        {
            left[j] = arr[i];
        }
        
        int[] right = new int[end-mid+1];
        for (int i = mid+1, j = 0; i <= end; i++, j++)
        {
            right[j] = arr[i];
        }
        */
       
        int ap = 0;
        int lp = 0;
        int rp = 0;
 
        while (lp < left.length && rp < right.length)
        {
            if (left[lp] < right[rp])
            {
                arr[ap] = left[lp];
                ap++;
                lp++;
            }
            else
            {
                arr[ap] = right[rp];
                ap++;
                rp++;
            }
            
        }
        
    }
    
    public static void main(String[] args)
    {
        int[] scores = {64,21,33,70,12,85,44,3};
        recursiveMergeSort(scores, scores);
        System.out.println();
        for (int item : scores)
        {
            System.out.print(item + " ");
        }
    }
}