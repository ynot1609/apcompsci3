public class CreditCard
{
    public static void main(String[] args)
    {
        double balance = 1000.0;
        double interest = 0.015;
        double payment = 100.0;
        int month = 0;
        while (balance > 0)
        {
            balance = balance + balance*interest - payment;
            month = month + 1;
            System.out.println("Month: " + month + "\t" + "Balance: " + balance);
        }
    }
}