public class Trio implements MenuItem
{
    // YOUR CODE HERE
    // instance variables
    private Sandwich reuben;
    private Salad caesar;
    private Drink beverage;
    
    // constructors
    public Trio(Sandwich sand, Salad sal, Drink dr)
    {
        reuben = sand;
        caesar = sal;
        beverage = dr;
    }
    
    // abstract methods overridden
    public String getName()
    {
        String result = "";
        result += reuben.getName() + "/";
        result += caesar.getName() + "/";
        result += beverage.getName();
        result += " Trio";
        return result;
    }
    
    public double getPrice()
    {
        
    }
    
    
    
    
}
