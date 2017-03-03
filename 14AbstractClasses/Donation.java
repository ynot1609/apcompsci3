public abstract class Donation
{
    private String donorName;
    
    public Donation(String name)
    {
        donorName = name;
    }
    
    public String toString()
    {
        String result = "";
        result += "Donor name: " + donorName + "\n";
        result += "Donation Club: " + getClub() + "\n";
        result += "Donation Amount: " + getAmount() + "\n";
        return result;
    }
    
    public abstract String getClub();
    
    public abstract double getAmount();
}