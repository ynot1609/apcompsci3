public class TriangularRecursive
{
    public static int triangular(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else
        {
            return (n + triangular(n-1));
        }
    }
    
    public static void main(String[] args)
    {
        int result = triangular(6);
        System.out.println("n = 6, triangle num = " + result);
    }
}   