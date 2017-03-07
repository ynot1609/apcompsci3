public class Spelman implements College
{
    // instance variables
    private int tuition;
    
    // constructors
    public Spelman(int t)
    {
        tuition = t;
    }
    
    // accessor methods
    public String getName()
    {
        return "Spelman";
    }
    
    public String getRegion()
    {
        return "Southeast";
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