public class Wedge
{
    public static void main(String[] args)
    {
        int rows = 70;
        int stars = 70;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < stars; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            stars = stars - 1;
        }
    }
}