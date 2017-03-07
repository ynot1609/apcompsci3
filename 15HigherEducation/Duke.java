public class Duke implements College
{
    // instance variables
    private int tuition;
    
    // constructors
    public Duke(int t)
    {
        tuition = t;
    }
    
    // accessor methods
    public String getName()
    {
        return "Duke University";
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