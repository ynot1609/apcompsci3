public class RandomRanges
{
    public static void main(String[] args)
    {
        int n = 0;
        n = (int)(Math.random() * 26);
        System.out.println(n);
        
        n = (int)(Math.random() * 3) + 1;
        System.out.println(n);
        
        n = (int)(Math.random() * 51) + 50;
        System.out.println(n);
    }
}