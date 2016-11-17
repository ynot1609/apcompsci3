public class APLine
{
    // instance variables
    private int a;
    private int b;
    private int c;
    
    // constructors
    public APLine(int aval, int bval, int cval)
    {
        a = aval;
        b = bval;
        c = cval;
    }
    
    // accessor methods
    public double getSlope()
    {
        double result = 0.0;
        result = (-1.0)*a/b;
        return result;
    }
    
    public boolean isOnLine(int x, int y)
    {
        int outcome = 0;
        outcome = a*x + b*y + c;
        if (outcome == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String toString()
    {
        String result = "";
        result += "Slope = " + getSlope();
        return result;
        
    }
}