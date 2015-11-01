public class BankAccount
{
    // instance variables
    private String password;
    private double balance;
    
    // constructors
    public BankAccount()
    {
        password = "abcd";
        balance = 0.0;
    }
    
    public BankAccount(String p, double b)
    {
        password = p;
        balance = b;
    }
    
    // accessor methods
    public double getBalance()
    {
        return balance;
    }
    
    // mutator methods
    public void deposit(double credit)
    {
        balance = balance + credit;
    }
    
    public void withdraw(double debit)
    {
        balance = balance - debit;
    }
    
    public void changePassword(String pw)
    {
        password = pw;
    }
}