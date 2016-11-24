public class Ticket
{
    // instance variables
    private String category;
    private double price;
    
    // constructors
    public Ticket(String c, double p)
    {
        category = c;
        price = p;
    }
    
    // accessor methods
    public String getCategory()
    {
        return category;
    }
    
    public double getPrice()
    {
        return price;
    }
}