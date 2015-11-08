public class APLine
{
    // instance variables
    private int a;
    private int b;
    private int c;
    
    // constructors
    public APLine(int mya, int myb, int myc)
    {
        a = mya;
        b = myb;
        c = myc;
    }
    
    // accessor methods
    public double getSlope()
    {
        double result = 0;
        result = (-1.0)*a/b;
        return result;
    }
    public boolean isOnLine(int x, int y)
    {
        int slope = 0;
        slope = a*x + b*y + c;
        if (slope == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}


