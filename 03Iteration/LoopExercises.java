public class LoopExercises
{
    public static void main(String[] args)
    {
        /*
        for (int i = 0; i <= 100; i++)
        {
            if (i%7 == 0)
            {
                System.out.print(i + " ");
            }
        }
        
        
        for (int i = 1; i <= 100; i++)
        {
            if (i%5 == 0 && i%3 != 0)
            {
                System.out.print(i + " ");
            }
        }
        */
       
        for (int i = 2; i <= 20; i++)
        {
            System.out.print(i + " ");
            for (int j = 2; j < i; j++)
            {
                if (i%j == 0)
                {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}