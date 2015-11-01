public class Recipe
{
    // instance variables
    private String name;
    private double cost;
    private int calories;
    
    // constructors
    public Recipe()
    {
        name = "Food";
        cost = 0.0;
        calories = 0;
    }
    
    public Recipe(String n, double c, int cal)
    {
        name = n;
        cost = c;
        calories = cal;
    }
    
    // accessor methods
    public double getCost()
    {
        return cost;
    }
    
    public double pricePerCalorie()
    {
        double price = 0.0;
        price = cost/calories;
        return price;
    }
    
    // mutator methods
    public void changeCost(double amount)
    {
        cost = amount;
    }
}
