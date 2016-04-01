public class BankAccount
{
    // instance variables
    public double balance;
    
    // constructors
    public BankAccount()
    {
        balance = 100;
    }
    
    public BankAccount(double amt)
    {
        balance = amt;
    }
    
    // accessor methods
    public double getBalance()
    {
        return balance;
    }
    
    // mutator methods
    public void deposit(double d)
    {
        balance += d;
    }
    
    public void withdraw(double w)
    {
        balance -= w;
    }
}