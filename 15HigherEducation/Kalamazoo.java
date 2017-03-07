public class Kalamazoo implements College
{
    // instance variables
    private int tuition;
    
    // constructors
    public Kalamazoo(int t)
    {
        tuition = t;
    }
    
    // accessor methods
    public String getName()
    {
        return "Kalamazoo College";
    }
    
    public String getRegion()
    {
        return "Midwest";
    }
    
    public int getTuition()
    {
        return tuition;
    }
    
    // mutator methods
    public void setTuition(int newTuition)
    {
        tuition = newTuition;
    }
}