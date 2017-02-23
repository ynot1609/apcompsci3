public class CombinationLock extends Lock
{
    // instance variables
    private String combination;
    
    // constructors
    public CombinationLock()
    {
        super();
        combination = "";
    }
    
    public CombinationLock(String c)
    {
        super();
        combination = c;
    }
    
    // accessor methods
    public String getCombination()
    {
        return combination;
    }
    
    // mutator methods
    public void setCombination(String c)
    {
        combination = c;
    }
    
    public void open(String digits)
    {
        if (combination.equals(digits))
        {
            super.open();
        }
        else
        {
            System.out.println("Incorrect combination");
        }
    }
    
    public String toString()
    {
        String result = "";
        result += super.toString() + "\n";
        result += "Combination is: " + combination + "\n";
        return result;
    }
}