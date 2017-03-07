public class Dartmouth implements College
{
    // instance variables
    private int tuition;
    
    // constructors
    public Dartmouth(int t)
    {
        tuition = t;
    }
    
    // accessor methods
    public String getName()
    {
        return "Dartmouth College";
    }
    
    public String getRegion()
    {
        return "Northeast";
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