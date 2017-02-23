public class Lock
{
    // instance variables
    private boolean locked;
    
    // constructors
    public Lock()
    {
        locked = true;
    }
    
    // accessor methods
    public boolean isLocked()
    {
        return locked;
    }
    
    // mutator methods
    public void open()
    {
        locked = false;
    }
    
    public void close()
    {
        locked = true;
    }
    
    // toString method
    public String toString()
    {
        if (locked == false)
        {
            return "Lock is open.";
        }
        else
        {
            return "Lock is closed.";
        }        
    }
}