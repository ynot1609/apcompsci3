public class Stanford implements College
{
    // instance variables
    private int tuition;
    
    // constructors
    public Stanford(int t)
    {
        tuition = t;
    }
    
    // accessor methods
    public String getName()
    {
        return "Stanford University";
    }
    
    public String getRegion()
    {
        return "West";
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