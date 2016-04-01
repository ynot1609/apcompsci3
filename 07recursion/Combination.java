public class Combination
{
    public static int recursiveComb(int n, int k)
    {
        if (n < k)
            return 0;
        else if (k < 0)
            return 0;
        else if (k == 0)
            return 1;
        else
            return recursiveComb(n-1, k-1) + recursiveComb(n-1, k);
    }
    
    public static void main(String[] args)
    {
        System.out.println(recursiveComb(8, 3));
    }   
}