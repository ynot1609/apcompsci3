public class LocationSearch
{
    public static int linearSearch(int[] arr, int key)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] samples = {93,24,85,72,30,23,15,36};
        int query = 30;
        int result = linearSearch(samples, query);
        System.out.println("Found search key? " + result);
        
        query = 57;
        result = linearSearch(samples, query);
        System.out.println("Found search key? " + result);
    }
    
    
    
}