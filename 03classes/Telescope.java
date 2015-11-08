public class Telescope
{
    // instance variables
    private double diameter;
    private double mainlens;
    private double eyepiece;
    
    // constructors
    public Telescope()
    {
        diameter = 0.0;
        mainlens = 0.0;
        eyepiece = 0.0;
    }
    public Telescope(double d, double m, double e)
    {
        diameter = d;
        mainlens = m;
        eyepiece = e;
    }
    // accessor methods
    public double magnification()
    {
        double mag = 0.0;
        mag = mainlens/eyepiece;
        return mag;
    }
    public double fNumber()
    {
        double fNum = 0.0;
        fNum = mainlens/diameter;
        return fNum;
    }
}