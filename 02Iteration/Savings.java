public class Savings
{
    public static void main(String[] args)
    {
        double dollars = 10000.0;
        double interest = 0.08;
        int years = 0;
        while (dollars < 1000000)
        {
            dollars = dollars + dollars*interest;
            years = years + 1;
        }
        System.out.println("Years: " + years);
    }
}