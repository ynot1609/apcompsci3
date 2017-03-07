public class FloridaInternational implements College
{
    // instance variables
    private int tuition;
    
    // constructors
    public FloridaInternational(int t)
    {
        tuition = t;
    }
    
    // accessor methods
    public String getName()
    {
        return "Florida International University";
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