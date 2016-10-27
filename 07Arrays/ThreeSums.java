public class ThreeSums
{
    public static void main(String[] args)
    {
        int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
        int sumAll = 0;
        int sumEvens = 0;
        int sumOdds = 0;
        
        for (int i = 0; i < data.length; i++)
        {
            sumAll += data[i];
            if (data[i]%2 == 0)
            {
                sumEvens += data[i];
            }
            else
            {
                sumOdds += data[i];
            }
        }
        
        System.out.println("Sum of all = " + sumAll);
        System.out.println("Sum of evens = " + sumEvens);
        System.out.println("Sum of odds = " + sumOdds);
    }
    
}