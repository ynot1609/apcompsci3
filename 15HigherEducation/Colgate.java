public class Colgate implements College
{
    // instance variables
    private int tuition;
    
    // constructors
    public Colgate(int t)
    {
        tuition = t;
    }
    
    // accessor methods
    public String getName()
    {
        return "Colgate University";
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