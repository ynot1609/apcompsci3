public class BankAccountTest
{
    public static void main(String[] args)
    {
        BankAccount ba = null;
        ba = new BankAccount();
        // same as:
        BankAccount me = new BankAccount();
        ba.deposit(532.63);
        double money = 0.0;
        money = ba.getBalance();
        System.out.println(money);
        
        ba.withdraw(20.0);
        System.out.println( ba.getBalance() );
        
        BankAccount cd = new BankAccount("qwerty", 832.76);
        //BankAccount ef = new BankAccount(3634.23);
    }
}