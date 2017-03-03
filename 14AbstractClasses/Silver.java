public class Silver extends Donation
{
    private String club;
    private double amount;
    
    public Silver(String name)
    {
        super(name);
        club = "Silver";
        amount = 100.0;
    }
    
    public String getClub()
    {
        return club;
    }
    
    public double getAmount()
    {
        return amount;
    }
}