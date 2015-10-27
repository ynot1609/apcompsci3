public class Bicycle
{
    // instance variables
    private int speed;
    private int gear;
    
    // constructors
    public Bicycle()
    {
        speed = 0;
        gear = 1;
    }
    
    public Bicycle(int s, int g)
    {
        speed = s;
        gear = g;
    }
    
    // accessor methods
    public int getSpeed()
    {
        return speed;
    }
    public int getGear()
    {
        return gear;
    }
    
    // mutator methods
    public void setSpeed(int sp)
    {
        speed = sp;
    }
    
    public void setGear(int ge)
    {
        gear = ge;
    }
}