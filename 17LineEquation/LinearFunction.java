public class LinearFunction implements LinearFunctionMethods
{
    // instance variables
    private double slope;
    private double intercept;
    
    // constructors
    public LinearFunction(double s, double i)
    {
        slope = s;
        intercept = i;
    }
    
    public double getSlope()
    {
        return slope;
    }
    
    public double getYintercept()
    {
        return intercept;
    }
    
    public double getRoot()
    {
        return -1.0*intercept/slope;
    }
    
    public double getYvalue(double x)
    {
        return 1.0*slope*x + intercept;
    }
    
    public double getXvalue(double y)
    {
        return 0.0;
    }
    
}