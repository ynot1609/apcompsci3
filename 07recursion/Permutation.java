public class Permutation
{
    public static int recursivePerm(int n, int k)
    {
        if (k == 0)
            return 1;
        else
            return n * recursivePerm(n-1, k-1);
    }
    
    public static void main(String[] args)
    {
        System.out.println(recursivePerm(15, 7));
    }   
}