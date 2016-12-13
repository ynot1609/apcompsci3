public class Mountain
{
    public static boolean isIncreasing(int[] array, int stop)
    {
        for (int i = 0; i < stop; i++)
        {
            if (array[i] > array[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int[] array, int start)
    {
        for (int i = start; i < array.length-1; i++)
        {
            if (array[i] < array[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static int getPeakIndex(int[] array)
    {
        // YOUR CODE HERE
        
    }

    public static boolean isMountain(int[] array)
    {
        // YOUR CODE HERE
        
    }

    public static void main(String[] args)
    {
        int[] arr1 = {11, 22, 33, 22, 11};
        int[] arr2 = {11, 22, 11, 22, 11};
        int[] arr3 = {11, 22, 33, 55, 77};
        int[] arr4 = {99, 33, 55, 77, 120};
        int[] arr5 = {99, 33, 55, 77, 55};
        int[] arr6 = {33, 22, 11};

        System.out.println(getPeakIndex(arr1));
        System.out.println(getPeakIndex(arr2));
        System.out.println(getPeakIndex(arr3));
        System.out.println(getPeakIndex(arr4));
        System.out.println(getPeakIndex(arr5));
        System.out.println(getPeakIndex(arr6));

        int[] arr10 = {1, 2, 3, 2, 1};
        int[] arr11 = {1, 2, 1, 2, 1};
        int[] arr12 = {1, 2, 3, 1, 5};
        int[] arr13 = {1, 4, 2, 1, 0};
        int[] arr14 = {9, 3, 5, 7, 5};
        int[] arr15 = {3, 2, 1};

        System.out.println(isMountain(arr10));
        System.out.println(isMountain(arr11));
        System.out.println(isMountain(arr12));
        System.out.println(isMountain(arr13));
        System.out.println(isMountain(arr14));
        System.out.println(isMountain(arr15));
    }
}
