public class QuickPick
{
    public static void main(String[] args)
    {
        int n = 0;
        for (int i = 0; i < 6; i++)
        {
            n = (int)(Math.random() * 50) + 1;
            System.out.println(n);
        }
    }
}