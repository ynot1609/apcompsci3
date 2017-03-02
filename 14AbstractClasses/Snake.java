public class Snake extends Pet
{
    // instance variables
    private int length;
    
    // constructors
    public Snake(String n, int len)
    {
        super(n);
        length = len;
    }
    
    // accessor methods
    public int getLength()
    {
        return length;
    }
    
    public String toString()
    {
        String result = "";
        result += super.toString() + "\n";
        result += "is a snake";
        result += "length: " + length + "\n";
        return result;
    }
    
    public String speak()
    {
        return "hiss";
    }
    
    public String move()
    {
        return "slither";
    }
}